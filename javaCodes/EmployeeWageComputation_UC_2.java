import java.util.Random;

//Employee Wage Computation class
class EmployeeWageComputation_UC_2  
{   
    private static final int wagePerHour=20;
    private static int fullDayHour=0; 
    private static double wage;	
	public void employeeCheck()
	{   //Declaring Random Class
		Random rand=new Random();
		//Genertaing random number in range [0,1]
		final int ISPRESENT=rand.nextInt(2);
		
		if(ISPRESENT==1)
		{
			System.out.println("Employee is Present");
				fullDayHour=8;

		}
		else
		{
			System.out.println("Employee is Absent");
			
		}
		//@return WagePerHour*FullDayHour
		//@params FullDayHour
		
		wage=EmployeeWageComputation_UC_2.DailyWageCalculation(fullDayHour);
			System.out.println("The wage of the Person is: "+wage);
	}
     //Calling Function
	public static double DailyWageCalculation(int fullDayHour)
	{   //Returning Value 
		return (wagePerHour*fullDayHour);
	}






	public static void main(String[] args) 
	{
		EmployeeWageComputation_UC_2 e1 =new EmployeeWageComputation_UC_2();
		e1.employeeCheck();

	}
}
