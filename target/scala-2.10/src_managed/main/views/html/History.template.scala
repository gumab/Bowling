
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
object History extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html>
	<head>
		
		<meta charset="utf-8">
   		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<meta name="description" content="">
   		<meta name="author" content="">
<!--

        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/ebay_bowling.png"))),format.raw/*13.102*/("""">-->
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.48*/routes/*14.54*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*14.93*/("""">
		<link rel="stylesheet" href=""""),_display_(Seq[Any](/*15.33*/routes/*15.39*/.Assets.at("stylesheets/navbar.css"))),format.raw/*15.75*/("""">
		<script src=""""),_display_(Seq[Any](/*16.17*/routes/*16.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*16.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*17.65*/("""" type="text/javascript"></script>
		<title>Signin Page</title>
	</head>
	<body>
		<div class="container">
      <!-- Static navbar -->
     """),_display_(Seq[Any](/*23.7*/Navbar("History"))),format.raw/*23.24*/("""

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
        """),_display_(Seq[Any](/*27.10*/FinishedTable(true,"0123012301230123012XX"))),format.raw/*27.53*/("""
        """),_display_(Seq[Any](/*28.10*/FinishedTable(false,"0123012301230123012X"))),format.raw/*28.53*/("""
        """),_display_(Seq[Any](/*29.10*/FinishedTable(false,"0123012301230123012X"))),format.raw/*29.53*/("""
        """),_display_(Seq[Any](/*30.10*/FinishedTable(false,"0123012301230123012X"))),format.raw/*30.53*/("""
        """),_display_(Seq[Any](/*31.10*/FinishedTable(true,"0123012301230123012XX"))),format.raw/*31.53*/("""
        """),_display_(Seq[Any](/*32.10*/FinishedTable(true,"0123012301230123012XX"))),format.raw/*32.53*/("""
        """),_display_(Seq[Any](/*33.10*/FinishedTable(true,"0123012301230123012XX"))),format.raw/*33.53*/("""
        
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	</body>
</html>

"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 14 11:00:21 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/History.scala.html
                    HASH: 0451198586c536073d3ee739fab0d3c04f16d138
                    MATRIX: 639->2|953->280|968->286|1028->323|1117->376|1132->382|1193->421|1264->456|1279->462|1337->498|1392->517|1407->523|1474->568|1561->619|1576->625|1640->667|1817->809|1856->826|2013->947|2078->990|2124->1000|2189->1043|2235->1053|2300->1096|2346->1106|2411->1149|2457->1159|2522->1202|2568->1212|2633->1255|2679->1265|2744->1308
                    LINES: 22->3|32->13|32->13|32->13|33->14|33->14|33->14|34->15|34->15|34->15|35->16|35->16|35->16|36->17|36->17|36->17|42->23|42->23|46->27|46->27|47->28|47->28|48->29|48->29|49->30|49->30|50->31|50->31|51->32|51->32|52->33|52->33
                    -- GENERATED --
                */
            