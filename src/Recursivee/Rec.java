package Recursivee;



public class Rec {
	public static long fact(long a)
	{
		
		if(a>0)
		{
			return a * fact(a-1);
		}
		else
		{
			return 1;
		}

		
				
	}
	public static void main(String[] args)
	{
		System.out.println(fact(9));
					
	}

}
