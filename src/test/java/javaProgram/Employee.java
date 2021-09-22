package javaProgram;

public class Employee {
	
	int empId;
	String empName;
	int salary;
	int deptno;
	

	public static void main(String[] args) {

		Employee ramesh= new Employee();
		ramesh.empId=101;
		ramesh.empName="Ramesh";
		ramesh.salary=100000;
		ramesh.deptno=10;
		
		ramesh.display();
		
		
		
		Employee somesh= new Employee();
		somesh.empId=102;
		somesh.empName="Somesh";
		somesh.salary=100000;
		somesh.deptno=20;
		
		somesh.display();
		
		
	}
	
	
	
	void display()
	{
		System.out.println("Empid is"+empId);
		System.out.println("empName is"+empName);
		System.out.println("salary is"+salary);
		System.out.println("deptno is"+deptno);
		
	}

}
