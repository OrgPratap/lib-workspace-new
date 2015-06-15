package org.gtpl.pratap.collectiondemo;

import java.util.Iterator;
import java.util.Vector;

import org.gtpl.pratap.employee.Employee;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee(101, "Satendra", 23, "Software Engineer", 20000, true);
		Employee emp2=new Employee(102, "Akash", 24, "Senior Consultant", 34000, true);
		Employee emp3=new Employee(103, "Nigam", 23, "Software Engineer", 28000, true);
		Employee emp4=new Employee(104, "Chandrakar", 25, "Support Engineer", 25000, true);
		Employee emp5=new Employee(105, "Mishra", 24, "SAP", 23000, true);
		Employee emp6=new Employee(106, "Utkarsh", 24, "Network Engineer", 30000, true);
		Employee emp7=new Employee(107, "Vijendra", 24, "Accounts", 18000, true);
		Employee emp8=new Employee(108, "Payal", 25, "HR", 15000, true);
		Employee emp9=new Employee(109, "Reena", 23, "iPhone Developer", 15000, true);
		Employee emp10=new Employee(110, "Priyanka", 25, "android Developer", 19000, true);
		Employee emp11=new Employee(111, "Tanya", 26, "Software Engineer", 24000, true);
		Employee emp12=new Employee(112, "Soheb", 35, "Staff Management", 10000, true);
		
		//using vector class
		Vector vect= new Vector(5,3);
		System.out.println("******CAPACITY : "+vect.capacity());
		
		vect.addElement(emp1);
		System.out.println("Adding employee: "+emp1);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp2);
		System.out.println("Adding employee: "+emp2);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp3);
		System.out.println("Adding employee: "+emp3);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp4);
		System.out.println("Adding employee: "+emp4);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp5);
		System.out.println("Adding employee: "+emp5);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp6);
		System.out.println("Adding employee: "+emp6);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp7);
		System.out.println("Adding employee: "+emp7);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp8);
		System.out.println("Adding employee: "+emp8);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp9);
		System.out.println("Adding employee: "+emp9);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp10);
		System.out.println("Adding employee: "+emp10);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp11);
		System.out.println("Adding employee: "+emp11);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		vect.addElement(emp12);
		System.out.println("Adding employee: "+emp12);
		System.out.println("**NEW CAPACITY : "+vect.capacity());
		
		System.out.println("Size of Vector :"+vect.size());
		System.out.println("Last element is :"+vect.lastElement());
		System.out.println("first element is :"+vect.firstElement());
		
		Employee empSearch=new Employee(105, "Mishra", 24, "SAP", 23000, true);
		if(vect.contains(empSearch))
		{
			System.out.println("***RECORD FOUND****");
		}else{
			System.out.println("Sorry No Match found.....!!!");
		}
		
		if (vect.contains(emp8)){
			System.out.println("Employee exist");
		}
		
		
		Iterator it=vect.iterator();
		while(it.hasNext())
		{
			Employee empTemp=(Employee) it.next();
			if(empTemp.equals(empSearch))
			{
				System.out.println("YES its there....");
			}
			}
		
	}

}
