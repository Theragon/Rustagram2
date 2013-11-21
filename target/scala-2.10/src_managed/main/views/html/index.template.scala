
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.api.Play.current


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main(title = "Welcome")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    <h2>Welcome to Rustagram</h2>

    """),_display_(Seq[Any](/*7.6*/if(!session.get("username"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""

        <h3>Looks like you're new here! Welcome!</h3>
        <p>
            <a class="btn" href=""""),_display_(Seq[Any](/*11.35*/routes/*11.41*/.Users.showSignupForm())),format.raw/*11.64*/("""">Sign up</a>
            <a class="btn" href=""""),_display_(Seq[Any](/*12.35*/routes/*12.41*/.Users.showLoginForm())),format.raw/*12.63*/("""">Login</a>
        </p>

    """)))}/*15.7*/else/*15.12*/{_display_(Seq[Any](format.raw/*15.13*/("""

        <h3>Good to see you again """),_display_(Seq[Any](/*17.36*/{session.get("displayName")})),format.raw/*17.64*/("""!</h3>

    """)))})),format.raw/*19.6*/("""
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 19:47:20 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/index.scala.html
                    HASH: ddc3ef2db961fc3e76b8abce85d7cb814495fa6a
                    MATRIX: 885->31|922->34|953->57|992->59|1072->105|1108->133|1147->135|1289->241|1304->247|1349->270|1434->319|1449->325|1493->347|1545->382|1558->387|1597->388|1672->427|1722->455|1768->470
                    LINES: 30->2|31->3|31->3|31->3|35->7|35->7|35->7|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|43->15|45->17|45->17|47->19
                    -- GENERATED --
                */
            