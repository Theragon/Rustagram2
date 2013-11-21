package is.ru.honn.rustagram.data;

import is.ru.honn.rustagram.domain.Like;
import is.ru.honn.rustagram.service.ImageNotFoundException;
import is.ru.honn.rustagram.service.UserNotFoundException;
import is.ruframework.data.RuData;
import is.ruframework.data.RuDuplicateDataException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Heimir
 * Date: 21.11.2013
 * Time: 20:12
 * To change this template use File | Settings | File Templates.
 */
public class LikeData extends RuData implements LikeDataGateway {

    @Override
    public int addLikeOnImage(Like like) {
        SimpleJdbcInsert insert =
                new SimpleJdbcInsert(getDataSource())
                        .withTableName("ru_likes")
                        .usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<String, Object>(3);
        parameters.put("creator_username", like.getCreatorUsername());
        parameters.put("image_id", like.getImageId());

        int returnKey;

        try
        {
            returnKey = insert.executeAndReturnKey(parameters).intValue();
        }
        catch(DataIntegrityViolationException divex)
        {
            // This means that we're either referencing a non existent image_id or username.

            // ... and now for a butt-ugly hack to figure out which one it is...
            if( divex.getMessage().contains("table \"hshstefan.ru_users\", column 'username'") ){
                throw new UserNotFoundException("No user found with username: " + like.getCreatorUsername(), divex);
            }
            else if( divex.getMessage().contains("table \"hshstefan.ru_images\", column 'id'") ){
                throw new ImageNotFoundException("No image found with id: " + like.getImageId(), divex);
            }

            throw new RuDuplicateDataException("A duplicate image ID was found. This is weird and should never happen.", divex);
        }

        like.setId(returnKey);
        return returnKey;
    }

    @Override
    public List<Like> getLikesOnImage(int imageId) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        List<Like> likes = (List<Like>)jdbcTemplate.query(
                "select * from ru_likes where image_id=?", new LikeRowMapper(), imageId);
        return likes;
    }

}
