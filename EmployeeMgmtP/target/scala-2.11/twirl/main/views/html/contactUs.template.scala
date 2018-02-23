
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactUs_Scope0 {
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

class contactUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Welcome to Play")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""


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
	


</head>

<body class="bodycolor">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <h1 align="center">Employee Management System!</h1>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <a class="navbar-brand" href="/home">Home</a>
     <a class="navbar-brand" href="/show">Employee</a>
        <a class="navbar-brand" href="/services">Services</a>
         <a class="navbar-brand" href="/aboutUs">About Us</a>
    </div>
 

</nav>  <h1 align="center">Contact Us</h1>
	

<form   method="post" name="form1" 
id="form1" action=""""),_display_(/*167.21*/routes/*167.27*/.PersonController.contactPerson()),format.raw/*167.60*/("""" enctype="multipart/form-data">

<div style="width: 70%;
    position: relative;
    left: 197px;";>
  
<b style=" margin-top: 30px;
    margin-left: 50px;font-size: 18px;align="center"">
We are Here             </b>                                                                                                                            

<div style="    margin-left: 49px;
    font-size: 20px;">
    <div>
<p> 
<i class="fa fa-home"> Office No.2, Windsor Commerce Condominium, S.No. 2/8/1, Baner Road, Baner, Pune - 411045, MH India </i></p>
<p><i class="fa fa-phone"> +91 969 935 6148</i></p>
<p><i class="fa fa-envelope-o"></i> info@fidelitservices.com</p>
</div><div><div class="col-sm-6">
<label><br />


    <span class="wpcf7-form-control-wrap your-name"><input type="text" name="name" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-validates-as-required" aria-required="true" aria-invalid="false" placeholder="Your Name"  required/></span> </label>
</div>
<div class="col-sm-6">
<label><br />
    <span class="wpcf7-form-control-wrap your-email"><input type="email" name="email" value="" size="40" class="wpcf7-form-control wpcf7-text wpcf7-email wpcf7-validates-as-required wpcf7-validates-as-email" aria-required="true" aria-invalid="false" placeholder="Email Address" required /></span> </label>
</div>
<div class="col-sm-6">
<label><br />
    <span class="wpcf7-form-control-wrap your-subject"><input type="text" name="subject" value="" size="40" class="wpcf7-form-control wpcf7-text" aria-invalid="false" placeholder="Subject" required /></span> </label>
</div>
<div class="col-sm-6">
<label><br />
    <span class="wpcf7-form-control-wrap your-subject"><input type="text" name="phone" value="" size="40" class="wpcf7-form-control wpcf7-text" aria-invalid="false" placeholder="Contact-Number" required /></span> </label>
</div>
<div class="col-sm-12">
<label><br />
    <span class="wpcf7-form-control-wrap your-message"><textarea name="message" cols="40" rows="10" class="wpcf7-form-control wpcf7-textarea" aria-invalid="false" placeholder="Message" required></textarea></span> </label>
</div></div>
<div style="    position: relative;
    left: 1000px;
    bottom: 305px;">
  <input type="file" id="file" name="file" />
 
  </div>
<div class="contact-last_button">
<input type="submit" value="Send" class="wpcf7-form-control wpcf7-submit" />
</div>
</div>
 


 
</b></h1></div></form>

 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
 
<!-- <form enctype="multipart/form-data">
<div style="    position: relative;
    left: 1000px;
    bottom: 305px;">
  <input type="file" id="file" name="file" />
  <input type="submit" id="submit" name="" value="Upload" />
  </div>
</form> -->

<!-- <script>
$('#submit').click(function (event) """),format.raw/*234.37*/("""{"""),format.raw/*234.38*/("""
   """),format.raw/*235.4*/("""event.preventDefault();
   var file = $('#file').get(0).files[0];
   var formData = new FormData();
   formData.append('file', file);
   //alert("file::::::::::::::::;"+file);
   $.ajax("""),format.raw/*240.11*/("""{"""),format.raw/*240.12*/("""
       """),format.raw/*241.8*/("""url: 'contact',
       data: formData,
       type: 'POST',
       contentType: false,
       processData: false,
       beforeSend: function (data) """),format.raw/*246.36*/("""{"""),format.raw/*246.37*/("""
         """),format.raw/*247.10*/("""alert('Are you sure you want to upload document?');
       """),format.raw/*248.8*/("""}"""),format.raw/*248.9*/(""",
       success: function (data) """),format.raw/*249.33*/("""{"""),format.raw/*249.34*/("""
         """),format.raw/*250.10*/("""//call your jQuery action here
         alert('Upload completed: ' + data);
       """),format.raw/*252.8*/("""}"""),format.raw/*252.9*/(""",
       error: function (jqXHR, textStatus, errorThrown) """),format.raw/*253.57*/("""{"""),format.raw/*253.58*/("""
         """),format.raw/*254.10*/("""alert(textStatus + ': ' + errorThrown);
       """),format.raw/*255.8*/("""}"""),format.raw/*255.9*/("""
    """),format.raw/*256.5*/("""}"""),format.raw/*256.6*/(""");
    return false;
"""),format.raw/*258.1*/("""}"""),format.raw/*258.2*/(""");
</script> -->
   
<!--      <footer class="wow fadeInDown " id="footer">
     
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
 </footer> -->



 </form>
 


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
object contactUs extends contactUs_Scope0.contactUs
              /*
                  -- GENERATED --
                  DATE: Fri Feb 23 16:56:02 IST 2018
                  SOURCE: /home/fidel113/git/EmployeeMgmtP/EmployeeMgmtP/app/views/contactUs.scala.html
                  HASH: 6d2e296ff417c254f86dafa3b4b118cf0cb89942
                  MATRIX: 835->2|866->25|905->27|938->31|966->33|1394->434|1422->435|1457->443|1533->492|1561->493|1594->499|1633->511|1661->512|1696->520|1774->571|1802->572|1835->578|1873->589|1901->590|1936->598|2013->648|2041->649|2080->661|2196->750|2225->751|2257->756|2327->799|2355->800|2387->805|2416->807|2444->808|2472->809|2535->845|2563->846|2596->852|2639->867|2668->868|2700->873|2742->888|2770->889|2803->895|2838->903|2867->904|2896->906|2963->946|2991->947|3020->949|3059->960|3088->961|3117->963|3162->981|3190->982|3219->984|3250->988|3278->989|3306->990|3397->1054|3425->1055|3454->1057|3489->1065|3518->1066|3546->1067|3599->1093|3627->1094|3656->1096|3690->1103|3718->1104|3746->1105|3805->1137|3833->1138|3862->1140|3891->1142|3919->1143|3947->1144|4010->1180|4038->1181|4069->1185|4101->1190|4129->1191|4164->1198|4231->1238|4259->1239|4288->1241|4326->1251|4355->1252|4383->1253|4436->1279|4464->1280|4492->1281|4540->1301|4569->1302|4601->1307|4743->1422|4771->1423|4801->1425|4859->1454|4889->1455|4925->1463|5067->1576|5097->1577|5135->1587|5179->1602|5209->1603|5238->1604|5282->1620|5311->1621|5342->1624|5378->1632|5408->1633|5441->1638|5524->1693|5553->1694|5582->1695|5634->1718|5664->1719|5704->1730|5828->1826|5857->1827|5890->1832|6986->2900|7002->2906|7057->2939|9893->5747|9923->5748|9955->5752|10170->5938|10200->5939|10236->5947|10414->6096|10444->6097|10483->6107|10570->6166|10599->6167|10662->6201|10692->6202|10731->6212|10842->6295|10871->6296|10958->6354|10988->6355|11027->6365|11102->6412|11131->6413|11164->6418|11193->6419|11242->6440|11271->6441
                  LINES: 32->2|32->2|32->2|35->5|37->7|50->20|50->20|51->21|53->23|53->23|54->24|55->25|55->25|56->26|58->28|58->28|59->29|60->30|60->30|61->31|63->33|63->33|66->36|67->37|67->37|68->38|70->40|70->40|75->45|75->45|75->45|76->46|78->48|78->48|80->50|80->50|80->50|81->51|82->52|82->52|86->56|86->56|86->56|87->57|89->59|89->59|91->61|91->61|91->61|92->62|93->63|93->63|95->65|95->65|95->65|96->66|98->68|98->68|100->70|100->70|100->70|101->71|103->73|103->73|105->75|105->75|105->75|106->76|107->77|107->77|109->79|109->79|109->79|110->80|112->82|112->82|114->84|114->84|114->84|114->84|116->86|116->86|118->88|118->88|118->88|119->89|121->91|121->91|122->92|122->92|122->92|123->93|128->98|128->98|130->100|130->100|130->100|131->101|135->105|135->105|137->107|137->107|137->107|138->108|139->109|139->109|142->112|142->112|142->112|143->113|147->117|147->117|148->118|148->118|148->118|150->120|155->125|155->125|157->127|197->167|197->167|197->167|264->234|264->234|265->235|270->240|270->240|271->241|276->246|276->246|277->247|278->248|278->248|279->249|279->249|280->250|282->252|282->252|283->253|283->253|284->254|285->255|285->255|286->256|286->256|288->258|288->258
                  -- GENERATED --
              */
          