
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
object SignUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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

        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.59*/routes/*14.65*/.Assets.at("images/ebay_bowling.png"))),format.raw/*14.102*/("""">-->
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*15.93*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.48*/routes/*16.54*/.Assets.at("stylesheets/signin.css"))),format.raw/*16.90*/("""">
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.68*/("""" type="text/javascript"></script>

		<title>Signin Page</title>
	</head>
	<body>
		<div class="container">
			<div align="center"><img width="300px" src=""""),_display_(Seq[Any](/*23.49*/routes/*23.55*/.Assets.at("images/ebay_bowling.png"))),format.raw/*23.92*/(""""></div>

      		<form class="form-signin" action="signIn">
				<h3 class="form-signin-heading">Sign in</h3>
				<input name="ID" type="text" class="form-control" placeholder="User ID(3~10letters)" autofocus>
				<input style="margin-bottom: -1px; border-bottom-left-radius: 0; border-bottom-right-radius: 0;" type="password" class="form-control" placeholder="Confirm your password">
				<input type="password" class="form-control" placeholder="Password">
				
					<button class="btn btn-lg btn-primary btn-block" type="button">Sign up</button>
				<div align="center" style="margin-top:10px">
				<a href="/">to Login page</a>
				</div>
			</form>
		</div> <!-- /container -->
	</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 13 23:19:12 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/SignUp.scala.html
                    HASH: 1eb3466eb4a072fa45c31374702368e5f8c85ac1
                    MATRIX: 638->2|953->281|968->287|1028->324|1117->377|1132->383|1193->422|1279->472|1294->478|1352->514|1407->533|1422->539|1489->584|1681->740|1696->746|1755->783
                    LINES: 22->3|33->14|33->14|33->14|34->15|34->15|34->15|35->16|35->16|35->16|36->17|36->17|36->17|42->23|42->23|42->23
                    -- GENERATED --
                */
            