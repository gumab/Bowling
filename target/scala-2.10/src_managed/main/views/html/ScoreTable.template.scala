
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
object ScoreTable extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Boolean,Int,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(isBonus:Boolean,cnt:Int,throws:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.41*/("""

<table class="table-bordered" style="margin-bottom:50px;margin-top:20px;width:"""),_display_(Seq[Any](/*3.80*/(((cnt+1)/2)*9.5))),format.raw/*3.97*/("""%">
        <tr>
        	"""),_display_(Seq[Any](/*5.11*/for(i <- 0 until cnt/2 if i<9) yield /*5.41*/{_display_(Seq[Any](format.raw/*5.42*/("""
                
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
                """),_display_(Seq[Any](/*25.18*/if(cnt%2 != 0 && cnt<18)/*25.42*/{_display_(Seq[Any](format.raw/*25.43*/("""
                        <td style="padding:0;width:9.5%">
                                <table class="table" style="margin:0">
                                <tr>
                                        <td class="table" style="border:0;width:50%;padding:0" align="center">
                                                <font size="3">"""),_display_(Seq[Any](/*30.65*/throws/*30.71*/.charAt(cnt-1))),format.raw/*30.85*/("""</font>
                                        </td>
                                        <td class="warning" style="border:0;width:50%;padding:0" align="center">
                                                <font size="3"></font>
                                        </td>
                                </tr>
                                <tr>
                                        <td class="table" align="center" colspan="2" style="padding:0;border:0">
                                                <font size="3">"""),_display_(Seq[Any](/*38.65*/throws/*38.71*/.charAt(cnt-1))),format.raw/*38.85*/("""</font>
                                        </td>
                                </tr>
                                </table>
                        </td>

                """)))})),format.raw/*44.18*/("""


                """),_display_(Seq[Any](/*47.18*/if(cnt>18)/*47.28*/{_display_(Seq[Any](format.raw/*47.29*/("""
        		<td style="padding:0;width:"""),_display_(Seq[Any](/*48.39*/("14.3%".when(isBonus)))),_display_(Seq[Any](/*48.63*/("9.5%".when(!isBonus)))),format.raw/*48.86*/("""">
        			<table class="table" style="margin:0">
		        	<tr>
		        		<td class="table" style="border:0;width:33%;padding:0" align="center">
        					<font size="3">"""),_display_(Seq[Any](/*52.30*/throws/*52.36*/.charAt(18))),format.raw/*52.47*/("""</font>
        				</td>
        				<td class="warning" style="border:0;width:33%;padding:0" align="center">
                                                
		        			<font size="3">"""),_display_(Seq[Any](/*56.30*/if(cnt>19)/*56.40*/{_display_(Seq[Any](_display_(Seq[Any](/*56.42*/throws/*56.48*/.charAt(19)))))})),format.raw/*56.60*/("""</font>

        				</td>
        				"""),_display_(Seq[Any](/*59.14*/if(isBonus&&cnt>20)/*59.33*/{_display_(Seq[Any](format.raw/*59.34*/("""
        				<td class="danger" style="border:0;width:33%;padding:0" align="center">
		        			<font size="3">"""),_display_(Seq[Any](/*61.30*/throws/*61.36*/.charAt(20))),format.raw/*61.47*/("""</font>
        				</td>
        				""")))})),format.raw/*63.14*/("""
        			</tr>
        			<tr>
        				<td class="table" align="center" colspan="3" style="padding:0;border:0">
        					<font size="3">300</font>
        				</td>
        			</tr>
        			</table>
        		</td>
        	""")))})),format.raw/*72.11*/("""
        	</tr>
        </table>"""))}
    }
    
    def render(isBonus:Boolean,cnt:Int,throws:String): play.api.templates.HtmlFormat.Appendable = apply(isBonus,cnt,throws)
    
    def f:((Boolean,Int,String) => play.api.templates.HtmlFormat.Appendable) = (isBonus,cnt,throws) => apply(isBonus,cnt,throws)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 14 14:33:56 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/ScoreTable.scala.html
                    HASH: 13f06b8a4118b2504649f7ec7fb269192299a34c
                    MATRIX: 573->1|706->40|822->121|860->138|922->165|967->195|1005->196|1281->436|1296->442|1330->454|1506->594|1521->600|1557->614|1766->787|1829->828|1950->917|2004->935|2037->959|2076->960|2454->1302|2469->1308|2505->1322|3077->1858|3092->1864|3128->1878|3341->2059|3397->2079|3416->2089|3455->2090|3530->2129|3584->2153|3629->2176|3846->2357|3861->2363|3894->2374|4119->2563|4138->2573|4186->2575|4201->2581|4239->2593|4315->2633|4343->2652|4382->2653|4532->2767|4547->2773|4580->2784|4651->2823|4922->3062
                    LINES: 19->1|22->1|24->3|24->3|26->5|26->5|26->5|32->11|32->11|32->11|35->14|35->14|35->14|40->19|40->19|45->24|46->25|46->25|46->25|51->30|51->30|51->30|59->38|59->38|59->38|65->44|68->47|68->47|68->47|69->48|69->48|69->48|73->52|73->52|73->52|77->56|77->56|77->56|77->56|77->56|80->59|80->59|80->59|82->61|82->61|82->61|84->63|93->72
                    -- GENERATED --
                */
            