
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object emp_Scope0 {
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

class emp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[PersonBean],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(persons: List[PersonBean]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""


""")))}),format.raw/*5.2*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="en">
 <head>
   <!-- Required meta tags always come first -->
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta http-equiv="x-ua-compatible" content="ie=edge">

   <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://cdn.rawgit.com/twbs/bootstrap/v4-dev/dist/css/bootstrap.css">

   <style>
     .red
     """),format.raw/*20.6*/("""{"""),format.raw/*20.7*/("""
       """),format.raw/*21.8*/("""color: white;
       background-color: red;
     """),format.raw/*23.6*/("""}"""),format.raw/*23.7*/("""
     """),format.raw/*24.6*/(""".green
     """),format.raw/*25.6*/("""{"""),format.raw/*25.7*/("""
       """),format.raw/*26.8*/("""color: white;
       background-color: green;
     """),format.raw/*28.6*/("""}"""),format.raw/*28.7*/("""
     """),format.raw/*29.6*/(""".blue
     """),format.raw/*30.6*/("""{"""),format.raw/*30.7*/("""
       """),format.raw/*31.8*/("""color: white;
       background-color: blue;
     """),format.raw/*33.6*/("""}"""),format.raw/*33.7*/("""
     
    
"""),format.raw/*36.1*/("""/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar """),format.raw/*37.9*/("""{"""),format.raw/*37.10*/("""
    """),format.raw/*38.5*/("""margin-bottom: 50px;
    border-radius: 0;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""




"""),format.raw/*45.1*/("""h2"""),format.raw/*45.3*/("""{"""),format.raw/*45.4*/("""
"""),format.raw/*46.1*/("""font-size: xx-large;;
color: black;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""
 
   """),format.raw/*50.4*/(""".carousel-inner"""),format.raw/*50.19*/("""{"""),format.raw/*50.20*/("""
    """),format.raw/*51.5*/("""height: 550px;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""  



"""),format.raw/*56.1*/(""".navbar """),format.raw/*56.9*/("""{"""),format.raw/*56.10*/("""
	"""),format.raw/*57.2*/("""margin-bottom: 50px;
	border-radius: 0;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/(""".jumbotron """),format.raw/*61.12*/("""{"""),format.raw/*61.13*/("""
	"""),format.raw/*62.2*/("""margin-bottom: 0;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

"""),format.raw/*65.1*/("""body"""),format.raw/*65.5*/("""{"""),format.raw/*65.6*/("""
"""),format.raw/*66.1*/("""/* background-color: silver; */
/* background-color: silver; */
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""

"""),format.raw/*70.1*/(""".bg-grey"""),format.raw/*70.9*/("""{"""),format.raw/*70.10*/("""
"""),format.raw/*71.1*/("""background-color: linen;

"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""

"""),format.raw/*75.1*/(""".bg-red"""),format.raw/*75.8*/("""{"""),format.raw/*75.9*/("""
"""),format.raw/*76.1*/("""/* background-color: silver; */
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""

"""),format.raw/*79.1*/("""h2"""),format.raw/*79.3*/("""{"""),format.raw/*79.4*/("""
"""),format.raw/*80.1*/("""font-size: xx-large;;
color: black;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""

  """),format.raw/*84.3*/("""h1   """),format.raw/*84.8*/("""{"""),format.raw/*84.9*/("""       """),format.raw/*84.16*/("""background-color: lemonchiffon;
    
   """),format.raw/*86.4*/("""}"""),format.raw/*86.5*/("""

"""),format.raw/*88.1*/(""".bodycolor"""),format.raw/*88.11*/("""{"""),format.raw/*88.12*/("""
"""),format.raw/*89.1*/("""background-color: white;

"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/("""
"""),format.raw/*92.1*/(""".dataTables_filter  """),format.raw/*92.21*/("""{"""),format.raw/*92.22*/("""
    """),format.raw/*93.5*/("""display: inline-block;
    max-width: 100%;
    margin-bottom: 5px;
    font-weight: 700;
    margin-right: 231px;
"""),format.raw/*98.1*/("""}"""),format.raw/*98.2*/("""

"""),format.raw/*100.1*/(""".dataTables_wrapper no-footer"""),format.raw/*100.30*/("""{"""),format.raw/*100.31*/("""
       """),format.raw/*101.8*/("""display: inline-block;
    max-width: 100%;
    margin-bottom: 5px;
    font-weight: 700;
    margin-left: 200px;"""),format.raw/*105.24*/("""}"""),format.raw/*105.25*/("""
    
    """),format.raw/*107.5*/("""#example_length"""),format.raw/*107.20*/("""{"""),format.raw/*107.21*/("""
"""),format.raw/*108.1*/("""display: none; 
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""


"""),format.raw/*112.1*/("""#footer """),format.raw/*112.9*/("""{"""),format.raw/*112.10*/("""
    """),format.raw/*113.5*/("""position:fixed;
    bottom:0;
   
        width: 155%;
"""),format.raw/*117.1*/("""}"""),format.raw/*117.2*/("""
"""),format.raw/*118.1*/(""".cancelbtn, .signupbtn """),format.raw/*118.24*/("""{"""),format.raw/*118.25*/("""

         """),format.raw/*120.10*/("""float: left;
    width: 10%;
    margin-left: 235px;
    position: relative;
    bottom: -28px;
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/("""

   """),format.raw/*127.4*/("""</style>
 </head>
 <body>
 


  

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/dataTables.jqueryui.min.css">
	<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">



</head>

<body class="bodycolor">
 <h1 align="center">Employee Management System!</h1>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <a class="navbar-brand" href="/home">Home</a>
     <a class="navbar-brand" href="/show">Employee</a>
        <a class="navbar-brand" href="/services">Services</a>
         <a class="navbar-brand" href="/aboutUs">About Us</a>
    </div>
 

</nav>  <h1 align="center">Employee Details</h1>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"  src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

 
 <table width="100%" align="center" cellpadding="0" cellspacing="2" border="1px"  class="table table-striped" id="example" style="    width: 75%;
    margin-top: 65px;    background-color: cornsilk;">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Adress</th>
                <th>Phone</th>
               <th>Edit</th>
               <th>Delete</th>
            </tr>
        </thead>
    
       """),_display_(/*187.9*/for(person <- persons) yield /*187.31*/{_display_(Seq[Any](format.raw/*187.32*/("""
      """),format.raw/*188.7*/("""<tr>
          <td>"""),_display_(/*189.16*/person/*189.22*/.getName()),format.raw/*189.32*/("""</td>
          <td>"""),_display_(/*190.16*/person/*190.22*/.getLname()),format.raw/*190.33*/("""</td>
           <td>"""),_display_(/*191.17*/person/*191.23*/.getEmail()),format.raw/*191.34*/("""</td>
             <td>"""),_display_(/*192.19*/person/*192.25*/.getAddress()),format.raw/*192.38*/("""</td>
             <td>"""),_display_(/*193.19*/person/*193.25*/.getPhone()),format.raw/*193.36*/("""</td>
             
        
             <td><a href="/display?email="""),_display_(/*196.43*/person/*196.49*/.getEmail()),format.raw/*196.60*/("""" style="display:block;">Edit</a></td>
           <td><a href="/deletion?email="""),_display_(/*197.42*/person/*197.48*/.getEmail()),format.raw/*197.59*/("""">Delete</a></td>
      </tr>
    """)))}),format.raw/*199.6*/("""
    
    """),format.raw/*201.5*/("""</table>
<form method="GET" action=""""),_display_(/*202.29*/routes/*202.35*/.PersonController.index()),format.raw/*202.60*/(""""  name="form1">  
<button type="submit" class="signupbtn" style=" background-color: cornsilk;">Add New Employee</button>
   
     <footer class="wow fadeInDown " id="footer">
     
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    	<div class="container">
     <div class="col-sm-12">
     
          <a class="navbar-brand" href="#" style="    margin-left: -671px;">Navigation:</a>	</div>
    <div style="    margin-left: -671px;">    
     <div class="col-sm-4">
      <a class="navbar-brand" href="/home" style="    margin-left: 2px;">Home</a></div>
   <div class="col-sm-4">
       <a class="navbar-brand" href="/contactUs">Contact Us</a> </div>
                      <div class="col-sm-4">
      <a class="navbar-brand" href="/show">Employess</a>
</div> 
    </div>
 </div>
 </footer>



 </form>
 


</body>
 <script>
        $(document).ready( function() """),format.raw/*234.39*/("""{"""),format.raw/*234.40*/("""
        	
            """),format.raw/*236.13*/("""oTable = $('#example').dataTable();
        """),format.raw/*237.9*/("""}"""),format.raw/*237.10*/(""");
    </script>
</html>
"""))
      }
    }
  }

  def render(persons:List[PersonBean]): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((List[PersonBean]) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


}

/**/
object emp extends emp_Scope0.emp
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/emp.scala.html
                  HASH: 31166caae00aad73bb43045ac6aff7cbee13c32c
                  MATRIX: 751->1|873->28|900->30|931->53|970->55|1003->59|1031->61|1459->462|1487->463|1522->471|1598->520|1626->521|1659->527|1698->539|1726->540|1761->548|1839->599|1867->600|1900->606|1938->617|1966->618|2001->626|2078->676|2106->677|2145->689|2261->778|2290->779|2322->784|2392->827|2420->828|2452->833|2481->835|2509->836|2537->837|2600->873|2628->874|2661->880|2704->895|2733->896|2765->901|2807->916|2835->917|2868->923|2903->931|2932->932|2961->934|3028->974|3056->975|3085->977|3124->988|3153->989|3182->991|3227->1009|3255->1010|3284->1012|3315->1016|3343->1017|3371->1018|3462->1082|3490->1083|3519->1085|3554->1093|3583->1094|3611->1095|3664->1121|3692->1122|3721->1124|3755->1131|3783->1132|3811->1133|3870->1165|3898->1166|3927->1168|3956->1170|3984->1171|4012->1172|4075->1208|4103->1209|4134->1213|4166->1218|4194->1219|4229->1226|4296->1266|4324->1267|4353->1269|4391->1279|4420->1280|4448->1281|4501->1307|4529->1308|4557->1309|4605->1329|4634->1330|4666->1335|4808->1450|4836->1451|4866->1453|4924->1482|4954->1483|4990->1491|5132->1604|5162->1605|5200->1615|5244->1630|5274->1631|5303->1632|5347->1648|5376->1649|5407->1652|5443->1660|5473->1661|5506->1666|5589->1721|5618->1722|5647->1723|5699->1746|5729->1747|5769->1758|5893->1854|5922->1855|5955->1860|7873->3751|7912->3773|7952->3774|7987->3781|8035->3801|8051->3807|8083->3817|8132->3838|8148->3844|8181->3855|8231->3877|8247->3883|8280->3894|8332->3918|8348->3924|8383->3937|8435->3961|8451->3967|8484->3978|8583->4049|8599->4055|8632->4066|8740->4146|8756->4152|8789->4163|8855->4198|8893->4208|8958->4245|8974->4251|9021->4276|9971->5197|10001->5198|10053->5221|10125->5265|10155->5266
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|38->7|51->20|51->20|52->21|54->23|54->23|55->24|56->25|56->25|57->26|59->28|59->28|60->29|61->30|61->30|62->31|64->33|64->33|67->36|68->37|68->37|69->38|71->40|71->40|76->45|76->45|76->45|77->46|79->48|79->48|81->50|81->50|81->50|82->51|83->52|83->52|87->56|87->56|87->56|88->57|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|96->65|96->65|96->65|97->66|99->68|99->68|101->70|101->70|101->70|102->71|104->73|104->73|106->75|106->75|106->75|107->76|108->77|108->77|110->79|110->79|110->79|111->80|113->82|113->82|115->84|115->84|115->84|115->84|117->86|117->86|119->88|119->88|119->88|120->89|122->91|122->91|123->92|123->92|123->92|124->93|129->98|129->98|131->100|131->100|131->100|132->101|136->105|136->105|138->107|138->107|138->107|139->108|140->109|140->109|143->112|143->112|143->112|144->113|148->117|148->117|149->118|149->118|149->118|151->120|156->125|156->125|158->127|218->187|218->187|218->187|219->188|220->189|220->189|220->189|221->190|221->190|221->190|222->191|222->191|222->191|223->192|223->192|223->192|224->193|224->193|224->193|227->196|227->196|227->196|228->197|228->197|228->197|230->199|232->201|233->202|233->202|233->202|265->234|265->234|267->236|268->237|268->237
                  -- GENERATED --
              */
          