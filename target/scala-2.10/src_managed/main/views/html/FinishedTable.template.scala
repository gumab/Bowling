
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
object FinishedTable extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Boolean,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(isBonus:Boolean,throws:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<table class="table-bordered" style="margin-top:20px;margin-bottom:20px;width:"""),_display_(Seq[Any](/*3.80*/(((throws.length+1)/2)*9.5))),format.raw/*3.107*/("""%">
        <tr>
        	"""),_display_(Seq[Any](/*5.11*/for(i <- 0 until 9) yield /*5.30*/{_display_(Seq[Any](format.raw/*5.31*/("""
                
        		<td style="padding:0;width:9.5%">
        			<table class="table" style="margin:0">
		        	<tr>
		        		<td class="table" style="border:0;width:50%;padding:0" align="center">
        					<font size="3">"""),_display_(Seq[Any](/*11.30*/throws/*11.36*/.charAt(i*2))),format.raw/*11.48*/("""</font>
        				</td>
        				<td class="warning" style="border:0;width:50%;padding:0" align="center">
		        			<font size="3">"""),_display_(Seq[Any](/*14.30*/throws/*14.36*/.charAt(i*2+1))),format.raw/*14.50*/("""</font>
        				</td>
        			</tr>
        			<tr>
        				<td class="table" align="center" colspan="2" style="padding:0;border:0">
        					<font size="3">"""),_display_(Seq[Any](/*19.30*/(throws.charAt(i*2)+throws.charAt(i*2+1)))),format.raw/*19.71*/("""</font>
        				</td>
        			</tr>
        			</table>
        		</td>
        	""")))})),format.raw/*24.11*/("""
        		<td style="padding:0;width:"""),_display_(Seq[Any](/*25.39*/("14.3%".when(isBonus)))),_display_(Seq[Any](/*25.63*/("9.5%".when(!isBonus)))),format.raw/*25.86*/("""">
        			<table class="table" style="margin:0">
		        	<tr>
		        		<td class="table" style="border:0;width:33%;padding:0" align="center">
        					<font size="3">"""),_display_(Seq[Any](/*29.30*/throws/*29.36*/.charAt(18))),format.raw/*29.47*/("""</font>
        				</td>
        				<td class="warning" style="border:0;width:33%;padding:0" align="center">
                                                
		        			<font size="3">"""),_display_(Seq[Any](/*33.30*/throws/*33.36*/.charAt(19))),format.raw/*33.47*/("""</font>

        				</td>
        				"""),_display_(Seq[Any](/*36.14*/if(isBonus)/*36.25*/{_display_(Seq[Any](format.raw/*36.26*/("""
        				<td class="danger" style="border:0;width:33%;padding:0" align="center">
		        			<font size="3">"""),_display_(Seq[Any](/*38.30*/throws/*38.36*/.charAt(20))),format.raw/*38.47*/("""</font>
        				</td>
        				""")))})),format.raw/*40.14*/("""
        			</tr>
        			<tr>
        				<td class="table" align="center" colspan="3" style="padding:0;border:0">
        					<font size="3">300</font>
        				</td>
        			</tr>
        			</table>
        		</td>
        	</tr>
        </table>"""))}
    }
    
    def render(isBonus:Boolean,throws:String): play.api.templates.HtmlFormat.Appendable = apply(isBonus,throws)
    
    def f:((Boolean,String) => play.api.templates.HtmlFormat.Appendable) = (isBonus,throws) => apply(isBonus,throws)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 14 10:59:45 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/FinishedTable.scala.html
                    HASH: 44554df4d830041247e86608da94820182771148
                    MATRIX: 572->1|697->32|813->113|862->140|924->167|958->186|996->187|1272->427|1287->433|1321->445|1497->585|1512->591|1548->605|1757->778|1820->819|1941->908|2016->947|2070->971|2115->994|2332->1175|2347->1181|2380->1192|2605->1381|2620->1387|2653->1398|2729->1438|2749->1449|2788->1450|2938->1564|2953->1570|2986->1581|3057->1620
                    LINES: 19->1|22->1|24->3|24->3|26->5|26->5|26->5|32->11|32->11|32->11|35->14|35->14|35->14|40->19|40->19|45->24|46->25|46->25|46->25|50->29|50->29|50->29|54->33|54->33|54->33|57->36|57->36|57->36|59->38|59->38|59->38|61->40
                    -- GENERATED --
                */
            