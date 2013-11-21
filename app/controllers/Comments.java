package controllers;

import play.mvc.*;
import views.html.home;

/**
 * Created with IntelliJ IDEA.
 * User: logan
 * Date: 11/21/13
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Comments extends AbstractRustagramController
{
    public static Result updateComments(int imageId)
    {
        return redirect(""+imageId);
    }
}
