package SuperConcept;

class Animal
{
	Animal()
	{
		System.out.println("Animal Eating");
	}
	
	Animal(String a)
	{
		System.out.println("Animal Voice");
	}
}

class Tiger extends Animal
{
	Tiger()
	{
		//super();
		super("Lion");
		
		System.out.println("Tiger Eating");
		
	}
	Tiger(String a)
	{
		super();
	}
}

public class SuperWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 new Tiger();
		 new Tiger("ABC");

	}

}
