
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[is.ru.honn.rustagram.domain.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[is.ru.honn.rustagram.domain.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(title = "Login", nav = "login")/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.Users.processSignupForm)/*7.58*/ {_display_(Seq[Any](format.raw/*7.60*/("""
        <fieldset>
            <legend>Login details</legend>
            """),_display_(Seq[Any](/*10.14*/inputText(
                signupForm("username"),
                '_label -> "Username",
                '_error -> signupForm.globalError
            ))),format.raw/*14.14*/("""
            """),_display_(Seq[Any](/*15.14*/inputText(
                signupForm("displayName"),
                '_label -> "Display name"
            ))),format.raw/*18.14*/("""
            """),_display_(Seq[Any](/*19.14*/inputPassword(
                signupForm("password"),
                '_label -> "Password"
            ))),format.raw/*22.14*/("""
            """),_display_(Seq[Any](/*23.14*/inputPassword(
                signupForm("repeatPassword"),
                '_label -> "Repeat password"
            ))),format.raw/*26.14*/("""
            """),_display_(Seq[Any](/*27.14*/inputText(
                signupForm("email"),
                '_label -> "Email"
            ))),format.raw/*30.14*/("""
            """),_display_(Seq[Any](/*31.14*/inputDate(
                signupForm("date"),
                '_label -> "Date"
            ))),format.raw/*34.14*/("""
        </fieldset>

        <div class="actions">
            <input type="submit" class="btn primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*39.23*/routes/*39.29*/.Application.index)),format.raw/*39.47*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*41.6*/("""
""")))})))}
    }
    
    def render(signupForm:Form[is.ru.honn.rustagram.domain.User]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[is.ru.honn.rustagram.domain.User]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 19:47:20 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/signup.scala.html
                    HASH: e8e88a141317a6779da7326f50eab3d1b0e39473
                    MATRIX: 807->1|1005->53|1035->110|1072->113|1116->149|1155->151|1196->158|1210->164|1264->210|1303->212|1418->291|1597->448|1648->463|1782->575|1833->590|1964->699|2015->714|2159->836|2210->851|2331->950|2382->965|2501->1062|2686->1211|2701->1217|2741->1235|2819->1282
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|36->7|36->7|36->7|36->7|39->10|43->14|44->15|47->18|48->19|51->22|52->23|55->26|56->27|59->30|60->31|63->34|68->39|68->39|68->39|70->41
                    -- GENERATED --
                */
            