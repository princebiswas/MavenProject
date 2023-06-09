class MOR
{
	public void getDetails()
	{
		System.out.println("calling get details Method in MOR class");
	}
}

class MOR1  {
	
	
	public void getDetails()
	{
		System.out.println("calling get Details in MOR1 class");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOR1 m = new MOR1();
		m.getDetails();

	}

}
