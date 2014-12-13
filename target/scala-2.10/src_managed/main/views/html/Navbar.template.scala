
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object Navbar extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(nav:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""
 <div class="navbar navbar-default">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <img class="imgclass" src=""""),_display_(Seq[Any](/*9.39*/routes/*9.45*/.Assets.at("images/ebay_bowling.png"))),format.raw/*9.82*/("""" height="40px" class="navbar-brand" href=""></a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            
            <li class=""""),_display_(Seq[Any](/*14.25*/("active".when(nav == "Game")))),format.raw/*14.55*/(""""><a href="/bowling">Gameboard</a></li>
            <li class=""""),_display_(Seq[Any](/*15.25*/("active".when(nav == "Rule")))),format.raw/*15.55*/(""""><a href="/rule">Game rule</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">My menu <span class="glyphicon glyphicon-user"/> <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li class=""""),_display_(Seq[Any](/*21.29*/("active".when(nav == "History")))),format.raw/*21.62*/(""""><a href="history">Game history</a></li>
                <li><a href="#">Sign Out</a></li>
                <li class="divider"></li>
                <li class="dropdown-header">Account setting</li>
                <li><a href="#">Change password</a></li>
                <li><a href="#">Close account</a></li>
              </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>"""))}
    }
    
    def render(nav:String): play.api.templates.HtmlFormat.Appendable = apply(nav)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (nav) => apply(nav)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 14 00:48:24 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/Navbar.scala.html
                    HASH: 53b84bc2d533355d90c9eedd73df027694a4d47f
                    MATRIX: 557->1|663->13|1068->383|1082->389|1140->426|1363->613|1415->643|1515->707|1567->737|1958->1092|2013->1125
                    LINES: 19->1|22->1|30->9|30->9|30->9|35->14|35->14|36->15|36->15|42->21|42->21
                    -- GENERATED --
                */
            