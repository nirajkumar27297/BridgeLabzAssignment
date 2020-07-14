

		
import java.util.Random;

//Employee Wage Computation class
class EmployeeWageComputation_UC_6
{   
    private static final int wagePerHour=20;
    private static int fullDayHour=0; 
    private static double totalWage;	
	private static final int numberOfDays=20;
	private static final int totalHours=100;
	public void employeeCheck()
	
	{   //Declaring Random Class
		Random rand=new Random();
		//Genertaing random number in range [0,2]
		//1-Present
		//2-PartTime
		//0-Absent
		//Looping for 20 days
		double wage=0;
		int day=0;
		while(day<numberOfDays && fullDayHour<=totalHours)
		{	
			final int ISPRESENT=rand.nextInt(3); 
			
			
			switch(ISPRESENT)
			{
				case 1:
							
							
								fullDayHour+=8;
								break;

			case 2:
			
						
						
							fullDayHour+=4;
							break;
			case 0:

						
						break;
			default:
						System.out.println("Invalid Value");
			day+=1;
				
			}
			//@return WagePerHour*FullDayHour
			//@params FullDayHour
			//Calculating totalWage 
			
			
				
		}
		totalWage=EmployeeWageComputation_UC_6.dailyWageCalculation(fullDayHour);
			
		System.out.println("The wage of the Person is: "+totalWage);
	}
     //Calling Function
	public static double dailyWageCalculation(int fullDayHour)
	{   //Returning Value 
		return (wagePerHour*fullDayHour);
	}






	public static void main(String[] args) 
	
	{   //creating call objects
		EmployeeWageComputation_UC_6 e1 =new EmployeeWageComputation_UC_6();
		e1.employeeCheck();

	}
}
		

