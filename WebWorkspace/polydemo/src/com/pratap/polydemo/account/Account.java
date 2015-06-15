package com.pratap.polydemo.account;

public class Account 
{
	private int accNo;
	private float accBalance;
	public Account() {
		System.out.println("**ACCOUNT CLASS**");
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}
	
	public void printAccountDetails(){
		System.out.println("ACCOUNT : printAccountDetails() have been called...");
	}
	public void printAccountDetails(float money){
		System.out.println("ACCOUNT : printAccountDetails() have been called...with money="+ money);
	}
	public String printAccountDetails(int money){
		System.out.println("ACCOUNT : printAccountDetails() have been called...with money="+ money);
		return "Simple Account";
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accBalance=" + accBalance + "]";
	}
	
}
