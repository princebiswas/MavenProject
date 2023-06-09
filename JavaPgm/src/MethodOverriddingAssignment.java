
class OracleUSA
{
	public void product()
	{
		System.out.println("Oracle Software ");
	}
	
	public void salary()
	{
		System.out.println("Dollar");
	}
}

class OracleIndia extends OracleUSA
{
	public void salary()
	{
		System.out.println("Rupi");
	}
}

class OracleBangladesh extends OracleUSA
{
	public void salary()
	{
		System.out.println("Taka");
	}
}




public class MethodOverriddingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OracleBangladesh bd = new OracleBangladesh();
		bd.salary();
		bd.product();
		
		OracleIndia in = new OracleIndia();
		in.salary();
		in.product();
		
	}

}
