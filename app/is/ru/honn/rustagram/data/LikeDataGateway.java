package is.ru.honn.rustagram.data;

import is.ru.honn.rustagram.domain.Like;
import is.ruframework.data.RuDataAccess;

import java.util.List;


public interface LikeDataGateway extends RuDataAccess {
    public int addLikeOnImage(Like like);
    public List<Like> getLikesOnImage(int imageId);
}
