
class Base
{
	public void HolidayPackage()
	{
		System.out.println("Holiday");
	}
}

public class Basic2 {
	
	
	public void FlighBooking() //User define method and we can change any time
	{
		System.out.println("Automation");
	}
	
	public void HotelBooking()
	{
		System.out.println("Hotels");
	}
	
	//Java define method and we cant change - it should be one - not more than one or not less than one 
	//in a file

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Testing");
		
		//create a object 
		
		//classname ref = new Constructor();
		//ref.userdefinemethod();
		
		Basic2 b = new Basic2(); //object creation
		b.FlighBooking();
		b.HotelBooking();
		
		Base b1 = new Base();
		b1.HolidayPackage();
		
		
	}

}
