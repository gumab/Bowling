
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
object BowlingPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Boolean,Int,String,Int,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(isBonus:Boolean,cnt:Int,throws:String,numRange:Int):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

<!DOCTYPE html>



<html>
	<head>
		
		<meta charset="utf-8">
   		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<meta name="description" content="">
   		<meta name="author" content="">
<!--

        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*16.59*/routes/*16.65*/.Assets.at("images/ebay_bowling.png"))),format.raw/*16.102*/("""">-->
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.48*/routes/*17.54*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*17.93*/("""">
		<link rel="stylesheet" href=""""),_display_(Seq[Any](/*18.33*/routes/*18.39*/.Assets.at("stylesheets/navbar.css"))),format.raw/*18.75*/("""">
		<script src=""""),_display_(Seq[Any](/*19.17*/routes/*19.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*19.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*20.65*/("""" type="text/javascript"></script>
		<title>Bowling Page</title>
	</head>
	<body>
		<div class="container">
      <!-- Static navbar -->
     """),_display_(Seq[Any](/*26.7*/Navbar("Game"))),format.raw/*26.21*/("""

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron" name="jt">
      	<div align="center" class="alert alert-success alert-lg" name="al"><input type="textbox" name="dis" value="test" /></div>
      	<script language="javascript">
function btn_click(b_id)"""),format.raw/*32.25*/("""{"""),format.raw/*32.26*/("""
	document.dis.value=b_id;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
</script>
        <h3>Roll!"""),_display_(Seq[Any](/*36.19*/if(isBonus)/*36.30*/{_display_(Seq[Any](format.raw/*36.31*/("""<div align="right"><span class="badge">Bonus!!</span></div>""")))})),format.raw/*36.91*/("""</h3>

        <div dclass="btn-group">
        	"""),_display_(Seq[Any](/*39.11*/for(i<-0 to 10) yield /*39.26*/{_display_(Seq[Any](format.raw/*39.27*/("""
				<button onclick=btn_click('"""),_display_(Seq[Any](/*40.33*/i)),format.raw/*40.34*/("""') class="btn btn-lg btn-default" """),_display_(Seq[Any](/*40.69*/if(i>numRange)/*40.83*/{_display_(Seq[Any](format.raw/*40.84*/("""disabled=""""")))})),format.raw/*40.96*/(""">"""),_display_(Seq[Any](/*40.98*/i)),format.raw/*40.99*/("""</button>
			""")))})),format.raw/*41.5*/("""
		</div>

		<h3 style="margin-top:50px">Score board</h3>

        """),_display_(Seq[Any](/*46.10*/ScoreTable(isBonus,cnt,throws))),format.raw/*46.40*/("""
        


          <a class="btn btn-lg btn-primary" href="../../components/#navbar">View navbar docs &raquo;</a>
        </p>
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	</body>
</html>"""))}
    }
    
    def render(isBonus:Boolean,cnt:Int,throws:String,numRange:Int): play.api.templates.HtmlFormat.Appendable = apply(isBonus,cnt,throws,numRange)
    
    def f:((Boolean,Int,String,Int) => play.api.templates.HtmlFormat.Appendable) = (isBonus,cnt,throws,numRange) => apply(isBonus,cnt,throws,numRange)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 14 17:11:43 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/BowlingPage.scala.html
                    HASH: e3522bdc385347bbfc7cca810d392b680c3e1c37
                    MATRIX: 578->1|724->53|1043->336|1058->342|1118->379|1207->432|1222->438|1283->477|1354->512|1369->518|1427->554|1482->573|1497->579|1564->624|1651->675|1666->681|1730->723|1908->866|1944->880|2285->1193|2314->1194|2368->1221|2396->1222|2461->1251|2481->1262|2520->1263|2612->1323|2698->1373|2729->1388|2768->1389|2837->1422|2860->1423|2931->1458|2954->1472|2993->1473|3037->1485|3075->1487|3098->1488|3143->1502|3247->1570|3299->1600
                    LINES: 19->1|22->1|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|47->26|47->26|53->32|53->32|55->34|55->34|57->36|57->36|57->36|57->36|60->39|60->39|60->39|61->40|61->40|61->40|61->40|61->40|61->40|61->40|61->40|62->41|67->46|67->46
                    -- GENERATED --
                */
            