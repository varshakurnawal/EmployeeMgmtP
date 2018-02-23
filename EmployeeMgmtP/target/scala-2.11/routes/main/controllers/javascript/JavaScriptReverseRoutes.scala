
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/conf/routes
// @DATE:Fri Feb 23 16:56:02 IST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.delete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
    // @LINE:12
    def contactUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.contactUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactUs"})
        }
      """
    )
  
    // @LINE:26
    def contactPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.contactPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:22
    def verifyPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.verifyPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "verify"})
        }
      """
    )
  
    // @LINE:17
    def deleterec: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.deleterec",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletion"})
        }
      """
    )
  
    // @LINE:13
    def services: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.services",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "services"})
        }
      """
    )
  
    // @LINE:20
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
    // @LINE:25
    def deletePerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.deletePerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleted"})
        }
      """
    )
  
    // @LINE:31
    def getPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
        }
      """
    )
  
    // @LINE:33
    def displayData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.displayData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "display"})
        }
      """
    )
  
    // @LINE:9
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:19
    def updation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.updation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updated"})
        }
      """
    )
  
    // @LINE:27
    def updatePerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.updatePerson",
      """
        function(name0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updated/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:18
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.update",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def aboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.aboutUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutUs"})
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:32
    def getData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
