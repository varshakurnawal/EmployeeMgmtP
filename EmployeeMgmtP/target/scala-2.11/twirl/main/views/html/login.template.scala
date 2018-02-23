
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<style>
body """),format.raw/*4.6*/("""{"""),format.raw/*4.7*/("""font-family: Arial, Helvetica, sans-serif;"""),format.raw/*4.49*/("""}"""),format.raw/*4.50*/("""
"""),format.raw/*5.1*/("""* """),format.raw/*5.3*/("""{"""),format.raw/*5.4*/("""box-sizing: border-box"""),format.raw/*5.26*/("""}"""),format.raw/*5.27*/("""
"""),format.raw/*6.1*/("""/* Full-width input fields */
input[type=text], input[type=password] """),format.raw/*7.40*/("""{"""),format.raw/*7.41*/("""
    """),format.raw/*8.5*/("""width: 100%;
    padding: 10px;
    margin: 5px 0 2px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus """),format.raw/*17.52*/("""{"""),format.raw/*17.53*/("""
    """),format.raw/*18.5*/("""background-color: #ddd;
    outline: none;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

"""),format.raw/*22.1*/("""/* Set a style for all buttons */
button """),format.raw/*23.8*/("""{"""),format.raw/*23.9*/("""
    """),format.raw/*24.5*/("""background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

"""),format.raw/*34.1*/("""button:hover """),format.raw/*34.14*/("""{"""),format.raw/*34.15*/("""
    """),format.raw/*35.5*/("""opacity:1;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/("""/* Extra styles for the cancel button */
.cancelbtn """),format.raw/*39.12*/("""{"""),format.raw/*39.13*/("""
    """),format.raw/*40.5*/("""padding: 14px 20px;
    background-color: #f44336;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

"""),format.raw/*44.1*/("""/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn """),format.raw/*45.24*/("""{"""),format.raw/*45.25*/("""
  """),format.raw/*46.3*/("""float: left;
  width: 50%;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/("""/* Add padding to container elements */
.container """),format.raw/*51.12*/("""{"""),format.raw/*51.13*/("""
    """),format.raw/*52.5*/("""padding: 16px;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/("""/* The Modal (background) */
.modal """),format.raw/*56.8*/("""{"""),format.raw/*56.9*/("""
  
    """),format.raw/*58.5*/("""position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: #474e5d;
    padding-top: 50px;
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""

"""),format.raw/*69.1*/("""/* Modal Content/Box */
.modal-content """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
    """),format.raw/*71.5*/("""background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 25%; /* Could be more or less, depending on screen size */
    height:25%;
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""

"""),format.raw/*78.1*/("""/* Style the horizontal ruler */
hr """),format.raw/*79.4*/("""{"""),format.raw/*79.5*/("""
    """),format.raw/*80.5*/("""border: 1px solid #f1f1f1;
    margin-bottom: 25px;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""
 
"""),format.raw/*84.1*/("""/* The Close Button (x) */
.close """),format.raw/*85.8*/("""{"""),format.raw/*85.9*/("""
    """),format.raw/*86.5*/("""position: absolute;
    right: 35px;
    top: 15px;
    font-size: 40px;
    font-weight: bold;
    color: #f1f1f1;
"""),format.raw/*92.1*/("""}"""),format.raw/*92.2*/("""

"""),format.raw/*94.1*/(""".close:hover,
.close:focus """),format.raw/*95.14*/("""{"""),format.raw/*95.15*/("""
    """),format.raw/*96.5*/("""color: #f44336;
    cursor: pointer;
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""

"""),format.raw/*100.1*/("""/* Clear floats */
.clearfix::after """),format.raw/*101.18*/("""{"""),format.raw/*101.19*/("""
    """),format.raw/*102.5*/("""content: "";
    clear: both;
    display: table;
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/("""

"""),format.raw/*107.1*/("""h1   """),format.raw/*107.6*/("""{"""),format.raw/*107.7*/("""    """),format.raw/*107.11*/("""color: grey;
    position: relative;
    top: 76px;"""),format.raw/*109.15*/("""}"""),format.raw/*109.16*/("""


"""),format.raw/*112.1*/("""</style>
<body>






 
 
    <h1 align="center">Login for an  Account</h1>
 <form method="POST" action=""""),_display_(/*123.31*/routes/*123.37*/.PersonController.verifyPerson()),format.raw/*123.69*/(""""  class="modal-content" name="form1">
    <div class="container">
     
     
      <hr>
 
        <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter email" name="email" required>
  
           <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>

     

      <div class="clearfix">
        
        <button type="submit" class="signupbtn">Login</button>
        <a href="/" style="    position: absolute;
    top: 363px;
    left: 976px;">Sign Up</a>
        
      </div>
    </div>
  </form>
</div>



</body>
</html>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/login.scala.html
                  HASH: d562d2bca34992677b7981ce5e7b0d9ea3ca222e
                  MATRIX: 827->0|889->36|916->37|985->79|1013->80|1040->81|1068->83|1095->84|1144->106|1172->107|1199->108|1295->177|1323->178|1354->183|1508->310|1536->311|1565->313|1699->419|1728->420|1760->425|1830->468|1858->469|1887->471|1955->512|1983->513|2015->518|2204->680|2232->681|2261->683|2302->696|2331->697|2363->702|2401->713|2429->714|2458->716|2538->768|2567->769|2599->774|2677->825|2705->826|2734->828|2846->912|2875->913|2905->916|2959->943|2987->944|3016->946|3095->997|3124->998|3156->1003|3198->1018|3226->1019|3255->1021|3318->1057|3346->1058|3381->1066|3677->1335|3705->1336|3734->1338|3801->1377|3830->1378|3862->1383|4116->1610|4144->1611|4173->1613|4236->1649|4264->1650|4296->1655|4375->1707|4403->1708|4433->1711|4494->1745|4522->1746|4554->1751|4697->1867|4725->1868|4754->1870|4809->1897|4838->1898|4870->1903|4934->1940|4962->1941|4992->1943|5057->1979|5087->1980|5120->1985|5198->2035|5227->2036|5257->2038|5290->2043|5319->2044|5352->2048|5432->2099|5462->2100|5493->2103|5627->2209|5643->2215|5697->2247
                  LINES: 32->1|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|38->7|38->7|39->8|45->14|45->14|47->16|48->17|48->17|49->18|51->20|51->20|53->22|54->23|54->23|55->24|63->32|63->32|65->34|65->34|65->34|66->35|67->36|67->36|69->38|70->39|70->39|71->40|73->42|73->42|75->44|76->45|76->45|77->46|79->48|79->48|81->50|82->51|82->51|83->52|84->53|84->53|86->55|87->56|87->56|89->58|98->67|98->67|100->69|101->70|101->70|102->71|107->76|107->76|109->78|110->79|110->79|111->80|113->82|113->82|115->84|116->85|116->85|117->86|123->92|123->92|125->94|126->95|126->95|127->96|129->98|129->98|131->100|132->101|132->101|133->102|136->105|136->105|138->107|138->107|138->107|138->107|140->109|140->109|143->112|154->123|154->123|154->123
                  -- GENERATED --
              */
          