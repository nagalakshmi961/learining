package com.CustomerDAO;

public class Customer {
	private int Custid;
	private String Custname;
	private String Address;
	public int getCustid() {
		return Custid;
	}
	public void setCustid(int custid) {
		Custid = custid;
	}
	public String getCustname() {
		return Custname;
	}
	public void setCustname(String custname) {
		Custname = custname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

}
