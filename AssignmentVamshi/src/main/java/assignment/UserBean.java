package assignment;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class UserBean {
private int id;
private String name;
private String email;
private int age;
private Date date;
public UserBean() {	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
	
}
