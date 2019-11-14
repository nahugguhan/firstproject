package ClassMethodObject;

public class EmployeeId
{
	public void empId() 
	{
	System.out.println("empid :"+"511314106015");
}
	public void empName()
	{
		System.out.println("employee name: "+"GUHAN");
	}
	public void empDOB()
	{
		System.out.println("employee dob : "+"13-SEP-1996");
	}
	public void empPhone()
	{
		System.out.println("phone :"+"998776543210");
	}
	public void empMail()
	{
		System.out.println("emp mailid: "+"guhan@greens.com");
	}
	public void empAddress()
	{
		System.out.println("emp address: "+"no 160 ecr road kanchepurm");
	}
	public static void main(String[] args) 
	{
	EmployeeId e=new EmployeeId();
	e.empId();
	e.empName();
	e.empDOB();
	e.empPhone();
	e.empMail();
	e.empAddress();
	}
}