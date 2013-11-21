
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String = "Welcome", nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Rustagram</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/scripts.js"))),format.raw/*11.65*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*17.45*/routes/*17.51*/.Application.index())),format.raw/*17.71*/("""">"""),_display_(Seq[Any](/*17.74*/title)),format.raw/*17.79*/("""</a>
                    <ul class="nav">
                        """),_display_(Seq[Any](/*19.26*/if(session.get("username"))/*19.53*/ {_display_(Seq[Any](format.raw/*19.55*/("""
                            <li>
                                <a href=""""),_display_(Seq[Any](/*21.43*/routes/*21.49*/.Images.showImageForm())),format.raw/*21.72*/("""">Add Image</a>
                            </li>
                            <li>
                                <a href=""""),_display_(Seq[Any](/*24.43*/routes/*24.49*/.Users.logout())),format.raw/*24.64*/("""">Logout</a>
                            </li>
                        """)))}/*26.27*/else/*26.32*/{_display_(Seq[Any](format.raw/*26.33*/("""
                            <li class=""""),_display_(Seq[Any](/*27.41*/("active".when(nav == "signup")))),format.raw/*27.73*/("""">
                                <a href=""""),_display_(Seq[Any](/*28.43*/routes/*28.49*/.Users.showSignupForm())),format.raw/*28.72*/("""">Sign up</a>
                            </li>
                            <li class=""""),_display_(Seq[Any](/*30.41*/("active".when(nav == "login")))),format.raw/*30.72*/("""">
                                <a href=""""),_display_(Seq[Any](/*31.43*/routes/*31.49*/.Users.showLoginForm())),format.raw/*31.71*/("""">Login</a>
                            </li>
                        """)))})),format.raw/*33.26*/("""
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">

                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*44.26*/title)),format.raw/*44.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                    """),_display_(Seq[Any](/*49.22*/content)),format.raw/*49.29*/("""
                    </div>
                </div>

            </div>

            <footer>
                <p>
                    Built with: <a href="http://www.playframework.org">www.playframework.org</a>
                </p>
            </footer>

        </div>

    </body>
</html>
"""))}
    }
    
    def render(title:String,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 21 19:47:20 GMT 2013
                    SOURCE: C:/GitHub/Rustagram2/app/views/main.scala.html
                    HASH: 44189fbf908070605e21cb16aed24cb4aadf1479
                    MATRIX: 785->1|939->61|1104->191|1118->197|1178->236|1275->298|1289->304|1342->336|1404->362|1419->368|1486->413|1580->471|1595->477|1653->513|1897->721|1912->727|1954->747|1993->750|2020->755|2125->824|2161->851|2201->853|2315->931|2330->937|2375->960|2539->1088|2554->1094|2591->1109|2684->1184|2697->1189|2736->1190|2814->1232|2868->1264|2950->1310|2965->1316|3010->1339|3136->1429|3189->1460|3271->1506|3286->1512|3330->1534|3435->1607|3702->1838|3729->1843|3896->1974|3925->1981
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|47->19|47->19|47->19|49->21|49->21|49->21|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|56->28|56->28|56->28|58->30|58->30|59->31|59->31|59->31|61->33|72->44|72->44|77->49|77->49
                    -- GENERATED --
                */
            