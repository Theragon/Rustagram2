package controllers;

import is.ru.honn.rustagram.domain.Image;
import is.ru.honn.rustagram.models.ImagesViewModel;
import is.ru.honn.rustagram.service.RustagramService;
import play.data.Form;

import play.data.*;
import play.mvc.*;

import views.html.addImage;
import views.html.home;
import views.html.image;

import static play.data.Form.form;

/**
 * Created with IntelliJ IDEA.
 * User: logan
 * Date: 11/21/13
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Images extends AbstractRustagramController
{
    final static Form<Image> addImageForm = form(Image.class);

    public static Result showImageForm(){
        return ok(addImage.render(addImageForm)); //TODO: implement
    }

    public static Result processImageForm(){
        Form<Image> filledForm = addImageForm.bindFromRequest();

        RustagramService service = (RustagramService) ctx.getBean("service");

        String url = filledForm.field("url").value();
        String description = filledForm.field("description").value();

//        String creator = session().get("displayName");
        String creator = session().get("username");

        service.createImage(creator, url, description);

        return redirect("home");
    }

    public static Result showImage(int id)
    {
        RustagramService service = (RustagramService) ctx.getBean("service");

        Image imageObj = service.getImage(id);

        ImagesViewModel imageModel = new ImagesViewModel(imageObj.getId(), imageObj.getCreatorUsername(), imageObj.getCreated(),
                imageObj.getUrl(), imageObj.getDescription());

        imageModel.setComments(service.getCommentsOnImage(id));

        imageModel.setLikes(service.getLikesOnImage(id));

        return ok(image.render(imageModel, imageObj));
    }


}
