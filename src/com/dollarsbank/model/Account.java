package com.dollarsbank.model;

public class Account {
	
	private String customerName;
	private String customerAddress;
	private int customerNumber;
	private String userId;
	private String customerPassword;
	private double customerDeposit;
	
	public Account(String customerName, String customerAddress, int customerNumber, String userId,
			String customerPassword, double customerDeposit) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerNumber = customerNumber;
		this.userId = userId;
		this.customerPassword = customerPassword;
		this.customerDeposit = customerDeposit;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public double getCustomerDeposit() {
		return customerDeposit;
	}
	public void setCustomerDeposit(double customerDeposit) {
		this.customerDeposit = customerDeposit;
	}
	
	@Override
	public String toString() {
		return "Account [customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerNumber="
				+ customerNumber + ", userId=" + userId + ", customerPassword=" + customerPassword
				+ ", customerDeposit=" + customerDeposit + "]";
	}
	
	
	
	
	
}
