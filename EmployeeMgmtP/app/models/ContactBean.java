package models;

import java.io.File;
import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import play.mvc.Http.MultipartFormData;

@Entity
public class ContactBean {

    
	 
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
	public Long id;

    public String name;

    @Id
    public String email;
    public String message;
    public String phone;
    public String subject;
   /* @Transient
    public MultipartFormData<File> file;*/
    @Transient
    public File file;
    
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
/*	public MultipartFormData<File> getFile() {
		return file;
	}
	public void setFile(MultipartFormData<File> file) {
		this.file = file;
	}*/
	@Override
	public String toString() {
		return "ContactBean [id=" + id + ", name=" + name + ", email=" + email + ", message=" + message + ", phone="
				+ phone + ", subject=" + subject + ", file=" + file + "]";
	}

    
}


