class KFCAmerica
{
	final public void Product()
	{
		System.out.println("KFC");
	}
	
	public void Location()
	{
		System.out.println(""
				+ "");
	}
}

class KFCIndia extends KFCAmerica
{
	public void OtherPizza()
	{
		System.out.println("Available India Outlet");
	}
	
	public void Location()
	{
		System.out.println("Delhi");
	}
}

class KFCUK extends KFCAmerica
{
	public void Location()
	{
		System.out.println("London");
	}
}
public class MethodOveridingRealUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KFCAmerica k = new KFCIndia();
		k.Location();
		k.Product();
		//k.OtherPizza();
		
		KFCUK ku = new KFCUK();
		ku.Location();
		ku.Product();

	}

}
