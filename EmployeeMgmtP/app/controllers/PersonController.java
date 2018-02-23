package controllers;

import static play.libs.Json.toJson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.inject.Inject;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;

import models.ContactBean;
import models.PersonBean;
import models.PersonBeanRepository;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

/**
 * The controller keeps all database operations behind the repository, and uses
 * {@link play.libs.concurrent.HttpExecutionContext} to provide access to the
 * {@link play.mvc.Http.Context} methods like {@code request()} and {@code flash()}.
 */
public class PersonController extends Controller {

    private final FormFactory formFactory;
    private final PersonBeanRepository personRepository;
    private final HttpExecutionContext ec;

    @Inject
    public PersonController(FormFactory formFactory, PersonBeanRepository personRepository, HttpExecutionContext ec) {
        this.formFactory = formFactory;
        this.personRepository = personRepository;
        this.ec = ec;
    }
    
    
 
  

    

    public Result index() {
        return ok(views.html.index.render());
    }
 
    public Result login() {
        return ok(views.html.login.render());
    }
    public Result delete() {
        return ok(views.html.delete.render());
    }

   public Result update() {
        return ok(views.html.update.render());
    }

   public Result home() {
	   
        return ok(views.html.home.render());
    }
   public Result aboutUs() {
       return ok(views.html.aboutUs.render());
   }
   public Result contactUs() {
       return ok(views.html.contactUs.render());
   }
   public Result services() {
       return ok(views.html.services.render());
   }
   
 
  /* public Result uploadFile() {
       return ok(views.html.uploadFile.render());
   }*/
 /*  public Result employee() {
       return ok(views.html.emp.render());
   }*/
   
   
   private static String SMTP_HOST = "smtp.gmail.com";  
   private static String USER_NAME = "varshakurnawal0131@gmail.com";  // GMail user name (just the part before "@gmail.com")
   private static String PASSWORD = "VA23&ha@0131"; // GMail password
  /* private static String RECIPIENT = "varsha.kurnawal@fidelitservices.com";*/
   
   private static String[] RECIPIENT = new String[]{"varsha.kurnawal@fidelitservices.com","varshakurnawal0131@gmail.com"};  
   
   private static String FROM_NAME = "Varsha";  
 
   
   public CompletionStage<Result> verifyPerson() {
   	
       PersonBean person = formFactory.form(PersonBean.class).bindFromRequest().get();
       System.out.println("person inside add person()::::"+person);
       System.out.println("Result : "+personRepository.verify(person).toString());
       return personRepository.verify(person).thenApplyAsync(p -> {
    	   System.out.println("p----------------------------------="+p);
       	if(p.equals(false))
       	{
       		
       		return redirect(routes.PersonController.login());
       	}
       	else
       	{
       		
           return redirect(routes.PersonController.home());
       	}
       }, ec.current());
   }
    
    public CompletionStage<Result> addPerson() {
    	
    	System.out.println("inside Add Person-------------------------------------");
        PersonBean person = formFactory.form(PersonBean.class).bindFromRequest().get();
        System.out.println("person inside add person()::::"+person.email);
        System.out.println("Inside ");
       // System.out.println("person inside add person()::::"+person);
        return personRepository.add(person).thenApplyAsync(p -> {
        	
            return redirect(routes.PersonController.home());
        }, ec.current());
    }
    
  public CompletionStage<Result> contactPerson() {
	  System.out.println("inside contact Person-------------------------------------");
	  
      ContactBean person = formFactory.form(ContactBean.class).bindFromRequest().get();
      
	  
	  
	  Http.MultipartFormData<File> body1 = request().body().asMultipartFormData();
	    Http.MultipartFormData.FilePart<File> file = body1.getFile("file");
	   
	        String fileName = file.getFilename();
	        System.out.println("fileName-----------------------------------------------------"+fileName);
	        String contentType = file.getContentType();
	        File file1 = file.getFile();
	        System.out.println("file1------------------------------------------------------------"+file1);
	        System.out.println("person.message----------------------------------------------------"+person.message);
	        System.out.println("---------------Helllllllllllllllllllllllllllllllllo----------------------------------------------------");
	        System.out.println("---------------Helllllllllllllllllllllllllllllllllo----------------------------------------------------"+RECIPIENT);
		      
	        try {
	            FileUtils.moveFile(file1, new File("/home/fidel113/WorkSpace", fileName));
	        } catch (IOException ioe) {
	            System.out.println("Problem operating on filesystem");
	        }
	  
	         
      String personName=person.name;
      String personEmail=person.email;
      String personSubject=person.subject;
      String personPhone=person.phone;
      String personMessage=person.message;
      File personFile=person.file;
      
      
      
     
  	  String from = USER_NAME;
  	    String pass = PASSWORD;
  	    String[] to = RECIPIENT; // list of recipient email addresses
  	    String subject = "Contact Deatils";
  	    String bodyy = "Your Conatct Details are:\nContact Person Name:"+personName+"\nContact Person EmailId:"+personEmail+"\nContact Person Subject:"+personSubject+
  	    		"\nContact Person Phone:"+personPhone+"\nContact Person Message:"+personMessage;
  	    
  	    
  	 
  	 
  	 /* sendFromGMail(from, pass, to, subject, bodyy,personFile);*/
  	    
  	   
	        
	      /*  return ok("File uploaded");*/
	    
	    
  
  	 sendFromGMail(from, pass, to, subject, bodyy,file1);
        
        return personRepository.addContact(person).thenApplyAsync(p -> {
        	
            return redirect(routes.PersonController.home());
        }, ec.current());
    }
    

    private void sendFromGMail(String from, String pass, String[] to, String subject, String bodyy,File personFile) {
	// TODO Auto-generated method stub
    	  Properties props = System.getProperties();
    	    String host = "smtp.gmail.com";
    	    props.put("mail.smtp.starttls.enable", "true");
    	    props.put("mail.smtp.host", host);
    	    props.put("mail.smtp.user", from);
    	    props.put("mail.smtp.password", pass);
    	    props.put("mail.smtp.port", "587");
    	    props.put("mail.smtp.auth", "true");

    	    Session session = Session.getDefaultInstance(props);
    	    MimeMessage message = new MimeMessage(session);

    	    try {
    	        message.setFrom(new InternetAddress(from));
    	        InternetAddress[] toAddress = new InternetAddress[to.length];

    	        // To get the array of addresses
    	        for( int i = 0; i < to.length; i++ ) {
    	        	
    	            toAddress[i] = new InternetAddress(to[i]);
    	            System.out.println("Recipeirn---------------------------------------------------"+toAddress[i]);
    	        }

    	        for( int i = 0; i < toAddress.length; i++) {
    	        	
    	            message.addRecipient(Message.RecipientType.TO, toAddress[i]);
    	        }

    	        message.setSubject(subject);
    	       /* message.setText(body);*/
    	        
    	        
    	        BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(bodyy, "text/plain");
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
/*
                
              for (int k = 0; k < personFile.length; k++) {
            	
                  String filename = personFile[k];
                  
                  MimeBodyPart attachmentBodyPart = new MimeBodyPart();
                  DataSource source = new FileDataSource(files);
                  attachmentBodyPart.setDataHandler(new DataHandler(source));
                  attachmentBodyPart.setFileName(files.getName());
                  multipart.addBodyPart(attachmentBodyPart);
                  }

                  message.setContent(multipart);
    	        
    	        */
    	        
                
              /*  for (int k = 0; k < files.length; k++) {*/
              	
                System.out.println("-----------------------------Filepath----------------------------"+personFile.getAbsolutePath());
                System.out.println("---------------------------- Parent -Filepath----------------------------"+personFile.getAbsoluteFile());
              
                    MimeBodyPart attachmentBodyPart = new MimeBodyPart();
                    DataSource source = new FileDataSource(personFile);
                    attachmentBodyPart.setDataHandler(new DataHandler(source));
                    attachmentBodyPart.setFileName(personFile.getName());
                    multipart.addBodyPart(attachmentBodyPart);
                  /*  }*/

                    message.setContent(multipart);
    	        Transport transport = session.getTransport("smtp");
    	        transport.connect(host, from, pass);
    	        transport.sendMessage(message, message.getAllRecipients());
    	        transport.close();
    	    }
    	    catch (AddressException ae) {
    	        ae.printStackTrace();
    	    }
    	    catch (MessagingException me) {
    	        me.printStackTrace();
    	    }
	
}

	public CompletionStage<Result> getPersons() {
    	System.out.println("called from home page::::::::::----------------------------------------::::::");
    	System.out.println("Inside getPersons()");
        return personRepository.list().thenApplyAsync(personStream -> {
            return ok(toJson(personStream.collect(Collectors.toList())));
        }, ec.current());
    }

     

    @Transactional
    public CompletionStage<Result> deletePerson() {
    	
        PersonBean person = formFactory.form(PersonBean.class).bindFromRequest().get();
       System.out.println("person inside controoler delete person()::::"+person.name);
        return personRepository.delete(person).thenApplyAsync(p -> {
        	
            return redirect(routes.PersonController.delete());
        }, ec.current());
    }

    @Transactional
    public CompletionStage<Result> updatePerson(String name) {
    	System.out.println("inside post::::"+name );
    	
        PersonBean person = formFactory.form(PersonBean.class).bindFromRequest().get();
      // System.out.println("person inside controoler update person()::::"+person.name);
        return personRepository.update(person,name).thenApplyAsync(p -> {
        	
            return redirect(routes.PersonController.update());
        }, ec.current());
    }
    
    public Result updation() {
    	
    	
    	
    	 DynamicForm requestData = formFactory.form().bindFromRequest();
    	    String firstname = requestData.get("name");
    	   System.out.println("firstname::::"+firstname);
    	
        return ok(views.html.updation.render(firstname));
    }
    
    
    @Transactional
    public Result getData() {
        List<PersonBean> persons = (List<PersonBean>) JPA.em().createQuery("select p    from PersonBean p").getResultList();
        System.out.println("data:::------------------------------"+persons.toString());
        return ok(views.html.emp.render(persons));
    }
    
  /*  @Transactional
    public Result displayData() {
    	
    	 List<PersonBean> persons = (List<PersonBean>) JPA.em().createQuery("select p    from PersonBean p").getResultList();
         System.out.println("data:::------------------------------"+persons.toString());
         return ok(views.html.showEmp.render(persons));
    }*/
    
    
    public CompletionStage<Result> displayData() {
    	
    	
    	  
    	      

    	    
    	
    	
        PersonBean person = formFactory.form(PersonBean.class).bindFromRequest().get();
        System.out.println("person inside displayData person()::::"+person.email);
        System.out.println("Result : "+personRepository.verify(person).toString());
        return personRepository.showData(person).thenApplyAsync(p -> {
     	   System.out.println("p----------------------------------="+p.email);
        	
     	  return ok(views.html.showEmp.render(p));
        
        }, ec.current());
    }

	

	public CompletionStage<Result> deleterec() {
    	

	  
        PersonBean person = formFactory.form(PersonBean.class).bindFromRequest().get();
        System.out.println("person inside deleterec person()::::"+person.email);
        System.out.println("Result : "+personRepository.verify(person).toString());
        return personRepository.deleteData(person).thenApplyAsync(p -> {
     	   System.out.println("p----------------------------------="+p.email);
        	
     	  return redirect(routes.PersonController.getData());
        
        }, ec.current());
    }
	
	
	/*public Result upload() {
	    Http.MultipartFormData<File> body = request().body().asMultipartFormData();
	    Http.MultipartFormData.FilePart<File> file = body.getFile("file");
	    if (file != null) {
	        String fileName = file.getFilename();
	        String contentType = file.getContentType();
	        File file1 = file.getFile();
	        
	        
	        try {
	            FileUtils.moveFile(file1, new File("/home/fidel113/WorkSpace", fileName));
	        } catch (IOException ioe) {
	            System.out.println("Problem operating on filesystem");
	        } 
	        
	        return ok("File uploaded");
	    } else {
	        flash("error", "Missing file");
	        return badRequest();
	    }
	    
	    
	    
	  
	}*/
	
}
