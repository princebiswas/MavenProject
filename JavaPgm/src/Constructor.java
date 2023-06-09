class Cons
{
	
	 Cons(String a)
	{
		System.out.println("Constructor");
	}
	
	Cons(int a)
	{
		System.out.println("calling int ");
	}
	
	Cons(double a)
	{
		System.out.println("calling double");
	}
//	public void getDetails()
//	{
//		System.out.println("calling getDeatisl ");
//	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a = 10;
		new Cons(10.6);
		new Cons("Test");
		Cons c  = new Cons(10);
		//c.getDetails();
		//c.Cons("test");

	}

}
