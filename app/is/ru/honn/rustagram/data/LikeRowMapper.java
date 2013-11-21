package is.ru.honn.rustagram.data;

import is.ru.honn.rustagram.domain.Like;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class LikeRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException
    {
        Like like = new Like(resultSet.getInt(1),               // id
                resultSet.getString(2),                         // creatorUsername
                resultSet.getInt(3));                           // imageId

        return like;
    }
}
