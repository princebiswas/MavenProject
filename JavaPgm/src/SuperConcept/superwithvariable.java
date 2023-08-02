package SuperConcept;

class CS1
{
	String Color = "Blue";
}

class CS2 extends CS1
{
	String Color = "Black";
	
	public void getDetails()
	{
		System.out.println(super.Color);
	}
}

public class superwithvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CS2 c = new CS2();
		c.getDetails();

	}

}
