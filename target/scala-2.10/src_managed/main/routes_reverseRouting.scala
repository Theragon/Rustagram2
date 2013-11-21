// @SOURCE:/home/logan/GitRepository/Rustagram/conf/routes
// @HASH:96ad39d1d3ce14d7a1240409ea291b4deb68f487
// @DATE:Thu Nov 21 19:00:54 GMT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
class ReverseUsers {
    

// @LINE:8
def showSignupForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:12
def processLoginForm(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:11
def showLoginForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:15
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:9
def processSignupForm(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                
    
}
                          

// @LINE:20
class ReverseComments {
    

// @LINE:20
def updateComments(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "image/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseImages {
    

// @LINE:18
def processImageForm(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "image")
}
                                                

// @LINE:19
def showImage(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "image/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:17
def showImageForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "image")
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:23
class ReverseAssets {
    

// @LINE:23
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
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
class ReverseUsers {
    

// @LINE:8
def showSignupForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.showSignupForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:12
def processLoginForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.processLoginForm",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:11
def showLoginForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.showLoginForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:15
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
   """
)
                        

// @LINE:9
def processSignupForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.processSignupForm",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseComments {
    

// @LINE:20
def updateComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Comments.updateComments",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "image/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseImages {
    

// @LINE:18
def processImageForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Images.processImageForm",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "image"})
      }
   """
)
                        

// @LINE:19
def showImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Images.showImage",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "image/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def showImageForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Images.showImageForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "image"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:23
class ReverseAssets {
    

// @LINE:23
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
class ReverseUsers {
    

// @LINE:8
def showSignupForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.showSignupForm(), HandlerDef(this, "controllers.Users", "showSignupForm", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:12
def processLoginForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.processLoginForm(), HandlerDef(this, "controllers.Users", "processLoginForm", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:11
def showLoginForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.showLoginForm(), HandlerDef(this, "controllers.Users", "showLoginForm", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:15
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """""", _prefix + """home""")
)
                      

// @LINE:9
def processSignupForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.processSignupForm(), HandlerDef(this, "controllers.Users", "processSignupForm", Seq(), "POST", """""", _prefix + """signup""")
)
                      
    
}
                          

// @LINE:20
class ReverseComments {
    

// @LINE:20
def updateComments(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Comments.updateComments(id), HandlerDef(this, "controllers.Comments", "updateComments", Seq(classOf[Int]), "POST", """""", _prefix + """image/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
class ReverseImages {
    

// @LINE:18
def processImageForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Images.processImageForm(), HandlerDef(this, "controllers.Images", "processImageForm", Seq(), "POST", """""", _prefix + """image""")
)
                      

// @LINE:19
def showImage(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Images.showImage(id), HandlerDef(this, "controllers.Images", "showImage", Seq(classOf[Int]), "GET", """""", _prefix + """image/$id<[^/]+>""")
)
                      

// @LINE:17
def showImageForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Images.showImageForm(), HandlerDef(this, "controllers.Images", "showImageForm", Seq(), "GET", """""", _prefix + """image""")
)
                      
    
}
                          
}
        
    