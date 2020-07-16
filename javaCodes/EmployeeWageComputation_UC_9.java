

		
import java.util.Random;

//Employee Wage Computation class
class EmployeeWageComputation_UC_9
{   
    private   int wagePerHour;
    private  int fullDayHour=0; 
    private  double totalWage;	
	private   int numberOfDays;
	private  int totalHours;
	private String Company;
	EmployeeWageComputation_UC_9()
	{
		this.wagePerHour=20;
		
		this.numberOfDays=20;
		this.totalHours=100;
	}
	
		
		
	EmployeeWageComputation_UC_9(String Company,final int wagePerHour,final int numberOfDays,final int totalHours)
	{	this.Company=Company;
		this.wagePerHour=wagePerHour;
		
		this.numberOfDays=numberOfDays;
		this.totalHours=totalHours;
	}
	
	public void employeeSalaryCompute()
	
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
			
			
			
				
		}
	
		this.totalWage=this.wagePerHour*fullDayHour;
		
	}
	@Override
	public String toString()
	{
	return "Total Wage of the Person for the"+this.Company+" is "+this.totalWage;
	}
	
  





	public static void main(String[] args) 
	
	{   //creating call objects
		EmployeeWageComputation_UC_9 e1 =new EmployeeWageComputation_UC_9("dmart",20,40,130);
		e1.employeeSalaryCompute();
		EmployeeWageComputation_UC_9 e2 =new EmployeeWageComputation_UC_9("Reliance",30,30,120);
		e2.employeeSalaryCompute();
		
		System.out.println(e1);
		System.out.println(e2);

	}
}
		

