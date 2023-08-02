package SuperConcept;

class CARS1
{
	public void Color()
	{
		System.out.println("Blue");
	}
	
	public void Engine()
	{
		System.out.println("1500Cc");
	}
	
	public void AirBag()
	{
		System.out.println("Available at Top Model");
	}
}


class CARS2 extends CARS1
{
	public void Color()
	{
		System.out.println("White");
	}
	
	public void Engine()
	{
		System.out.println("1500Cc Turbo");
	}
	
	public void AirBag()
	{
		System.out.println("Available at Top Model along with Automatic Variant");
	}
	
	public void getDetails()
	{
		Color();
		super.Engine();
		AirBag();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CARS2 c = new CARS2();
		c.getDetails();

	}

}
