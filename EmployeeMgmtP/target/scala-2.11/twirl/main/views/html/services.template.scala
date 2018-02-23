
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object services_Scope0 {
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

class services extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
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
     """),format.raw/*14.6*/("""{"""),format.raw/*14.7*/("""
       """),format.raw/*15.8*/("""color: white;
       background-color: red;
     """),format.raw/*17.6*/("""}"""),format.raw/*17.7*/("""
     """),format.raw/*18.6*/(""".green
     """),format.raw/*19.6*/("""{"""),format.raw/*19.7*/("""
       """),format.raw/*20.8*/("""color: white;
       background-color: green;
     """),format.raw/*22.6*/("""}"""),format.raw/*22.7*/("""
     """),format.raw/*23.6*/(""".blue
     """),format.raw/*24.6*/("""{"""),format.raw/*24.7*/("""
       """),format.raw/*25.8*/("""color: white;
       background-color: blue;
     """),format.raw/*27.6*/("""}"""),format.raw/*27.7*/("""
     
    
"""),format.raw/*30.1*/("""/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar """),format.raw/*31.9*/("""{"""),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""margin-bottom: 50px;
    border-radius: 0;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""




"""),format.raw/*39.1*/("""h2"""),format.raw/*39.3*/("""{"""),format.raw/*39.4*/("""
"""),format.raw/*40.1*/("""font-size: xx-large;;
color: black;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""
 
   """),format.raw/*44.4*/(""".carousel-inner"""),format.raw/*44.19*/("""{"""),format.raw/*44.20*/("""
    """),format.raw/*45.5*/("""height: 550px;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""  



"""),format.raw/*50.1*/(""".navbar """),format.raw/*50.9*/("""{"""),format.raw/*50.10*/("""
	"""),format.raw/*51.2*/("""margin-bottom: 50px;
	border-radius: 0;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/(""".jumbotron """),format.raw/*55.12*/("""{"""),format.raw/*55.13*/("""
	"""),format.raw/*56.2*/("""margin-bottom: 0;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

"""),format.raw/*59.1*/("""body"""),format.raw/*59.5*/("""{"""),format.raw/*59.6*/("""
"""),format.raw/*60.1*/("""/* background-color: silver; */
background-color: silver; 
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""

 """),format.raw/*64.2*/(""".bg-grey """),format.raw/*64.11*/("""{"""),format.raw/*64.12*/("""
      """),format.raw/*65.7*/("""background-color: lemonchiffon;
  """),format.raw/*66.3*/("""}"""),format.raw/*66.4*/("""
  
"""),format.raw/*68.1*/(""".bg-red"""),format.raw/*68.8*/("""{"""),format.raw/*68.9*/("""
"""),format.raw/*69.1*/("""/* background-color: silver; */
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""

"""),format.raw/*72.1*/("""h2"""),format.raw/*72.3*/("""{"""),format.raw/*72.4*/("""
"""),format.raw/*73.1*/("""font-size: xx-large;;
color: black;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""

"""),format.raw/*77.1*/("""a"""),format.raw/*77.2*/("""{"""),format.raw/*77.3*/("""
"""),format.raw/*78.1*/("""font-size: large;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""  

"""),format.raw/*81.1*/(""".logo """),format.raw/*81.7*/("""{"""),format.raw/*81.8*/("""
      """),format.raw/*82.7*/("""font-size: 100px;
  """),format.raw/*83.3*/("""}"""),format.raw/*83.4*/("""
 
 """),format.raw/*85.2*/(""".container-fluid """),format.raw/*85.19*/("""{"""),format.raw/*85.20*/("""
      """),format.raw/*86.7*/("""padding: 10px 5px;
  """),format.raw/*87.3*/("""}"""),format.raw/*87.4*/("""
  """),format.raw/*88.3*/("""h1   """),format.raw/*88.8*/("""{"""),format.raw/*88.9*/("""       """),format.raw/*88.16*/("""background-color: lemonchiffon;
    
   """),format.raw/*90.4*/("""}"""),format.raw/*90.5*/("""
   



"""),format.raw/*95.1*/(""".containerrr"""),format.raw/*95.13*/("""{"""),format.raw/*95.14*/("""
  """),format.raw/*96.3*/("""width:100%;
  height:500px;
  overflow:hidden;
  
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""
"""),format.raw/*101.1*/(""".img """),format.raw/*101.6*/("""{"""),format.raw/*101.7*/("""
  """),format.raw/*102.3*/("""width:100%;
);
"""),format.raw/*104.1*/("""}"""),format.raw/*104.2*/("""
"""),format.raw/*105.1*/(""".centered """),format.raw/*105.11*/("""{"""),format.raw/*105.12*/("""
    """),format.raw/*106.5*/("""position: absolute;
    
  color: white;
    top: 35%;
     left: 35%;
   
    
"""),format.raw/*113.1*/("""}"""),format.raw/*113.2*/("""

 """),format.raw/*115.2*/(""".show   """),format.raw/*115.10*/("""{"""),format.raw/*115.11*/("""       """),format.raw/*115.18*/("""background-color: white;
    
   """),format.raw/*117.4*/("""}"""),format.raw/*117.5*/("""
   
   """),format.raw/*119.4*/("""</style>
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
     <a class="navbar-brand" href="/home">Home</a>
     <a class="navbar-brand" href="/show">Employee</a>
        <a class="navbar-brand" href="/services">Services</a>
         <a class="navbar-brand" href="/aboutUs">About Us</a>
    </div>
 

</nav>



  <div class="containerrr">
  <img src="https://wee-websitedesigns.uk/wp-content/uploads/2015/08/onePage-people-1000.jpg" class="img" /> 
   
    <div class="centered"><div style="font-size:45px" align="center">Web Development Services</div>
<div style="font-size:20px;"align="center" >Creative Ideas Need Fresh Mind to Invent Solutions   </div>

</div>

   
    
</div>
   
   


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">  

<div class="container-fluid bg-grey">
<div class="container">

  <div class="row">
    <div class="col-sm-2">
 <!--     <h2>About Company </h2> -->
      <span class="glyphicon glyphicon-signal logo"></span>
    </div>
    <div class="col-sm-5">
      <h2>Our Thought Process</h2>
   <p>  We stats with requirement gathering and if clients are not clear with complete scenario of scope then our business analyst assist in the same. After this we draw wireframes to come on same page, fill the color and bring it into live.  </div>
 </p> 
 
   <div class="col-sm-1">
 <!--     <h2>About Company </h2> -->
      <span class="fa fa-paper-plane logo" style=" font-size: 58px;"></span>
      

    </div>
 
     <div class="col-sm-4">
      <h2>Why Outsource to FITS</h2>
   <p> The world is getting closer, outsourcing web design and development work isn’t new on the horizon. In fact businesses across the globe found that it is profitable in terms of expenditure, time and investment. </p> 
 
 
 </div>
  </div>
</div>



<div class="show">
<div class="container-fluid ">
<div class="container">
  <div class="row">
 
 
     <div class="col-sm-12">
      <h3>The Pros Of Outsourcing Your Web Design and Development To A Professional Web Development Company
</h3>
<p align="center">Let us know your vision to deliver web presence which complement it!</p>
  
 
 </div>
  </div>
</div>

     
 
     <footer class="wow fadeInDown ">
     
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    	<div class="container">
     <div class="col-sm-12">
     
          <a class="navbar-brand" href="#">Navigation:</a>	</div>
    	 <div class="col-sm-4">
      <a class="navbar-brand" href="/home">Home</a></div>
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
object services extends services_Scope0.services
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/services.scala.html
                  HASH: d6ad4d02cdb857afe38f84d4f05df61f1523a788
                  MATRIX: 833->0|1261->401|1289->402|1324->410|1400->459|1428->460|1461->466|1500->478|1528->479|1563->487|1641->538|1669->539|1702->545|1740->556|1768->557|1803->565|1880->615|1908->616|1947->628|2063->717|2092->718|2124->723|2194->766|2222->767|2254->772|2283->774|2311->775|2339->776|2402->812|2430->813|2463->819|2506->834|2535->835|2567->840|2609->855|2637->856|2670->862|2705->870|2734->871|2763->873|2830->913|2858->914|2887->916|2926->927|2955->928|2984->930|3029->948|3057->949|3086->951|3117->955|3145->956|3173->957|3259->1016|3287->1017|3317->1020|3354->1029|3383->1030|3417->1037|3478->1071|3506->1072|3537->1076|3571->1083|3599->1084|3627->1085|3686->1117|3714->1118|3743->1120|3772->1122|3800->1123|3828->1124|3891->1160|3919->1161|3948->1163|3976->1164|4004->1165|4032->1166|4077->1184|4105->1185|4136->1189|4169->1195|4197->1196|4231->1203|4278->1223|4306->1224|4337->1228|4382->1245|4411->1246|4445->1253|4493->1274|4521->1275|4551->1278|4583->1283|4611->1284|4646->1291|4713->1331|4741->1332|4776->1340|4816->1352|4845->1353|4875->1356|4953->1406|4982->1407|5011->1408|5044->1413|5073->1414|5104->1417|5147->1432|5176->1433|5205->1434|5244->1444|5274->1445|5307->1450|5415->1530|5444->1531|5475->1534|5512->1542|5542->1543|5578->1550|5639->1583|5668->1584|5704->1592
                  LINES: 32->1|45->14|45->14|46->15|48->17|48->17|49->18|50->19|50->19|51->20|53->22|53->22|54->23|55->24|55->24|56->25|58->27|58->27|61->30|62->31|62->31|63->32|65->34|65->34|70->39|70->39|70->39|71->40|73->42|73->42|75->44|75->44|75->44|76->45|77->46|77->46|81->50|81->50|81->50|82->51|84->53|84->53|86->55|86->55|86->55|87->56|88->57|88->57|90->59|90->59|90->59|91->60|93->62|93->62|95->64|95->64|95->64|96->65|97->66|97->66|99->68|99->68|99->68|100->69|101->70|101->70|103->72|103->72|103->72|104->73|106->75|106->75|108->77|108->77|108->77|109->78|110->79|110->79|112->81|112->81|112->81|113->82|114->83|114->83|116->85|116->85|116->85|117->86|118->87|118->87|119->88|119->88|119->88|119->88|121->90|121->90|126->95|126->95|126->95|127->96|131->100|131->100|132->101|132->101|132->101|133->102|135->104|135->104|136->105|136->105|136->105|137->106|144->113|144->113|146->115|146->115|146->115|146->115|148->117|148->117|150->119
                  -- GENERATED --
              */
          