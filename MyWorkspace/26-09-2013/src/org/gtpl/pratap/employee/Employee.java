package org.gtpl.pratap.employee;

public class Employee 
{
	long empId;
	String empName;
	int age;
	String empPosition;
	long empSalary;
	boolean empStatus;
	public Employee() 
	{
		super();	
	}
	public Employee(long empId, String empName, int age, String empPosition,
			long empSalary, boolean empStatus) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.empPosition = empPosition;
		this.empSalary = empSalary;
		this.empStatus = empStatus;
	}
	
	
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public boolean isEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(boolean empStatus) {
		this.empStatus = empStatus;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age="
				+ age + ", empPosition=" + empPosition + ", empSalary="
				+ empSalary + ", empStatus=" + empStatus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (empId ^ (empId >>> 32));
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result
				+ ((empPosition == null) ? 0 : empPosition.hashCode());
		result = prime * result + (int) (empSalary ^ (empSalary >>> 32));
		result = prime * result + (empStatus ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empPosition == null) {
			if (other.empPosition != null)
				return false;
		} else if (!empPosition.equals(other.empPosition))
			return false;
		if (empSalary != other.empSalary)
			return false;
		if (empStatus != other.empStatus)
			return false;
		return true;
	}
	
	
	
	

}
