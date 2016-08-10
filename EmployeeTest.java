package employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee a=new Employee("Abhishek","Moorthy",50000.0);
		Employee b=new Employee();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the First Name:");
		String x=scan.next();
		b.setFirstname(x);
		System.out.print("Enter the last");
		String y=scan.next();
		b.setLastname(y);
		Double z=(double) 0;
		System.out.print("Enter the Salary:");
		 z=scan.nextDouble();
		while(z<=0)
		{
		 if(z<=0)
		 {
			 System.out.print("enter salary grearter than 0" + "\nenter modified salary");
			 z=scan.nextDouble();
			 continue;
		 }
		}
		b.setSalary(z);
		b.display();
		b.cal();
		a.display();
		a.cal();
		

	}

}
