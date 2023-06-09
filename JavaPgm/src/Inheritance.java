class GP
{
	public void GPFeature()
	{
		System.out.println("calling GP feature");
	}
}

class Parent extends GP
{
	public void ParentFeature()
	{
		System.out.println("Calling Parent Feature");
	}
}

class Child extends Parent
{
	public void ChildFeature()
	{
		System.out.println("calling child Feature");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.ChildFeature();
		c.ParentFeature();
		c.GPFeature();
		

	}

}
