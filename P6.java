/* Write a java program which consist of 5 constructor 
  1) No  arg constructor
  2) 1- paramerterized constructor
  3) 2- paramerterized constructor
  4) 3- paramerterized constructor
  5) 4- paramerterized constructor
  6) call  inn following sequence 
    i)3- paramerterized constructor
	ii)No  arg constructor
	iii) 4- paramerterized constructor
	iv) 2- paramerterized constructor
	v) 1- paramerterized constructor*/


class P6 
{
	P6()
	{
		System.out.println("Default constructor");

	}
	P6(int a)//1
	{
		System.out.println(a);
	}

	P6(int a ,int b)//2
	{
		System.out.println(a);
		System.out.println(b);
	}
	P6(int a ,int b, int c)//3
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	P6(int a ,int b, int c, int d)//4
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args)
	{
		P6 ref3=new P6(10,20,30);
		P6 ref=new P6();
		P6 ref4=new P6(10,20,30,40);
		P6 ref2=new P6(10,20);
		P6 ref1=new P6(10);

	}




}
