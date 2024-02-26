/* WAJP for an employee class consist of employee id, ename, sal 
1)Create no argument constructor to initialize nothing 
2) Create 1 para constructor to initialize emp_id
3) Create 2 para constructor to initialize emp_id, ename
4) Create 3 para constructor to initialize emp_id,ename, sal 
5) Create emp objects for eaach constructor 
6) print all the details for employees for every object with help of employee datils non static methods 
*/

class emp 
{
	int empid;
	String ename;
	double sal; 
	emp()//1
	{
		System.out.println("No arg constructor");

	}

	emp( int empid)//2
	{
		this.empid=empid;
	} 

	emp( int empid, String ename)//2
	{
		this.empid=empid;
		this.ename=ename;
	}

	emp( int empid, String ename, double sal)//3
	{
		this.empid=empid;
		this.ename=ename;
		this.sal= sal;
	}
	public void details()//calling 
	{
		System.out.println("Emp_id:"+empid);
		System.out.println("Emp name :"+ename);
		System.out.println("Emp_sal:"+sal);
		System.out.println("=============================================");

	}

	public static void main(String[] args) 
	{
		emp ref1=new emp();
		emp ref2=new emp(10);
		emp ref3=new emp(20,"sheela",0.0);
		emp ref4=new emp(3 0,"shakila",3999.9);

		ref1.details();
		ref2.details();
		ref3.details();
		ref4.details();

	}
}
