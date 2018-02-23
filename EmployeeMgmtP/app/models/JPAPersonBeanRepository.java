package models;

import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import play.db.jpa.JPA;
import play.db.jpa.JPAApi;

/**
 * Provide JPA operations running inside of a thread pool sized to the connection pool
 */
public class JPAPersonBeanRepository implements PersonBeanRepository {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public JPAPersonBeanRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<ContactBean> addContact(ContactBean PersonBean) {
    	//System.out.println("hellooo");
        return supplyAsync(() -> wrap(em -> insertContact(em, PersonBean)), executionContext);
    }
    @Override
    public CompletionStage<PersonBean> add(PersonBean PersonBean) {
    	//System.out.println("hellooo");
        return supplyAsync(() -> wrap(em -> insert(em, PersonBean)), executionContext);
    }
    
    public CompletionStage<PersonBean> delete(PersonBean PersonBean) {
    	//System.out.println("hellooo");
        return supplyAsync(() -> wrap(em -> deletion(em, PersonBean)), executionContext);
    }
    
    public CompletionStage<PersonBean> update(PersonBean PersonBean,String s) {
    	//System.out.println("hellooo");
        return supplyAsync(() -> wrap(em -> updation(em, PersonBean,s)), executionContext);
    }

    
    @Override
    public CompletionStage<Stream<PersonBean>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }
    
	
	 @Override
	    public CompletionStage<Boolean> verify(PersonBean PersonBean) {
	    	//System.out.println("hellooo");
	        return supplyAsync(() -> wrap(em -> validate(em, PersonBean)), executionContext);
	    }
	 @Override
	    public CompletionStage<PersonBean> showData(PersonBean PersonBean) {
	    	//System.out.println("hellooo");
	        return supplyAsync(() -> wrap(em -> dispData(em, PersonBean)), executionContext);
	    }
	 @Override
	    public CompletionStage<PersonBean> deleteData(PersonBean PersonBean) {
	    	//System.out.println("hellooo");
	        return supplyAsync(() -> wrap(em -> deleterecord(em, PersonBean)), executionContext);
	    }
  

	private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private PersonBean insert(EntityManager em, PersonBean PersonBean) {
    	System.out.println("PersonBean insert:::::::::::::::::::::  ::"+PersonBean);

       // Logger.info("PersonBean is: " + PersonBean);
      
        em.merge(PersonBean);
               return PersonBean;
    }
    private ContactBean insertContact(EntityManager em, ContactBean PersonBean) {
    	System.out.println("PersonBean insert:::::::::::::::::::::  ::"+PersonBean.email);

       // Logger.info("PersonBean is: " + PersonBean);
      
        em.merge(PersonBean);
               return PersonBean;
    }
    private boolean validate(EntityManager em, PersonBean PersonBean) {
    	
    
    	try {
    	PersonBean per =em.find(PersonBean.class,PersonBean.email);
    	System.out.println("personBean.email::::"+PersonBean.email);
    	System.out.println("personBean.pass::::"+PersonBean.psw);
    	System.out.println("personBean.email::::"+per.email);
    	System.out.println("personBean.pass::::::::"+per.psw);
    	System.out.println("personBean.phone::::::::"+per.phone);
    	System.out.println("personBean.address::::::::"+per.address);
 
    	if(PersonBean.email.equals(per.email) && PersonBean.psw.equals(per.psw))
    	{
    	System.out.println(":::::::::::::::;"+per.email);
    	System.out.println(":::::::::::::::;"+per.psw);
    	System.out.println(" valid User");
    	return true;
    	}
    	else
    	{
            System.out.println("not valid User");	
            return false;
            
    	}
    	
    	}
    	catch(Exception e)
    	{
    		
    		System.out.println("not valid User");
    		return false;
    	}
  
    	
    }

    private PersonBean deleterecord(EntityManager em, PersonBean PersonBean) {
    	
        
    System.out.println("inside deleterecord---------------------------------- ");
    	PersonBean per =em.find(PersonBean.class,PersonBean.email);
    	System.out.println("personBean.name::::"+PersonBean.name);
    	System.out.println("personBean.lname::::"+PersonBean.lname);
    	System.out.println("personBean.address::::"+PersonBean.address);
    	System.out.println("personBean.phone::::::::"+PersonBean.phone);
    	System.out.println("personBean.pass::::::::"+PersonBean.psw);
 
    	em.remove(per);
    	return per;
    	
    }
    
    private PersonBean dispData(EntityManager em, PersonBean PersonBean) {
    	
        
        
    	PersonBean per =em.find(PersonBean.class,PersonBean.email);
    	System.out.println("personBean.name::::"+PersonBean.name);
    	System.out.println("personBean.lname::::"+PersonBean.lname);
    	System.out.println("personBean.address::::"+PersonBean.address);
    	System.out.println("personBean.phone::::::::"+PersonBean.phone);
    	System.out.println("personBean.pass::::::::"+PersonBean.psw);
 
    	
    	return per;
    	
    }

    private Stream<PersonBean> list(EntityManager em) {
        List<PersonBean> PersonBeans = em.createQuery("select p from PersonBean p", PersonBean.class).getResultList();
     
        return PersonBeans.stream();
    }
  
    
    private PersonBean deletion(EntityManager em, PersonBean PersonBean) {
    	//System.out.println("PersonBean::"+PersonBean);
    	System.out.println("inside repository remove ::"+PersonBean.name);
    	

       em.persist(PersonBean); 
       // Logger.info("PersonBean is: " + PersonBean);
      try {
    	  System.out.println("PersonBean.name::::"+PersonBean.name);
        em.remove(PersonBean);
        //PersonBean PersonBeans = (PersonBean) em.createQuery("delete p from PersonBean p", PersonBean.class).getResultList();
       
        int deleteRecords = em.createQuery("DELETE from PersonBean b where b.name = ?1")
                        .setParameter(1,PersonBean.name)
                        .executeUpdate();
        System.out.println("deleteRecords::::"+deleteRecords);
      }
      catch(Exception e) {
    	  System.out.println("inside catch");
    	  e.printStackTrace();
    	 
      }
        return PersonBean;
    }
  
    private PersonBean updation(EntityManager em, PersonBean PersonBean,String f_name) {
    	//System.out.println("PersonBean::"+PersonBean);
    	System.out.println("inside repository update ::"+PersonBean.name);
    	System.out.println("f_name::::::::"+f_name);
    	PersonBean p=new PersonBean();

     //  em.persist(PersonBean); 
       // Logger.info("PersonBean is: " + PersonBean);
      try {
    	  System.out.println("PersonBean.name::::"+PersonBean.name);
    	
    	  em
	      .createQuery(""
	      		+ "update PersonBean set name =\'" + PersonBean.name +
	      		"\' where name=\'" +f_name +
	      		"\'")
	      .executeUpdate();
    	 

      }
      catch(Exception e) {
    	  System.out.println("inside catch");
    	  e.printStackTrace();
    	 
      }
        return PersonBean;
    }


  
}
