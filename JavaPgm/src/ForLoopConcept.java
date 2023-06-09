
public class ForLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * int i = 1 -- initalization
		 * i<=10 --- condition - if condition is true - loop will continue else - Loop will break
		 * i++ -- increment  -- i= i+1  i= i+2
		 */
		
		for(int i =1 ; i<=10 ;i++) // 11 11<=10  11
		{
			System.out.println(i);
		}
		 
		//Odd Number
		//1 3 5 7 9 11
		
		//2 4 6 8 10
		
		for(int i = 2 ; i<=20 ; i=i+2)
		{
			System.out.println(i);
		}
		          //0123456
		String s = "testinggsajdgaskdhkasjdhaskjhdlkasjdklsjflkdsfhlkdshfjkdsfkjdsgf";
		
		System.out.println(s.length());
		
		for(int i = 0 ; i<s.length() ; i++)  //1 1<=6  1
		{
			System.out.println(s.charAt(i)); // "Testing".charAt(1)
		}
		
		// Print Even and odd in reverse order
		// print String into reverse order
		//i--
		

	}

}
