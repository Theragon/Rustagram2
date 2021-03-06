
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
        <p>Likes: """),_display_(Seq[Any](/*17.20*/imageModel/*17.30*/.getLikesOnImage)),format.raw/*17.46*/("""</p>
        <textarea id="commentText">

        </textarea>
        <button class="btn" id="comment" value="Comment">Comment</button>
        <button class="btn" id="like" value="Like">Like</button>
<!--        <a href="#" class="comment" id=""""),_display_(Seq[Any](/*23.46*/imageModel/*23.56*/.getId)),format.raw/*23.62*/(""""><p id="comment">Comment</p></a> -->
<!--        <a href="#"><p>Like</p></a> -->
    </div>
""")))})))}
    }
    
    def render(imageModel:is.ru.honn.rustagram.models.ImagesViewModel,image:is.ru.honn.rustagram.domain.Image): play.api.templates.HtmlFormat.Appendable = apply(imageModel,image)
    
    def f:((is.ru.honn.rustagram.models.ImagesViewModel,is.ru.honn.rustagram.domain.Image) => play.api.templates.HtmlFormat.Appendable) = (imageModel,image) => apply(imageModel,image)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 21:01:32 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/image.scala.html
                    HASH: ed5c6103f9c1a3cf5ea988594fdfce556a352df3
                    MATRIX: 845->1|1069->100|1110->107|1173->149|1206->187|1243->190|1274->213|1313->215|1377->244|1390->249|1430->268|1490->293|1503->298|1531->305|1583->321|1597->326|1634->341|1716->387|1735->397|1768->408|1829->433|1848->443|1877->450|1920->457|1939->467|1967->473|2033->503|2052->513|2089->528|2150->553|2169->563|2207->579|2495->831|2514->841|2542->847
                    LINES: 26->1|30->1|31->2|31->2|33->5|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|51->23|51->23|51->23
                    -- GENERATED --
                */
            