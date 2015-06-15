package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class TestClass{
	private List<String> defaultList=null;
	private String s=null;
	private Scanner sc=null;
	private List<String> res=null;
public static void main(String[] arg){
	System.out.println("main prog started");
	TestClass obj=new TestClass();
	obj.defaultList=new LinkedList<String>();
	obj.defaultList.add("PATNA");
	obj.defaultList.add("PATNI");
	obj.defaultList.add("PATNAABC");
	obj.defaultList.add("AMERICA");
	obj.defaultList.add("CANADA");
	obj.takeInput();
	System.out.println("check 2");
	obj.processString();
	System.out.println("check 3");
	obj.printResult();
	System.out.println("check 4");
}
private void printResult() {
	String s1=null;
	if(res.size()>0){
		Iterator<String> it=res.iterator();
		while(it.hasNext()){
			s1=it.next();
			System.out.println(s1);
		}
		
		}
		
	}
	

private void processString() {
	System.out.println("processString()");
	Iterator<String> it=defaultList.iterator();
	String temp=null;
	StringBuffer sb=new StringBuffer();
	res=new LinkedList<String>();
	int length=0;
	boolean b=false;
	while(it.hasNext()){
		System.out.println("inside while loop");
		temp=it.next();
		System.out.println("defaultlist : temp : "+temp);
		length=temp.length();
		if(length>=s.length()){
			System.out.println("inside if");
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==temp.charAt(i)){
					b=true;
					//sb=sb.append(s.charAt(i));
					//i++;
				}
				else{
					b=false;
				}
			}
			if(b){
				res.add(temp);
			}
		}
		
	}
	
	
}
private void takeInput(){
	try{
		System.out.println("takeInput()");
		sc=new Scanner(System.in);
		System.out.println("Enter a string value");
		s=sc.nextLine();
		if(s==null){
			System.out.println("kindly provide non null string value");
			takeInput();
		}
		
	}catch(Exception e){
		System.out.println("Exception occured : "+e.getMessage());
	}
	
		
	}

}