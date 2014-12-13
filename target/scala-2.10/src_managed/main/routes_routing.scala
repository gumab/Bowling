// @SOURCE:/Users/guma/Bowling/conf/routes
// @HASH:21cd451bd871623c62e82db510b1701c599ad21b
// @DATE:Sun Dec 14 00:20:28 KST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Application_signIn2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signIn"))))
        

// @LINE:12
private[this] lazy val controllers_Application_signUp3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signUp"))))
        

// @LINE:13
private[this] lazy val controllers_Application_bowling4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bowling"))))
        

// @LINE:14
private[this] lazy val controllers_Application_rule5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rule"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signIn""","""controllers.Application.signIn"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signUp""","""controllers.Application.signUp"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bowling""","""controllers.Application.bowling"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rule""","""controllers.Application.rule""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Application_signIn2(params) => {
   call { 
        invokeHandler(controllers.Application.signIn, HandlerDef(this, "controllers.Application", "signIn", Nil,"GET", """""", Routes.prefix + """signIn"""))
   }
}
        

// @LINE:12
case controllers_Application_signUp3(params) => {
   call { 
        invokeHandler(controllers.Application.signUp, HandlerDef(this, "controllers.Application", "signUp", Nil,"GET", """""", Routes.prefix + """signUp"""))
   }
}
        

// @LINE:13
case controllers_Application_bowling4(params) => {
   call { 
        invokeHandler(controllers.Application.bowling, HandlerDef(this, "controllers.Application", "bowling", Nil,"GET", """""", Routes.prefix + """bowling"""))
   }
}
        

// @LINE:14
case controllers_Application_rule5(params) => {
   call { 
        invokeHandler(controllers.Application.rule, HandlerDef(this, "controllers.Application", "rule", Nil,"GET", """""", Routes.prefix + """rule"""))
   }
}
        
}

}
     