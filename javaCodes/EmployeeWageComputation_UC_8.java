

		
import java.util.Random;

//Employee Wage Computation class
class EmployeeWageComputation_UC_8
{   
    private   int wagePerHour;
    private  int fullDayHour=0; 
    private  double totalWage;	
	private   int numberOfDays;
	private  int totalHours;
	private String company;
	EmployeeWageComputation_UC_8()
	{
		this.wagePerHour=20;
		
		this.numberOfDays=20;
		this.totalHours=100;
	}
	
		
		
	EmployeeWageComputation_UC_8(String company,final int wagePerHour,final int numberOfDays,final int totalHours)
	{   this.company=company;
		this.wagePerHour=wagePerHour;
		
		this.numberOfDays=numberOfDays;
		this.totalHours=totalHours;
	}
	
	public int employeeCheck()
	
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
		return this.fullDayHour;
	}
     //Calling Function
	public  void dailyWageCalculation(int fullDayHour)
	{   //Returning Value 
		System.out.println("The wage of the person is "+wagePerHour*fullDayHour);
	}






	public static void main(String[] args) 
	
	{   //creating call objects
		EmployeeWageComputation_UC_8 e1 =new EmployeeWageComputation_UC_8("Reliance",30,40,120);
		int fullDayHour=e1.employeeCheck();
		e1.dailyWageCalculation(fullDayHour);
		EmployeeWageComputation_UC_8 e2 =new EmployeeWageComputation_UC_8("Dmart",30,30,120);
		fullDayHour=e2.employeeCheck();
		e2.dailyWageCalculation(fullDayHour);
		
		e2.employeeCheck();

	}
}
		

