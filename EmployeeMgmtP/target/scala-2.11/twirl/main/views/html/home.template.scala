
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
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
     """),format.raw/*16.6*/("""{"""),format.raw/*16.7*/("""
       """),format.raw/*17.8*/("""color: white;
       background-color: red;
     """),format.raw/*19.6*/("""}"""),format.raw/*19.7*/("""
     """),format.raw/*20.6*/(""".green
     """),format.raw/*21.6*/("""{"""),format.raw/*21.7*/("""
       """),format.raw/*22.8*/("""color: white;
       background-color: green;
     """),format.raw/*24.6*/("""}"""),format.raw/*24.7*/("""
     """),format.raw/*25.6*/(""".blue
     """),format.raw/*26.6*/("""{"""),format.raw/*26.7*/("""
       """),format.raw/*27.8*/("""color: white;
       background-color: blue;
     """),format.raw/*29.6*/("""}"""),format.raw/*29.7*/("""
     
    
"""),format.raw/*32.1*/("""/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar """),format.raw/*33.9*/("""{"""),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""margin-bottom: 50px;
    border-radius: 0;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""




"""),format.raw/*41.1*/("""h2"""),format.raw/*41.3*/("""{"""),format.raw/*41.4*/("""
"""),format.raw/*42.1*/("""font-size: xx-large;;
color: black;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
 
   """),format.raw/*46.4*/(""".carousel-inner"""),format.raw/*46.19*/("""{"""),format.raw/*46.20*/("""
    """),format.raw/*47.5*/("""height: 550px;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""  



"""),format.raw/*52.1*/(""".navbar """),format.raw/*52.9*/("""{"""),format.raw/*52.10*/("""
	"""),format.raw/*53.2*/("""margin-bottom: 50px;
	border-radius: 0;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""

"""),format.raw/*57.1*/(""".jumbotron """),format.raw/*57.12*/("""{"""),format.raw/*57.13*/("""
	"""),format.raw/*58.2*/("""margin-bottom: 0;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/("""body"""),format.raw/*61.5*/("""{"""),format.raw/*61.6*/("""
"""),format.raw/*62.1*/("""/* background-color: silver; */
background-color: silver; 
"""),format.raw/*64.1*/("""}"""),format.raw/*64.2*/("""

 """),format.raw/*66.2*/(""".bg-grey """),format.raw/*66.11*/("""{"""),format.raw/*66.12*/("""
      """),format.raw/*67.7*/("""background-color: lemonchiffon;
  """),format.raw/*68.3*/("""}"""),format.raw/*68.4*/("""
  
"""),format.raw/*70.1*/(""".bg-red"""),format.raw/*70.8*/("""{"""),format.raw/*70.9*/("""
"""),format.raw/*71.1*/("""/* background-color: silver; */
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""

"""),format.raw/*74.1*/("""h2"""),format.raw/*74.3*/("""{"""),format.raw/*74.4*/("""
"""),format.raw/*75.1*/("""font-size: xx-large;;
color: black;
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""

"""),format.raw/*79.1*/("""a"""),format.raw/*79.2*/("""{"""),format.raw/*79.3*/("""
"""),format.raw/*80.1*/("""font-size: large;
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""  

"""),format.raw/*83.1*/(""".logo """),format.raw/*83.7*/("""{"""),format.raw/*83.8*/("""
      """),format.raw/*84.7*/("""font-size: 200px;
  """),format.raw/*85.3*/("""}"""),format.raw/*85.4*/("""
 
 """),format.raw/*87.2*/(""".container-fluid """),format.raw/*87.19*/("""{"""),format.raw/*87.20*/("""
      """),format.raw/*88.7*/("""padding: 10px 5px;
  """),format.raw/*89.3*/("""}"""),format.raw/*89.4*/("""
  """),format.raw/*90.3*/("""h1   """),format.raw/*90.8*/("""{"""),format.raw/*90.9*/("""       """),format.raw/*90.16*/("""background-color: lemonchiffon;
    
   """),format.raw/*92.4*/("""}"""),format.raw/*92.5*/("""
   
   """),format.raw/*94.4*/("""</style>
 </head>
 <body>
 


  

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>

<body>
 <h1 align="center" >Employee Management System!</h1>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <a class="navbar-brand" href="#">Home</a>
     <a class="navbar-brand" href="/show">Employee</a>
        <a class="navbar-brand" href="/services">Services</a>
         <a class="navbar-brand" href="/aboutUs">About Us</a>
        
welcome <a href="#" class="navbar-brand">Varsha  </a>
         
    </div>
 

</nav>



  <div class="container ">
     <div class="row">
     
       <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
           <br />

           <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
               <ol class="carousel-indicators">
                   <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                   <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                   <li data-target="#carousel-example-generic" data-slide-to="2"></li>
               </ol>

               <div class="carousel-inner" role="listbox">
                   <div class="carousel-item active">
                      <img src="https://2f0m6a43zofy3ffa863wmmhv-wpengine.netdna-ssl.com/wp-content/uploads/2016/09/Best-Employee-Management-Software-for-My-Business.jpg" alt="New York">
                   </div>

                   <div class="carousel-item">
                       <img src="https://timesheetcalculatorapps.files.wordpress.com/2015/03/employee-management-system.jpg" alt="Second Slide" />

                  
                   </div>

                   <div class="carousel-item">
                       <img src="https://assets.entrepreneur.com/content/3x2/1300/20150903183433-businessmen-meeting-discussion-corporate-paperwork-colleague.jpeg" alt="Third Slide" />
                   </div>
               </div>

               <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                   <span class="icon-prev" aria-hidden="true"></span>
                   <span class="sr-only">Previous</span>
               </a>

               <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                   <span class="icon-next" aria-hidden="true"></span>
                   <span class="sr-only">Next</span>
               </a>
           </div>
           
       </div>
     </div>
   </div>
   
   



<div class="container-fluid bg-grey">
<div class="container">

  <div class="row">
    <div class="col-sm-4">
     <h2>About Company </h2>
      <span class="glyphicon glyphicon-globe logo"></span>
    </div>
    <div class="col-sm-8">
      <h2>Our Values</h2>
      <h5><strong>MISSION:</strong> Fidel IT Services assist you to transform your organization and improve performance. We aim to empower you to respond more quickly and intuitively to changing market dynamics. By our expert knowledge we enhance your ability to harness the right technology and become more agile and competitive.</h5>      
      <p><strong>VISION:</strong> The strategic goal of  organization today is automating as many workflows and processes as possible so that its people can work smarter, not harder. When a competitive marketplace is factored in, time and resource saving automated workflow management tools aren’t an option anymore, but a necessity. We provide the full range of outsourcing services to create management software which facilitates your business: CRM system development, ERP application development, information system integration and support. For example, we can offer not just CRM development, but also integrate it to SAP or MS Office: our CRM developers are true experts in this area.</p>
    </div>
  </div>
  </div>
</div>
     <!-- Footer  -->
<!--     <footer class="wow 
Fidel IT Services assist you to transform your organization and improve performance. We aim to empower you to respond more quickly and intuitively to changing market dynamics. By our expert knowledge we enhance your ability to harness the right technology and become more agile and competitive. h2">
    	<div class="container">
        	<div class="row" >
        	 <div class="col-sm-12">
        	<h5>Navigation</h5></div>
            	 <div class="col-sm-4">
      <a class="navbar-brand" href="#">Home</a></div>
    <div class="col-sm-4">
       <a class="navbar-brand" href="/show">Contact Us</a> </div>
                    <div class="col-sm-4">
      <a class="navbar-brand" href="#">Employess</a>
   
    </div>      
            </div>
        </div>
     
    </footer> -->
     <footer class="wow fadeInDown ">
     
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    	<div class="container">
     <div class="col-sm-12">
     
          <a class="navbar-brand" href="#">Navigation:</a>	</div>
    	 <div class="col-sm-4">
      <a class="navbar-brand" href="#">Home</a></div>
   <div class="col-sm-4">
       <a class="navbar-brand" href="/contactUs">Contact Us</a> </div>
                      <div class="col-sm-4">
      <a class="navbar-brand" href="/show">Employess</a>
</div>
    </div>
 </div>
 </footer>

</nav>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
   <script src="https://cdn.rawgit.com/twbs/bootstrap/v4-dev/dist/js/bootstrap.js"></script>
   
   
 </body>
 <script>
    $('.carousel').carousel("""),format.raw/*247.29*/("""{"""),format.raw/*247.30*/("""
        """),format.raw/*248.9*/("""interval: 2000
    """),format.raw/*249.5*/("""}"""),format.raw/*249.6*/(""")
</script>
</html>
 
 
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/home.scala.html
                  HASH: e1d06af2122ae405ee470edc923a948b52516b48
                  MATRIX: 825->2|1253->403|1281->404|1316->412|1392->461|1420->462|1453->468|1492->480|1520->481|1555->489|1633->540|1661->541|1694->547|1732->558|1760->559|1795->567|1872->617|1900->618|1939->630|2055->719|2084->720|2116->725|2186->768|2214->769|2246->774|2275->776|2303->777|2331->778|2394->814|2422->815|2455->821|2498->836|2527->837|2559->842|2601->857|2629->858|2662->864|2697->872|2726->873|2755->875|2822->915|2850->916|2879->918|2918->929|2947->930|2976->932|3021->950|3049->951|3078->953|3109->957|3137->958|3165->959|3251->1018|3279->1019|3309->1022|3346->1031|3375->1032|3409->1039|3470->1073|3498->1074|3529->1078|3563->1085|3591->1086|3619->1087|3678->1119|3706->1120|3735->1122|3764->1124|3792->1125|3820->1126|3883->1162|3911->1163|3940->1165|3968->1166|3996->1167|4024->1168|4069->1186|4097->1187|4128->1191|4161->1197|4189->1198|4223->1205|4270->1225|4298->1226|4329->1230|4374->1247|4403->1248|4437->1255|4485->1276|4513->1277|4543->1280|4575->1285|4603->1286|4638->1293|4705->1333|4733->1334|4768->1342|10963->7508|10993->7509|11030->7518|11077->7537|11106->7538
                  LINES: 32->3|45->16|45->16|46->17|48->19|48->19|49->20|50->21|50->21|51->22|53->24|53->24|54->25|55->26|55->26|56->27|58->29|58->29|61->32|62->33|62->33|63->34|65->36|65->36|70->41|70->41|70->41|71->42|73->44|73->44|75->46|75->46|75->46|76->47|77->48|77->48|81->52|81->52|81->52|82->53|84->55|84->55|86->57|86->57|86->57|87->58|88->59|88->59|90->61|90->61|90->61|91->62|93->64|93->64|95->66|95->66|95->66|96->67|97->68|97->68|99->70|99->70|99->70|100->71|101->72|101->72|103->74|103->74|103->74|104->75|106->77|106->77|108->79|108->79|108->79|109->80|110->81|110->81|112->83|112->83|112->83|113->84|114->85|114->85|116->87|116->87|116->87|117->88|118->89|118->89|119->90|119->90|119->90|119->90|121->92|121->92|123->94|276->247|276->247|277->248|278->249|278->249
                  -- GENERATED --
              */
          