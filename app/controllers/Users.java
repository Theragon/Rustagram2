package controllers;

import is.ru.honn.rustagram.domain.Gender;
import is.ru.honn.rustagram.domain.Image;
import is.ru.honn.rustagram.domain.User;
import is.ru.honn.rustagram.domain.UserRegistration;
import is.ru.honn.rustagram.service.RustagramService;

import is.ru.honn.rustagram.service.UserNotFoundException;
import is.ru.honn.rustagram.service.UsernameExistsException;
import play.cache.Cache;
import play.data.*;
import play.mvc.*;

import static play.data.Form.form;

import views.html.*;
import views.html.home;
import views.html.index;
import views.html.login;
import views.html.signup;
import views.html.signup_success;

import java.util.Date;
import java.util.List;

public class Users extends AbstractRustagramController {

    final static Form<User> loginForm = form(User.class);
    final static Form<User> signupForm = form(User.class);

    /*public static Result home(){
        return ok(home.render());
    }*/

    public static Result home(){
        RustagramService service = (RustagramService) ctx.getBean("service");

        List<Image> images = service.getAllImages();

        return ok(home.render(images));
    }

    public static Result list()
    {
        RustagramService service = (RustagramService) ctx.getBean("service");

        List<Image> images = service.getAllImages();

        return ok(home.render(images));
    }

    public static Result showSignupForm(){
        return ok(signup.render(signupForm)); //TODO: implement
    }

    public static Result processSignupForm(){
        Form<User> filledForm = signupForm.bindFromRequest();

        // We get the context from AbstractRustagramController
        RustagramService service = (RustagramService) ctx.getBean("service");

        String username = filledForm.field("username").value();
        String password = filledForm.field("password").value();
        String repeatPassword = filledForm.field("repeatPassword").value();
        String displayName = filledForm.field("displayName").value();
        String email = filledForm.field("email").value();

        if(password.length() < 4)
        {
            filledForm.reject("password", "Password has to be at least 4 characters in length");
            return badRequest(signup.render(filledForm));
        }

        else if(!password.equals(repeatPassword))
        {
            filledForm.reject("password", "Passwords must match");
            filledForm.reject("repeatPassword", "Passwords must match");
            return badRequest(signup.render(filledForm));
        }

        else
        {
            try
            {
                User user = service.userSignup(username, password, displayName, email);
            }
            catch (UsernameExistsException ueex)
            {
                filledForm.reject("username", "Username already exists");
                return badRequest(signup.render(filledForm));
            }
        }

	    return ok(login.render(loginForm)); //TODO: implement
    }

    public static Result showLoginForm(){
        return ok(login.render(loginForm));
    }

    public static Result processLoginForm(){
        Form<User> filledForm = loginForm.bindFromRequest();

        // We get the context from AbstractRustagramController
        RustagramService service = (RustagramService) ctx.getBean("service");

        try{
            User user = service.getUser(filledForm.field("username").value());
            if(!user.getPassword().equals(filledForm.field("password").value())){
                // Let's throw this exception here to use the same logic for
                // unsuccessful login (both username not found and incorrect
                // password.
                throw new UserNotFoundException();
            }

            // User was found and correct password entered.
            session("username", user.getUsername());
            session("displayName", user.getDisplayName());

        }
        catch(UserNotFoundException unfe){
            filledForm.reject("password", "User not found or incorrect password entered.");
            return badRequest(login.render(filledForm));
        }

        return home();
    }

    public static Result logout(){
        session().clear();
        return ok(index.render());
    }
}
