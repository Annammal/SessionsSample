package com.aeq.bean;

public class AddressBean {
int addressid;
String addresline1,city,state,country;
int pincode;
EmployeeBean employee;
public int getAddressid() {
	return addressid;
}
public void setAddressid(int addressid) {
	this.addressid = addressid;
}
public String getAddresline1() {
	return addresline1;
}
public void setAddresline1(String addresline1) {
	this.addresline1 = addresline1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public EmployeeBean getEmployee() {
	return employee;
}
public void setEmployee(EmployeeBean employee) {
	this.employee = employee;
}

}
