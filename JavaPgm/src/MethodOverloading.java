class MOL
{
	public void Test(int a)
	{
		System.out.println("calling int");
	}
	
	public void Test(String a)
	{
		System.out.println("calling String");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOL m = new MOL();
		m.Test(39);

	}

}
