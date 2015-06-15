package com.pratap.polydemo.account;

public class MainClass 
{
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccNo(1001);
		acc.setAccBalance(19998.98f);
		acc.printAccountDetails();
		acc.printAccountDetails(1000f);
		String returnedData=acc.printAccountDetails(99);
		System.out.println(returnedData);
	}
}
