package employee;

public class Employee {
	String firstname;
	String lastname;
	double salary;
	public Employee()
	{
		
	}
	public Employee(String a,String b,Double c)
	{
		firstname=a;
		lastname=b;
		salary=c;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Employee details:\nEmployee name:"+getFirstname()+" " +getLastname());
	}

	public void cal()
	{
		System.out.println("salary per annum"+(salary*12) + "incremented salary"+((salary*12)+(0.1*salary)));
		
		}
}
