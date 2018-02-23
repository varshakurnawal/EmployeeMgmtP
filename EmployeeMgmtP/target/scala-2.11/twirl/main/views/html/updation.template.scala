
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updation_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class updation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<script type='text/javascript' src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/index.js")),format.raw/*4.82*/("""'></script>

    <ul id="persons"></ul>
  <form method="POST" action=""""),_display_(/*7.32*/routes/*7.38*/.PersonController.updatePerson(name)),format.raw/*7.74*/("""">
        <input type="text" name="name"/>
         
        <button>New Person Name                    </button>
    </form>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


}

/**/
object updation extends updation_Scope0.updation
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/updation.scala.html
                  HASH: b3447ff8caf910ec927930e662be08d4c7ebe976
                  MATRIX: 751->1|859->14|887->17|918->40|957->42|988->47|1051->84|1065->90|1119->124|1216->195|1230->201|1286->237|1444->365
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|38->7|38->7|38->7|43->12
                  -- GENERATED --
              */
          