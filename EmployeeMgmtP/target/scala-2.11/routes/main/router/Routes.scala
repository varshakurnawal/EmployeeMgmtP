
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/conf/routes
// @DATE:Fri Feb 23 16:56:02 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PersonController_1: controllers.PersonController,
  // @LINE:43
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_1: controllers.PersonController,
    // @LINE:43
    Assets_0: controllers.Assets
  ) = this(errorHandler, PersonController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PersonController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.PersonController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.PersonController.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.PersonController.aboutUs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactUs""", """controllers.PersonController.contactUs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services""", """controllers.PersonController.services()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.PersonController.delete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletion""", """controllers.PersonController.deleterec()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.PersonController.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updated""", """controllers.PersonController.updation()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.addPerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """verify""", """controllers.PersonController.verifyPerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleted""", """controllers.PersonController.deletePerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.PersonController.contactPerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updated/""" + "$" + """name<[^/]+>""", """controllers.PersonController.updatePerson(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.getPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """show""", """controllers.PersonController.getData()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """display""", """controllers.PersonController.displayData()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PersonController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PersonController_index0_invoker = createInvoker(
    PersonController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PersonController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_PersonController_login1_invoker = createInvoker(
    PersonController_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PersonController_home2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_PersonController_home2_invoker = createInvoker(
    PersonController_1.home(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "home",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PersonController_aboutUs3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_PersonController_aboutUs3_invoker = createInvoker(
    PersonController_1.aboutUs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "aboutUs",
      Nil,
      "GET",
      """""",
      this.prefix + """aboutUs"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PersonController_contactUs4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactUs")))
  )
  private[this] lazy val controllers_PersonController_contactUs4_invoker = createInvoker(
    PersonController_1.contactUs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "contactUs",
      Nil,
      "GET",
      """""",
      this.prefix + """contactUs"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PersonController_services5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services")))
  )
  private[this] lazy val controllers_PersonController_services5_invoker = createInvoker(
    PersonController_1.services(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "services",
      Nil,
      "GET",
      """""",
      this.prefix + """services"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PersonController_delete6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_PersonController_delete6_invoker = createInvoker(
    PersonController_1.delete(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "delete",
      Nil,
      "GET",
      """""",
      this.prefix + """delete"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PersonController_deleterec7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletion")))
  )
  private[this] lazy val controllers_PersonController_deleterec7_invoker = createInvoker(
    PersonController_1.deleterec(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "deleterec",
      Nil,
      "GET",
      """""",
      this.prefix + """deletion"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PersonController_update8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_PersonController_update8_invoker = createInvoker(
    PersonController_1.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "update",
      Nil,
      "GET",
      """""",
      this.prefix + """update"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PersonController_updation9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updated")))
  )
  private[this] lazy val controllers_PersonController_updation9_invoker = createInvoker(
    PersonController_1.updation(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "updation",
      Nil,
      "GET",
      """""",
      this.prefix + """updated"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_PersonController_addPerson10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_addPerson10_invoker = createInvoker(
    PersonController_1.addPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """person"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PersonController_verifyPerson11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("verify")))
  )
  private[this] lazy val controllers_PersonController_verifyPerson11_invoker = createInvoker(
    PersonController_1.verifyPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "verifyPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """verify"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_PersonController_deletePerson12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleted")))
  )
  private[this] lazy val controllers_PersonController_deletePerson12_invoker = createInvoker(
    PersonController_1.deletePerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "deletePerson",
      Nil,
      "POST",
      """""",
      this.prefix + """deleted"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PersonController_contactPerson13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_PersonController_contactPerson13_invoker = createInvoker(
    PersonController_1.contactPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "contactPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PersonController_updatePerson14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updated/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonController_updatePerson14_invoker = createInvoker(
    PersonController_1.updatePerson(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "updatePerson",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """updated/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_PersonController_getPersons15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private[this] lazy val controllers_PersonController_getPersons15_invoker = createInvoker(
    PersonController_1.getPersons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """persons"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PersonController_getData16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("show")))
  )
  private[this] lazy val controllers_PersonController_getData16_invoker = createInvoker(
    PersonController_1.getData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getData",
      Nil,
      "GET",
      """""",
      this.prefix + """show"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_PersonController_displayData17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("display")))
  )
  private[this] lazy val controllers_PersonController_displayData17_invoker = createInvoker(
    PersonController_1.displayData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "displayData",
      Nil,
      "GET",
      """""",
      this.prefix + """display"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PersonController_index0_route(params) =>
      call { 
        controllers_PersonController_index0_invoker.call(PersonController_1.index())
      }
  
    // @LINE:7
    case controllers_PersonController_login1_route(params) =>
      call { 
        controllers_PersonController_login1_invoker.call(PersonController_1.login())
      }
  
    // @LINE:9
    case controllers_PersonController_home2_route(params) =>
      call { 
        controllers_PersonController_home2_invoker.call(PersonController_1.home())
      }
  
    // @LINE:11
    case controllers_PersonController_aboutUs3_route(params) =>
      call { 
        controllers_PersonController_aboutUs3_invoker.call(PersonController_1.aboutUs())
      }
  
    // @LINE:12
    case controllers_PersonController_contactUs4_route(params) =>
      call { 
        controllers_PersonController_contactUs4_invoker.call(PersonController_1.contactUs())
      }
  
    // @LINE:13
    case controllers_PersonController_services5_route(params) =>
      call { 
        controllers_PersonController_services5_invoker.call(PersonController_1.services())
      }
  
    // @LINE:15
    case controllers_PersonController_delete6_route(params) =>
      call { 
        controllers_PersonController_delete6_invoker.call(PersonController_1.delete())
      }
  
    // @LINE:17
    case controllers_PersonController_deleterec7_route(params) =>
      call { 
        controllers_PersonController_deleterec7_invoker.call(PersonController_1.deleterec())
      }
  
    // @LINE:18
    case controllers_PersonController_update8_route(params) =>
      call { 
        controllers_PersonController_update8_invoker.call(PersonController_1.update())
      }
  
    // @LINE:19
    case controllers_PersonController_updation9_route(params) =>
      call { 
        controllers_PersonController_updation9_invoker.call(PersonController_1.updation())
      }
  
    // @LINE:20
    case controllers_PersonController_addPerson10_route(params) =>
      call { 
        controllers_PersonController_addPerson10_invoker.call(PersonController_1.addPerson())
      }
  
    // @LINE:22
    case controllers_PersonController_verifyPerson11_route(params) =>
      call { 
        controllers_PersonController_verifyPerson11_invoker.call(PersonController_1.verifyPerson())
      }
  
    // @LINE:25
    case controllers_PersonController_deletePerson12_route(params) =>
      call { 
        controllers_PersonController_deletePerson12_invoker.call(PersonController_1.deletePerson())
      }
  
    // @LINE:26
    case controllers_PersonController_contactPerson13_route(params) =>
      call { 
        controllers_PersonController_contactPerson13_invoker.call(PersonController_1.contactPerson())
      }
  
    // @LINE:27
    case controllers_PersonController_updatePerson14_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_PersonController_updatePerson14_invoker.call(PersonController_1.updatePerson(name))
      }
  
    // @LINE:31
    case controllers_PersonController_getPersons15_route(params) =>
      call { 
        controllers_PersonController_getPersons15_invoker.call(PersonController_1.getPersons())
      }
  
    // @LINE:32
    case controllers_PersonController_getData16_route(params) =>
      call { 
        controllers_PersonController_getData16_invoker.call(PersonController_1.getData())
      }
  
    // @LINE:33
    case controllers_PersonController_displayData17_route(params) =>
      call { 
        controllers_PersonController_displayData17_invoker.call(PersonController_1.displayData())
      }
  
    // @LINE:43
    case controllers_Assets_at18_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_0.at(path, file))
      }
  }
}
