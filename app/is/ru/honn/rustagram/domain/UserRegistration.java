package is.ru.honn.rustagram.domain;


import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: MrSmile
 * Date: 19.11.2013
 * Time: 21:55
 * Sole purpose of this class is to have the repeat password. So that a user of rustagram that is signing
 * up can confirm his password. when signing up
 */
public class UserRegistration extends User
{
    protected String repeatPassword;
    public UserRegistration()
    {
    }

    public UserRegistration(int id, String username, String password, String displayName, String email, Gender gender, Date registered,String repeatPassword)
    {
        //daem 12 : super(id, name, username, password, email);
        //actual: User(int id, String username, String password, String displayName, String email, Gender gender, Date registered)
        super(id,username,password,displayName,email,gender, registered);
        this.repeatPassword = repeatPassword;
    }

    public UserRegistration(String username, String password, String displayName, String email, Gender gender, String repeatPassword)
    {
        //daematimi 12: super(id, name, username, password, email);
        //actual: User(String username, String password, String displayName, String email, Gender gender)
        super(username,password,displayName,email,gender);
        this.repeatPassword = repeatPassword;
    }

    public String getRepeatPassword()
    {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword)
    {
        this.repeatPassword = repeatPassword;
    }
}