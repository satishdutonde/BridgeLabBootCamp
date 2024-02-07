public class _8PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Prime number between 0-1000 is: ");
		 primeNumbers();
	}
	
	static void primeNumbers() 
	 {
	        for (int num = 0; num <= 1000; num++) 
	        {
	            if (isPrime(num)) 
	            {
	                System.out.print(num + " ");
	            }
	        }
	  }

	public static boolean isPrime(int n) 
	{
	     if (n <= 1) 
	     {
	         return false;
	     }
	     else if (n == 2) 
	     {
	         return true;
	     } 
	     else if (n % 2 == 0) 
	     {
	         return false;
	     } 
	     else 
	     {

	         for (int i = 3; i * i <= n; i += 2) 
	         {
	             if (n % i == 0) 
	             {
	                 return false;
	             }
	         }
	         return true;
	     }
	}
}
