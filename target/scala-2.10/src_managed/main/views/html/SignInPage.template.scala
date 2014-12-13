
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
object SignInPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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

      		<form class="form-signin" action="bowling">
				<h3 class="form-signin-heading">Sign in</h3>
				<input name="ID" type="text" class="form-control" placeholder="User ID(3~10letters)" autofocus>
				<input type="password" class="form-control" placeholder="Password">
				<label class="checkbox">
					<input type="checkbox" value="remember-me"> Remember me
				</label>
				<div class="btn-group btn-block">
					<button class="btn btn-lg btn-primary" type="submit" style="width:50%">Sign in</button>
					<button onclick="location.href='signUp'" class="btn btn-lg btn-primary" type="button" style="width:50%">Sign up</button>
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
                    DATE: Sun Dec 14 00:17:44 KST 2014
                    SOURCE: /Users/guma/Bowling/app/views/SignInPage.scala.html
                    HASH: 7e7b6b3b2f490ec9927c24adbb333859af7714d2
                    MATRIX: 642->2|957->281|972->287|1032->324|1121->377|1136->383|1197->422|1283->472|1298->478|1356->514|1411->533|1426->539|1493->584|1685->740|1700->746|1759->783
                    LINES: 22->3|33->14|33->14|33->14|34->15|34->15|34->15|35->16|35->16|35->16|36->17|36->17|36->17|42->23|42->23|42->23
                    -- GENERATED --
                */
            