
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[is.ru.honn.rustagram.domain.Image],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(images: List[is.ru.honn.rustagram.domain.Image]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.api.Play.current


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title = "Welcome")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    <h2>Welcome to Rustagram</h2>

    """),_display_(Seq[Any](/*9.6*/if(!session.get("username"))/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""

        <h3>Looks like you're new here! Welcome!</h3>
        <p>
            <a class="btn" href=""""),_display_(Seq[Any](/*13.35*/routes/*13.41*/.Users.showSignupForm())),format.raw/*13.64*/("""">Sign up</a>
            <a class="btn" href=""""),_display_(Seq[Any](/*14.35*/routes/*14.41*/.Users.showLoginForm())),format.raw/*14.63*/("""">Login</a>
        </p>

    """)))}/*17.7*/else/*17.12*/{_display_(Seq[Any](format.raw/*17.13*/("""

        <h3>Good to see you again """),_display_(Seq[Any](/*19.36*/{session.get("displayName")})),format.raw/*19.64*/("""!</h3>

        <h4>Here should be a list of images from the people I'm following</h4>

        <table>
            """),_display_(Seq[Any](/*24.14*/for(image <- images) yield /*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
                <div id="image">
                    <h5>"""),_display_(Seq[Any](/*26.26*/image/*26.31*/.getCreatorUsername)),format.raw/*26.50*/("""</h5>
                    <a href="/image/"""),_display_(Seq[Any](/*27.38*/image/*27.43*/.getId)),format.raw/*27.49*/(""""><img src=""""),_display_(Seq[Any](/*27.62*/image/*27.67*/.getUrl)),format.raw/*27.74*/(""""></a>
                    <p>"""),_display_(Seq[Any](/*28.25*/image/*28.30*/.getDescription)),format.raw/*28.45*/("""</p>
<!--                    <a href=""><p>Comment</p></a>
                    <a href=""><p>Like</p></a>-->
                </div>
            """)))})),format.raw/*32.14*/("""
        </table>
    """)))})),format.raw/*34.6*/("""
""")))})))}
    }
    
    def render(images:List[is.ru.honn.rustagram.domain.Image]): play.api.templates.HtmlFormat.Appendable = apply(images)
    
    def f:((List[is.ru.honn.rustagram.domain.Image]) => play.api.templates.HtmlFormat.Appendable) = (images) => apply(images)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 15:55:43 GMT 2013
                    SOURCE: /home/logan/GitRepository/Rustagram/app/views/home.scala.html
                    HASH: 1e7098593d0eade18b7b927080758a0799b1c647
                    MATRIX: 806->1|978->50|1006->82|1042->84|1073->107|1112->109|1188->151|1224->179|1263->181|1401->283|1416->289|1461->312|1545->360|1560->366|1604->388|1653->420|1666->425|1705->426|1778->463|1828->491|1981->608|2017->628|2057->630|2152->689|2166->694|2207->713|2286->756|2300->761|2328->767|2377->780|2391->785|2420->792|2487->823|2501->828|2538->843|2715->988|2769->1011
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|45->17|47->19|47->19|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|55->27|55->27|55->27|56->28|56->28|56->28|60->32|62->34
                    -- GENERATED --
                */
            