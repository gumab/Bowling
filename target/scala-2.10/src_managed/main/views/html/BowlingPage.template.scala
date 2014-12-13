
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
object BowlingPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Boolean,Int,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(isBonus:Boolean,cnt:Int):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

<!DOCTYPE html>
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
     """),_display_(Seq[Any](/*23.7*/Navbar("Game"))),format.raw/*23.21*/("""

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Gameboard</h1>
        <table class="table-bordered" style="margin-bottom:50px;width:"""),_display_(Seq[Any](/*28.72*/(cnt*9.5238))),format.raw/*28.84*/("""%">
        	<tr>
        		"""),_display_(Seq[Any](/*30.12*/for(i <- 1 to cnt if i<10) yield /*30.38*/{_display_(Seq[Any](format.raw/*30.39*/("""
        		<td style="padding:0;width:9.5%">
        			<table class="table" style="margin:0">
		        	<tr>
		        		<td class="table" style="border:0;width:50%;padding:0" align="center">
        					<font size="3">10</font>
        				</td>
        				<td class="warning" style="border:0;width:50%;padding:0" align="center">
		        			<font size="3">X</font>
        				</td>
        			</tr>
        			<tr>
        				<td class="table" align="center" colspan="2" style="padding:0;border:0">
        					<font size="3">300</font>
        				</td>
        			</tr>
        			</table>
        		</td>
        	""")))})),_display_(Seq[Any](/*48.12*/if(cnt>9)/*48.21*/{_display_(Seq[Any](format.raw/*48.22*/("""
        		<td style="padding:0;width:"""),_display_(Seq[Any](/*49.39*/("14.2857%".when(isBonus)))),_display_(Seq[Any](/*49.66*/("9.5238%".when(!isBonus)))),format.raw/*49.92*/("""">
        			<table class="table" style="margin:0">
		        	<tr>
		        		<td class="table" style="border:0;width:33%;padding:0" align="center">
        					<font size="3">10</font>
        				</td>
        				<td class="warning" style="border:0;width:33%;padding:0" align="center">
		        			<font size="3">X</font>
        				</td>
        				"""),_display_(Seq[Any](/*58.14*/if(isBonus)/*58.25*/{_display_(Seq[Any](format.raw/*58.26*/("""
        				<td class="danger" style="border:0;width:33%;padding:0" align="center">
		        			<font size="3">X</font>
        				</td>
        				""")))})),format.raw/*62.14*/("""
        			</tr>
        			<tr>
        				<td class="table" align="center" colspan="3" style="padding:0;border:0">
        					<font size="3">300</font>
        				</td>
        			</tr>
        			</table>
        		</td>
        	""")))})),format.raw/*71.11*/("""
        	</tr>
        </table>
        


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
    
    def render(isBonus:Boolean,cnt:Int): play.api.templates.HtmlFormat.Appendable = apply(isBonus,cnt)
    
    def f:((Boolean,Int) => play.api.templates.HtmlFormat.Appendable) = (isBonus,cnt) => apply(isBonus,cnt)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 14 02:28:53 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/BowlingPage.scala.html
                    HASH: 6fd848e1bfb217a6509159f9a78653452f468b2c
                    MATRIX: 567->1|686->26|1002->306|1017->312|1077->349|1166->402|1181->408|1242->447|1313->482|1328->488|1386->524|1441->543|1456->549|1523->594|1610->645|1625->651|1689->693|1866->835|1902->849|2148->1059|2182->1071|2247->1100|2289->1126|2328->1127|2997->1756|3015->1765|3054->1766|3129->1805|3186->1832|3234->1858|3631->2219|3651->2230|3690->2231|3875->2384|4146->2623
                    LINES: 19->1|22->1|34->13|34->13|34->13|35->14|35->14|35->14|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|44->23|44->23|49->28|49->28|51->30|51->30|51->30|69->48|69->48|69->48|70->49|70->49|70->49|79->58|79->58|79->58|83->62|92->71
                    -- GENERATED --
                */
            