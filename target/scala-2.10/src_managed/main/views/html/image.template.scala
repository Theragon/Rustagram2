
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
object image extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[is.ru.honn.rustagram.models.ImagesViewModel,is.ru.honn.rustagram.domain.Image,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(imageModel: is.ru.honn.rustagram.models.ImagesViewModel, image: is.ru.honn.rustagram.domain.Image):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.api.Play.current


Seq[Any](format.raw/*1.101*/("""
<!--"""),_display_(Seq[Any](/*2.6*/(image: is.ru.honn.rustagram.domain.Image))),format.raw/*2.48*/("""-->

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(title = "Welcome")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
<!--    <div>
        <p>"""),_display_(Seq[Any](/*8.13*/image/*8.18*/.getCreatorUsername)),format.raw/*8.37*/("""</p>
        <img src=""""),_display_(Seq[Any](/*9.20*/image/*9.25*/.getUrl)),format.raw/*9.32*/("""">
        <p>"""),_display_(Seq[Any](/*10.13*/image/*10.18*/.getDescription)),format.raw/*10.33*/("""</p>
    </div>
-->
    <div>
        <p>"""),_display_(Seq[Any](/*14.13*/imageModel/*14.23*/.getCreator)),format.raw/*14.34*/("""</p>
        <img src=""""),_display_(Seq[Any](/*15.20*/imageModel/*15.30*/.getUrl)),format.raw/*15.37*/("""" id=""""),_display_(Seq[Any](/*15.44*/imageModel/*15.54*/.getId)),format.raw/*15.60*/("""" class="image">
        <p>"""),_display_(Seq[Any](/*16.13*/imageModel/*16.23*/.getDescription)),format.raw/*16.38*/("""</p>
        <textarea id="commentText">

        </textarea>
        <button class="btn" id="comment" value="Comment">Comment</button>
<!--        <a href="#" class="comment" id=""""),_display_(Seq[Any](/*21.46*/imageModel/*21.56*/.getId)),format.raw/*21.62*/(""""><p id="comment">Comment</p></a> -->
        <a href="#"><p>Like</p></a>
    </div>
""")))})))}
    }
    
    def render(imageModel:is.ru.honn.rustagram.models.ImagesViewModel,image:is.ru.honn.rustagram.domain.Image): play.api.templates.HtmlFormat.Appendable = apply(imageModel,image)
    
    def f:((is.ru.honn.rustagram.models.ImagesViewModel,is.ru.honn.rustagram.domain.Image) => play.api.templates.HtmlFormat.Appendable) = (imageModel,image) => apply(imageModel,image)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 18:38:56 GMT 2013
                    SOURCE: /home/logan/GitRepository/Rustagram/app/views/image.scala.html
                    HASH: 53e38f3583e9829fe2774d879186da111ecff61c
                    MATRIX: 845->1|1068->100|1108->106|1171->148|1202->183|1238->185|1269->208|1308->210|1370->237|1383->242|1423->261|1482->285|1495->290|1523->297|1574->312|1588->317|1625->332|1703->374|1722->384|1755->395|1815->419|1834->429|1863->436|1906->443|1925->453|1953->459|2018->488|2037->498|2074->513|2291->694|2310->704|2338->710
                    LINES: 26->1|30->1|31->2|31->2|33->5|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|49->21|49->21|49->21
                    -- GENERATED --
                */
            