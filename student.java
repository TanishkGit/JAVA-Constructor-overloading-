/* Write a java program to achieve constructor overloading 
   for student class which should have atleast 5 constructors 
   and execute each constructor randomly */


class student       //Constructor overloading  
{
	student(String name,int roll_no)  //con1
	{
		
		System.out.println("Name of student is :"+name);
		System.out.println("Roll no. of student is:"+roll_no);
		System.out.println("=================================================");
	}

	student(String name, String company, int roll_no) //con2  
	{
		System.out.println("Name of student is :"+name);
		System.out.println("Roll no. of student is:"+roll_no);
        System.out.println("Name of company is :"+company);
		System.out.println("=================================================");
    }

	student(String name, String company, int roll_no, double fees)  //con 3
	{
		System.out.println("Name of student is :"+name);
		System.out.println("Roll no. of student is:"+roll_no);
        System.out.println("Name of company is :"+company);
		System.out.println("fees is:"+fees);
		System.out.println("=================================================");
		
	}

	student(String name, String company, int roll_no, double fees, boolean attendance) //con4
	{
		System.out.println("Name of student is :"+name);
		System.out.println("Roll no. of student is:"+roll_no);
        System.out.println("Name of company is :"+company);
		System.out.println("fees is:"+fees);
		System.out.println("attendance: "+attendance);
		System.out.println("=================================================");
		
	}

	student(String name, String company, int roll_no, double fees, boolean attendance, String subject)
	{
		System.out.println("Name of student is :"+name);
		System.out.println("Roll no. of student is:"+roll_no);
        System.out.println("Name of company is :"+company);
		System.out.println("fees is:"+fees);
		System.out.println("attendance: "+attendance);
		System.out.println("Subject is :" +subject);
		System.out.println("=================================================");
		
	}

	public static void main(String[] args) 
	{
		
		student ref2 = new student("Sahil", "Walmart",01);
		student ref5 = new student("Sheela", "Qspiders" , 88, 13500.22, false , "JAVA");
		student ref4 = new student("Tanishk", "E-emphasys", 18, 13500.22, true);
		student ref1 = new student("Tanishk ",18);
		student ref3 = new student("Ayush", "Quality kiosk", 02, 13500.22);
	}
}
