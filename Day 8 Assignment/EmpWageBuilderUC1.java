public class  EmpWageBuilderUC1
{
	public static void main(String[] args) 
	{
		final int IS_FULL_TIME=1;
		double empCheck=Math.floor(Math.random()*10)%2; // return 0 or 1
		if(empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		
	}
}
