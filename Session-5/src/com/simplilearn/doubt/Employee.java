package com.simplilearn.doubt;

public class Employee implements Comparable<Employee>{

	int empId;
	String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName ;
	}

	@Override
	public int compareTo(Employee obj) {
		
		return empName.compareTo(obj.empName);
//		if(empId==obj.empId)
//			return 0;
//		else if(empId>obj.empId) {
//			return 1;
//		}
//		else
//			return -1;
	}
	
}
