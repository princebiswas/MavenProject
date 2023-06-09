class AOL
{
	public void Test(int a , long b)
	{
		System.out.println("calling int and long");
	}
	
	public void Test(long a , int b)
	{
		System.out.println("calling long and int");
	}
	
	public void Test(int a , double b)
	{
		System.out.println("calling int and double");
	}
	
	public void Test(char a , boolean b)
	{
		System.out.println("calling char and boolean");
	}
}
public class AdvanceOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AOL m = new AOL();
		m.Test(10, 20L);
		m.Test(20, 0.5); //32 bit
		m.Test('a', false);

	}

}
