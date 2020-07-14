

		
import java.util.Random;

//Employee Wage Computation class
class EmployeeWageComputation_UC_4
{   
    private static final int wagePerHour=20;
    private static int fullDayHour=0; 
    private static double wage;	
	public void employeeCheck()
	{   //Declaring Random Class
		Random rand=new Random();
		//Genertaing random number in range [0,2]
		final int ISPRESENT=rand.nextInt(3);
		
		
		switch(ISPRESENT)
		{
			case 1:
						System.out.println("Employee is Present");
						
							fullDayHour=8;
							break;

		case 2:
		
					System.out.println("Employee Worked for PartTime");
					
						fullDayHour=4;
						break;
		case 0:

					System.out.println("Employee is Absent");
					break;
        default:
					System.out.println("Invalid Value");
			
		}
		//@return WagePerHour*FullDayHour
		//@params FullDayHour
		
		wage=EmployeeWageComputation_UC_4.dailyWageCalculation(fullDayHour);
			System.out.println("The wage of the Person is: "+wage);
	}
     //Calling Function
	public static double dailyWageCalculation(int fullDayHour)
	{   //Returning Value 
		return (wagePerHour*fullDayHour);
	}






	public static void main(String[] args) 
	
	{   //creating call objects
		EmployeeWageComputation_UC_4 e1 =new EmployeeWageComputation_UC_4();
		e1.employeeCheck();

	}
}
		

