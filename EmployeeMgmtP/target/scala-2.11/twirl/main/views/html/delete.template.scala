
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object delete_Scope0 {
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

class delete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<script type='text/javascript' src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/index.js")),format.raw/*4.82*/("""'></script>

    <ul id="persons"></ul>
  <form method="POST" action=""""),_display_(/*7.32*/routes/*7.38*/.PersonController.deletePerson()),format.raw/*7.70*/("""">
        <input type="text" name="name"/>
         
        <button>Delete Person</button>
    </form>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object delete extends delete_Scope0.delete
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/delete.scala.html
                  HASH: d95f7e8beb76dd243d5f41217439491fc04ea933
                  MATRIX: 829->3|860->26|899->28|930->33|993->70|1007->76|1061->110|1158->181|1172->187|1224->219|1360->325
                  LINES: 32->3|32->3|32->3|33->4|33->4|33->4|33->4|36->7|36->7|36->7|41->12
                  -- GENERATED --
              */
          