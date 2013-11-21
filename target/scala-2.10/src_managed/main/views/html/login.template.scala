
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[is.ru.honn.rustagram.domain.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[is.ru.honn.rustagram.domain.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(title = "Login", nav = "login")/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.Users.processLoginForm)/*7.57*/ {_display_(Seq[Any](format.raw/*7.59*/("""
        <fieldset>
            <legend>Login details</legend>
            """),_display_(Seq[Any](/*10.14*/inputText(
                signupForm("username"),
                '_label -> "Username",
                '_error -> signupForm.globalError
            ))),format.raw/*14.14*/("""
            """),_display_(Seq[Any](/*15.14*/inputPassword(
                signupForm("password"),
                '_label -> "Password"
            ))),format.raw/*18.14*/("""
        </fieldset>

        <div class="actions">
            <input type="submit" class="btn primary" value="Login">
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.index)),format.raw/*23.47*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*25.6*/("""
""")))})))}
    }
    
    def render(signupForm:Form[is.ru.honn.rustagram.domain.User]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[is.ru.honn.rustagram.domain.User]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 19:47:20 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/login.scala.html
                    HASH: 88da13e100812ed031a8c80b835c2e0040eb53e9
                    MATRIX: 806->1|1004->53|1034->110|1071->113|1115->149|1154->151|1195->158|1209->164|1262->209|1301->211|1416->290|1595->447|1646->462|1777->571|1960->718|1975->724|2015->742|2093->789
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|36->7|36->7|36->7|36->7|39->10|43->14|44->15|47->18|52->23|52->23|52->23|54->25
                    -- GENERATED --
                */
            