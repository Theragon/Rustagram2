
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
                    DATE: Thu Nov 21 19:47:20 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/home.scala.html
                    HASH: b174e9e09b5489e02102857117da5d5af1522561
                    MATRIX: 806->1|979->50|1009->85|1046->88|1077->111|1116->113|1196->159|1232->187|1271->189|1413->295|1428->301|1473->324|1558->373|1573->379|1617->401|1669->436|1682->441|1721->442|1796->481|1846->509|2004->631|2040->651|2080->653|2177->714|2191->719|2232->738|2312->782|2326->787|2354->793|2403->806|2417->811|2446->818|2514->850|2528->855|2565->870|2746->1019|2802->1044
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|45->17|47->19|47->19|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|55->27|55->27|55->27|56->28|56->28|56->28|60->32|62->34
                    -- GENERATED --
                */
            