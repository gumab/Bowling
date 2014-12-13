
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
object BowlingPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
     """),_display_(Seq[Any](/*25.7*/Navbar("Score"))),format.raw/*25.22*/("""

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Navbar example</h1>
        <p>This example is a quick exercise to illustrate how the default, static navbar and fixed to top navbar work. It includes the responsive CSS and HTML, so it also adapts to your viewport and device.</p>
        <p>
          <a class="btn btn-lg btn-primary" href="../../components/#navbar">View navbar docs &raquo;</a>
        </p>
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
                    DATE: Sun Dec 14 00:17:08 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/BowlingPage.scala.html
                    HASH: 734d774f2bf6e1d5e20123c871a7c29f1e0020a1
                    MATRIX: 643->2|957->280|972->286|1032->323|1121->376|1136->382|1197->421|1268->456|1283->462|1341->498|1396->517|1411->523|1478->568|1565->619|1580->625|1644->667|1824->812|1861->827
                    LINES: 22->3|32->13|32->13|32->13|33->14|33->14|33->14|34->15|34->15|34->15|35->16|35->16|35->16|36->17|36->17|36->17|44->25|44->25
                    -- GENERATED --
                */
            