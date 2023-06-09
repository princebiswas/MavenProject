package polymorphism;

class Animal
{
	public void Voice()
	{
		System.out.println("Animal Voice");
	}
}

class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roaring");
	}
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("Barking");
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog(); //upcasting
		a.Voice();
		
		//webdriver driver = new ChromeDriver();//run time polymorphism
				
	}
	
	

}
