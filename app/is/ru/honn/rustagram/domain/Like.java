package is.ru.honn.rustagram.domain;

import java.util.Date;

public class Like extends RustagramObject{
    private int id;
    private int imageId;

    public Like() {}

    public Like(String creator, int imageId) {
        super(creator);
        this.imageId = imageId;
    }

    public Like(int id, String creator, int imageId)
    {
        super(creator);
        this.id = id;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
