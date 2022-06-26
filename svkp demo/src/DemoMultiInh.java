
class Department
{
	int deptid;
	String deptname;
}
class CSE extends Department
{
	int total_intake;
}
class MCA extends Department
{
	int total_intake;
}
public class DemoMultiInh
{
	public static void main(String[] args)
	{
		System.out.println("*****CSE******");

		CSE ob=new CSE();
		System.out.println(ob.deptid=101);
		System.out.println(ob.deptname="CSE");
		System.out.println(ob.total_intake=120);
		
		System.out.println("*****MCA******");
		
		MCA ob1=new MCA();
		System.out.println(ob1.deptid=102);
		System.out.println(ob1.deptname="MCA");
		System.out.println(ob1.total_intake=60);	
	
	
	
	}
}





