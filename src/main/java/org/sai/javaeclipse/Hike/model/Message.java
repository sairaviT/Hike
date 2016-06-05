package org.sai.javaeclipse.Hike.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Message {

	
private long id;
private String message;
private Date Created;
private String author;

public Message(){
	
	
}

public Message(long id,String message,String author){
	this.id=id;
	this.message=message;
	this.author=author;
	this.Created=new Date();
	
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getCreated() {
	return Created;
}
public void setCreated(Date created) {
	Created = created;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

}

