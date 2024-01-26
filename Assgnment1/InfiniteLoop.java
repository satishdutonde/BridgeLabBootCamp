public class InfiniteLoop
{
   public static void main(String args[]) throws InterruptedException
   {
      while(true)
	{
           System.out.println("Executing Infinite Loop");
	   Thread.sleep(10000);
	}
    }
}
