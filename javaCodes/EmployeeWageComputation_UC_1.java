import java.util.Random;


//Employee Wage Computation class
class EmployeeWageComputation_UC_1
{ private static  int IS_PRESENT;
	public void EmployeeCheck()
	{
		//Declaring Random Class
		Random rand=new Random();
		//Genertaing random number in range [0,1]
		final int IS_PRESENT=rand.nextInt(2);
		if(IS_PRESENT==1)
		{
			System.out.println("Employee is Present");
			

		}
		else
		{
			System.out.println("Employee is Absent");

		}
	
	}
	public static void main(String[] args) 
	{    //creating objects of EmployeeWageComputation_UC_1 class
		EmployeeWageComputation_UC_1 e1 =new EmployeeWageComputation_UC_1();
		//calling function
		e1.EmployeeCheck();

	}
}
