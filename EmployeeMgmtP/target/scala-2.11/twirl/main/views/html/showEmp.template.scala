
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showEmp_Scope0 {
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

class showEmp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.PersonBean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(persons:models.PersonBean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<style>
body """),format.raw/*6.6*/("""{"""),format.raw/*6.7*/("""font-family: Arial, Helvetica, sans-serif;"""),format.raw/*6.49*/("""}"""),format.raw/*6.50*/("""
"""),format.raw/*7.1*/("""* """),format.raw/*7.3*/("""{"""),format.raw/*7.4*/("""box-sizing: border-box"""),format.raw/*7.26*/("""}"""),format.raw/*7.27*/("""
"""),format.raw/*8.1*/("""/* Full-width input fields */
input[type=text], input[type=password] """),format.raw/*9.40*/("""{"""),format.raw/*9.41*/("""
    """),format.raw/*10.5*/("""width: 100%;
    padding: 10px;
    margin: 5px 0 2px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus """),format.raw/*19.52*/("""{"""),format.raw/*19.53*/("""
    """),format.raw/*20.5*/("""background-color: #ddd;
    outline: none;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""

"""),format.raw/*24.1*/("""/* Set a style for all buttons */
button """),format.raw/*25.8*/("""{"""),format.raw/*25.9*/("""
    """),format.raw/*26.5*/("""background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/("""button:hover """),format.raw/*36.14*/("""{"""),format.raw/*36.15*/("""
    """),format.raw/*37.5*/("""opacity:1;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/("""/* Extra styles for the cancel button */
.cancelbtn """),format.raw/*41.12*/("""{"""),format.raw/*41.13*/("""
    """),format.raw/*42.5*/("""padding: 14px 20px;
    background-color: #f44336;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/("""/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn """),format.raw/*47.24*/("""{"""),format.raw/*47.25*/("""
  """),format.raw/*48.3*/("""float: left;
  width: 50%;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""

"""),format.raw/*52.1*/("""/* Add padding to container elements */
.container """),format.raw/*53.12*/("""{"""),format.raw/*53.13*/("""
    """),format.raw/*54.5*/("""padding: 16px;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""

"""),format.raw/*57.1*/("""/* The Modal (background) */
.modal """),format.raw/*58.8*/("""{"""),format.raw/*58.9*/("""
  
    """),format.raw/*60.5*/("""position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: #474e5d;
    padding-top: 50px;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""

"""),format.raw/*71.1*/("""/* Modal Content/Box */
.modal-content """),format.raw/*72.16*/("""{"""),format.raw/*72.17*/("""
    """),format.raw/*73.5*/("""background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 25%; /* Could be more or less, depending on screen size */
    height:25%;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""

"""),format.raw/*80.1*/("""/* Style the horizontal ruler */
hr """),format.raw/*81.4*/("""{"""),format.raw/*81.5*/("""
    """),format.raw/*82.5*/("""border: 1px solid #f1f1f1;
    margin-bottom: 25px;
"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""
 
"""),format.raw/*86.1*/("""/* The Close Button (x) */
.close """),format.raw/*87.8*/("""{"""),format.raw/*87.9*/("""
    """),format.raw/*88.5*/("""position: absolute;
    right: 35px;
    top: 15px;
    font-size: 40px;
    font-weight: bold;
    color: #f1f1f1;
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""

"""),format.raw/*96.1*/(""".close:hover,
.close:focus """),format.raw/*97.14*/("""{"""),format.raw/*97.15*/("""
    """),format.raw/*98.5*/("""color: #f44336;
    cursor: pointer;
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""

"""),format.raw/*102.1*/("""/* Clear floats */
.clearfix::after """),format.raw/*103.18*/("""{"""),format.raw/*103.19*/("""
    """),format.raw/*104.5*/("""content: "";
    clear: both;
    display: table;
"""),format.raw/*107.1*/("""}"""),format.raw/*107.2*/("""

"""),format.raw/*109.1*/("""h1   """),format.raw/*109.6*/("""{"""),format.raw/*109.7*/("""    """),format.raw/*109.11*/("""color: grey;
    position: relative;
    top: 76px;"""),format.raw/*111.15*/("""}"""),format.raw/*111.16*/("""


"""),format.raw/*114.1*/("""</style>
<body >






 
 
    <h1 align="center">Edit for an  Account </h1>
 <form method="POST" action=""""),_display_(/*125.31*/routes/*125.37*/.PersonController.addPerson()),format.raw/*125.66*/(""""  class="modal-content" name="form1">
    <div class="container">
     
     
      <hr>
      <label for="email"><b>First  Name</b></label>
      <input type="text" placeholder="Enter name" name="name"  id="name" value= """),_display_(/*131.82*/persons/*131.89*/.getName()),format.raw/*131.99*/("""  """),format.raw/*131.101*/("""onchange="allLetter(document.form1.name)"   required>
        <label for="email"><b>Last  Name</b></label>
      <input type="text" placeholder="Enter last name" name="lname"  id="lname"  value= """),_display_(/*133.90*/persons/*133.97*/.getLname()),format.raw/*133.108*/("""   """),format.raw/*133.111*/("""onchange="allLetter(document.form1.lname)" required>
        <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter email" name="email"  value= """),_display_(/*135.74*/persons/*135.81*/.getEmail()),format.raw/*135.92*/(""" """),format.raw/*135.93*/("""id="email"  readonly="readonly" required>
      
       <label for="email"><b>Address</b></label>
      <input type="text" placeholder="Enter address" name="address"      value= """),_display_(/*138.82*/persons/*138.89*/.getAddress()),format.raw/*138.102*/("""           """),format.raw/*138.113*/("""required>
       <label for="email"><b>Phone</b></label>
      <input type="text" placeholder="Enter phone" name="phone" value= """),_display_(/*140.73*/persons/*140.80*/.getPhone()),format.raw/*140.91*/("""    """),format.raw/*140.95*/("""maxlength="10"   onkeypress='return event.charCode >= 48 && event.charCode <= 57'  required>
      
       <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" id="psw"    value= """),_display_(/*143.90*/persons/*143.97*/.getPsw()),format.raw/*143.106*/("""  """),format.raw/*143.108*/("""onchange="checkpattern(document.form1.psw)"     required   >

     
      <div class="clearfix">
        
        <button type="submit" class="signupbtn">Save</button>
  
        
      </div>
    </div>
  </form>
</div>



</body>
</html>
 <script>
function allLetter(inputtxt)  
"""),format.raw/*162.1*/("""{"""),format.raw/*162.2*/("""  
 """),format.raw/*163.2*/("""var letters = /^[A-Za-z]+$/;  
 if(inputtxt.value.match(letters))  
   """),format.raw/*165.4*/("""{"""),format.raw/*165.5*/("""  
    """),format.raw/*166.5*/("""return true;  
   """),format.raw/*167.4*/("""}"""),format.raw/*167.5*/("""  
 """),format.raw/*168.2*/("""else  
   """),format.raw/*169.4*/("""{"""),format.raw/*169.5*/("""  
	   """),format.raw/*170.5*/("""alert("Given Field must be in alphabates"); 
   if(inputtxt.value==  document.getElementById("name").value)
   document.getElementById("name").value = '';
   if( inputtxt.value== document.getElementById("lname").value)
   document.getElementById("lname").value = '';
  
   return false;  
   """),format.raw/*177.4*/("""}"""),format.raw/*177.5*/("""  
"""),format.raw/*178.1*/("""}"""),format.raw/*178.2*/("""

"""),format.raw/*180.1*/("""function checkpattern(inputText)  
"""),format.raw/*181.1*/("""{"""),format.raw/*181.2*/("""  
	
	  """),format.raw/*183.4*/("""var re = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z])."""),format.raw/*183.45*/("""{"""),format.raw/*183.46*/("""6,"""),format.raw/*183.48*/("""}"""),format.raw/*183.49*/("""/;

if(inputText.value.match(re))  
"""),format.raw/*186.1*/("""{"""),format.raw/*186.2*/("""  
"""),format.raw/*187.1*/("""document.form1.psw.focus();  
return true;  
"""),format.raw/*189.1*/("""}"""),format.raw/*189.2*/("""  
"""),format.raw/*190.1*/("""else  
"""),format.raw/*191.1*/("""{"""),format.raw/*191.2*/("""  
"""),format.raw/*192.1*/("""alert(" password must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters  !");  
document.form1.psw.focus();  
document.getElementById("psw").value = '';
return false;  
"""),format.raw/*196.1*/("""}"""),format.raw/*196.2*/(""" """),format.raw/*196.3*/("""}"""),format.raw/*196.4*/("""
"""),format.raw/*197.1*/("""</script>
"""))
      }
    }
  }

  def render(persons:models.PersonBean): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((models.PersonBean) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


}

/**/
object showEmp extends showEmp_Scope0.showEmp
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/showEmp.scala.html
                  HASH: 308fe522158844c3a61ea9e7a8a0fbc7877a1072
                  MATRIX: 760->1|882->28|910->30|972->66|999->67|1068->109|1096->110|1123->111|1151->113|1178->114|1227->136|1255->137|1282->138|1378->207|1406->208|1438->213|1592->340|1620->341|1649->343|1783->449|1812->450|1844->455|1914->498|1942->499|1971->501|2039->542|2067->543|2099->548|2288->710|2316->711|2345->713|2386->726|2415->727|2447->732|2485->743|2513->744|2542->746|2622->798|2651->799|2683->804|2761->855|2789->856|2818->858|2930->942|2959->943|2989->946|3043->973|3071->974|3100->976|3179->1027|3208->1028|3240->1033|3282->1048|3310->1049|3339->1051|3402->1087|3430->1088|3465->1096|3761->1365|3789->1366|3818->1368|3885->1407|3914->1408|3946->1413|4200->1640|4228->1641|4257->1643|4320->1679|4348->1680|4380->1685|4459->1737|4487->1738|4517->1741|4578->1775|4606->1776|4638->1781|4781->1897|4809->1898|4838->1900|4893->1927|4922->1928|4954->1933|5019->1970|5048->1971|5078->1973|5143->2009|5173->2010|5206->2015|5284->2065|5313->2066|5343->2068|5376->2073|5405->2074|5438->2078|5518->2129|5548->2130|5579->2133|5714->2240|5730->2246|5781->2275|6032->2498|6049->2505|6081->2515|6113->2517|6337->2713|6354->2720|6388->2731|6421->2734|6623->2908|6640->2915|6673->2926|6703->2927|6910->3106|6927->3113|6963->3126|7004->3137|7161->3266|7178->3273|7211->3284|7244->3288|7509->3525|7526->3532|7558->3541|7590->3543|7899->3824|7928->3825|7960->3829|8059->3900|8088->3901|8123->3908|8169->3926|8198->3927|8230->3931|8268->3941|8297->3942|8332->3949|8652->4241|8681->4242|8712->4245|8741->4246|8771->4248|8834->4283|8863->4284|8899->4292|8969->4333|8999->4334|9030->4336|9060->4337|9124->4373|9153->4374|9184->4377|9257->4422|9286->4423|9317->4426|9352->4433|9381->4434|9412->4437|9661->4658|9690->4659|9719->4660|9748->4661|9777->4662
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|38->7|39->8|40->9|40->9|41->10|47->16|47->16|49->18|50->19|50->19|51->20|53->22|53->22|55->24|56->25|56->25|57->26|65->34|65->34|67->36|67->36|67->36|68->37|69->38|69->38|71->40|72->41|72->41|73->42|75->44|75->44|77->46|78->47|78->47|79->48|81->50|81->50|83->52|84->53|84->53|85->54|86->55|86->55|88->57|89->58|89->58|91->60|100->69|100->69|102->71|103->72|103->72|104->73|109->78|109->78|111->80|112->81|112->81|113->82|115->84|115->84|117->86|118->87|118->87|119->88|125->94|125->94|127->96|128->97|128->97|129->98|131->100|131->100|133->102|134->103|134->103|135->104|138->107|138->107|140->109|140->109|140->109|140->109|142->111|142->111|145->114|156->125|156->125|156->125|162->131|162->131|162->131|162->131|164->133|164->133|164->133|164->133|166->135|166->135|166->135|166->135|169->138|169->138|169->138|169->138|171->140|171->140|171->140|171->140|174->143|174->143|174->143|174->143|193->162|193->162|194->163|196->165|196->165|197->166|198->167|198->167|199->168|200->169|200->169|201->170|208->177|208->177|209->178|209->178|211->180|212->181|212->181|214->183|214->183|214->183|214->183|214->183|217->186|217->186|218->187|220->189|220->189|221->190|222->191|222->191|223->192|227->196|227->196|227->196|227->196|228->197
                  -- GENERATED --
              */
          