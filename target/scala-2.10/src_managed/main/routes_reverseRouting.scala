// @SOURCE:/Users/guma/Bowling/conf/routes
// @HASH:956dba813b2f20a5be66a6a485b335922b69d9db
// @DATE:Sun Dec 14 02:09:01 KST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def signIn(iid:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signIn" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("iid", iid)))))
}
                                                

// @LINE:12
def signUp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signUp")
}
                                                

// @LINE:13
def bowling(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bowling")
}
                                                

// @LINE:15
def history(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "history")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:14
def rule(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "rule")
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signIn",
   """
      function(iid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("iid", iid)])})
      }
   """
)
                        

// @LINE:12
def signUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signUp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
      }
   """
)
                        

// @LINE:13
def bowling : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.bowling",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bowling"})
      }
   """
)
                        

// @LINE:15
def history : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.history",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:14
def rule : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.rule",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rule"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def signIn(iid:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signIn(iid), HandlerDef(this, "controllers.Application", "signIn", Seq(classOf[Int]), "GET", """""", _prefix + """signIn""")
)
                      

// @LINE:12
def signUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signUp(), HandlerDef(this, "controllers.Application", "signUp", Seq(), "GET", """""", _prefix + """signUp""")
)
                      

// @LINE:13
def bowling(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.bowling(), HandlerDef(this, "controllers.Application", "bowling", Seq(), "GET", """""", _prefix + """bowling""")
)
                      

// @LINE:15
def history(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.history(), HandlerDef(this, "controllers.Application", "history", Seq(), "GET", """""", _prefix + """history""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def rule(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.rule(), HandlerDef(this, "controllers.Application", "rule", Seq(), "GET", """""", _prefix + """rule""")
)
                      
    
}
                          
}
        
    