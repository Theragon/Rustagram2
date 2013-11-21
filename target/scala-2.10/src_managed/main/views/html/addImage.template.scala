
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
object addImage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[is.ru.honn.rustagram.domain.Image],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(addImageForm: Form[is.ru.honn.rustagram.domain.Image]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(title = "Login", nav = "login")/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.Images.processImageForm)/*7.58*/ {_display_(Seq[Any](format.raw/*7.60*/("""
        <fieldset>
            <legend>Add new image</legend>
            """),_display_(Seq[Any](/*10.14*/inputText(
                addImageForm("url"),
                '_label -> "URL",
                '_error -> addImageForm.globalError
            ))),format.raw/*14.14*/("""
            """),_display_(Seq[Any](/*15.14*/inputText(
                addImageForm("description"),
                '_label -> "Description"
            ))),format.raw/*18.14*/("""
        </fieldset>

        <div class="actions">
            <input type="submit" class="btn primary" value="Add Image">
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.index)),format.raw/*23.47*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*25.6*/("""
""")))})))}
    }
    
    def render(addImageForm:Form[is.ru.honn.rustagram.domain.Image]): play.api.templates.HtmlFormat.Appendable = apply(addImageForm)
    
    def f:((Form[is.ru.honn.rustagram.domain.Image]) => play.api.templates.HtmlFormat.Appendable) = (addImageForm) => apply(addImageForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 19:47:20 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/addImage.scala.html
                    HASH: 3b1e27d04ecc5108d1e6a7767ba2c4f714c37647
                    MATRIX: 810->1|1011->56|1041->113|1078->116|1122->152|1161->154|1202->161|1216->167|1270->213|1309->215|1424->294|1597->445|1648->460|1783->573|1970->724|1985->730|2025->748|2103->795
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|36->7|36->7|36->7|36->7|39->10|43->14|44->15|47->18|52->23|52->23|52->23|54->25
                    -- GENERATED --
                */
            