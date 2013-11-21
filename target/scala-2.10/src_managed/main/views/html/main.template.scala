
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
                    DATE: Thu Nov 21 17:53:36 GMT 2013
                    SOURCE: /home/logan/GitRepository/Rustagram/app/views/main.scala.html
                    HASH: 312db934d40ba1c9cc9a0d9c5ca5d00cfc53369b
                    MATRIX: 785->1|939->61|1097->184|1111->190|1171->229|1267->290|1281->296|1334->328|1395->353|1410->359|1477->404|1570->461|1585->467|1643->503|1881->705|1896->711|1938->731|1977->734|2004->739|2107->806|2143->833|2183->835|2295->911|2310->917|2355->940|2516->1065|2531->1071|2568->1086|2659->1159|2672->1164|2711->1165|2788->1206|2842->1238|2923->1283|2938->1289|2983->1312|3107->1400|3160->1431|3241->1476|3256->1482|3300->1504|3403->1575|3659->1795|3686->1800|3848->1926|3877->1933
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|47->19|47->19|47->19|49->21|49->21|49->21|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|56->28|56->28|56->28|58->30|58->30|59->31|59->31|59->31|61->33|72->44|72->44|77->49|77->49
                    -- GENERATED --
                */
            