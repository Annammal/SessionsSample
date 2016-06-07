package com.aeq.bean;

public class EmployeeBean {
int employeeid;
String name,email;
AddressBean address;
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
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
public AddressBean getAddress() {
	return address;
}
public void setAddress(AddressBean address) {
	this.address = address;
}

}
