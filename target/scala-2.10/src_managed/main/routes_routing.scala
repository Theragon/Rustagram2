// @SOURCE:C:/GitHub/Rustagram2/conf/routes
// @HASH:15c655d4b7650a119f876d8bc13cb201ebe1fe65
// @DATE:Thu Nov 21 19:47:18 GMT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

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
        

// @LINE:8
private[this] lazy val controllers_Users_showSignupForm1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:9
private[this] lazy val controllers_Users_processSignupForm2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:11
private[this] lazy val controllers_Users_showLoginForm3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Users_processLoginForm4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Users_logout5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:15
private[this] lazy val controllers_Users_list6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:17
private[this] lazy val controllers_Images_showImageForm7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("image"))))
        

// @LINE:18
private[this] lazy val controllers_Images_processImageForm8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("image"))))
        

// @LINE:19
private[this] lazy val controllers_Images_showImage9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("image/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_Comments_updateComments10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("image/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Users.showSignupForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Users.processSignupForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Users.showLoginForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Users.processLoginForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Users.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Users.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """image""","""controllers.Images.showImageForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """image""","""controllers.Images.processImageForm()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """image/$id<[^/]+>""","""controllers.Images.showImage(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """image/$id<[^/]+>""","""controllers.Comments.updateComments(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Users_showSignupForm1(params) => {
   call { 
        invokeHandler(controllers.Users.showSignupForm(), HandlerDef(this, "controllers.Users", "showSignupForm", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:9
case controllers_Users_processSignupForm2(params) => {
   call { 
        invokeHandler(controllers.Users.processSignupForm(), HandlerDef(this, "controllers.Users", "processSignupForm", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:11
case controllers_Users_showLoginForm3(params) => {
   call { 
        invokeHandler(controllers.Users.showLoginForm(), HandlerDef(this, "controllers.Users", "showLoginForm", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Users_processLoginForm4(params) => {
   call { 
        invokeHandler(controllers.Users.processLoginForm(), HandlerDef(this, "controllers.Users", "processLoginForm", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Users_logout5(params) => {
   call { 
        invokeHandler(controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:15
case controllers_Users_list6(params) => {
   call { 
        invokeHandler(controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:17
case controllers_Images_showImageForm7(params) => {
   call { 
        invokeHandler(controllers.Images.showImageForm(), HandlerDef(this, "controllers.Images", "showImageForm", Nil,"GET", """""", Routes.prefix + """image"""))
   }
}
        

// @LINE:18
case controllers_Images_processImageForm8(params) => {
   call { 
        invokeHandler(controllers.Images.processImageForm(), HandlerDef(this, "controllers.Images", "processImageForm", Nil,"POST", """""", Routes.prefix + """image"""))
   }
}
        

// @LINE:19
case controllers_Images_showImage9(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Images.showImage(id), HandlerDef(this, "controllers.Images", "showImage", Seq(classOf[Int]),"GET", """""", Routes.prefix + """image/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_Comments_updateComments10(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Comments.updateComments(id), HandlerDef(this, "controllers.Comments", "updateComments", Seq(classOf[Int]),"POST", """""", Routes.prefix + """image/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     