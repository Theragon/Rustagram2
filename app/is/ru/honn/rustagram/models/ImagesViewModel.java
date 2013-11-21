package is.ru.honn.rustagram.models;

import is.ru.honn.rustagram.domain.Comment;
import is.ru.honn.rustagram.domain.Like;
import is.ru.honn.rustagram.service.RustagramService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: logan
 * Date: 11/21/13
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImagesViewModel
{
    protected int id;
    protected String creator;
    protected Date created;
    protected String url;

    public List<Comment> comments = new ArrayList<Comment>();
    public List<Like> likes = new ArrayList<Like>();

    public int getLikesOnImage() {
        return likes.size();
    }

    public void setLikes(List<Like> likes)
    {
        this.likes = likes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Comment> getComments()
    {
        return this.comments;
    }

    public void setComments(List<Comment> comments)
    {
        this.comments = comments;
    }

    protected String description;

    public ImagesViewModel(int id, String creator, Date created, String url, String description)
    {
        this.id = id;
        this.creator = creator;
        this.created = created;
        this.url = url;
        this.description = description;
    }
}
