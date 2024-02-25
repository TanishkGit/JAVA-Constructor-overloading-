/* WAJP to execute no arg constructor ass well as 1 paramerterized constructor */

class P5
{
	P5()
	{
		System.out.println("maacha  sahil in walmart");
	}
	P5(int a)
	{
		
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		P5 ref=new P5();
		P5 ref1=new P5(10);
		System.out.println(ref);


	}
}
