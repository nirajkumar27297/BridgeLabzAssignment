import java.util.Random;

class EmployeeWageComputation_UC_5 
{
	public void EmployeeCheck()
	{
		Random rand=new Random();
		int IsPresent=rand.nextInt(3);
		int WagePerHour=0;
		int FullDayHour=0;
		double TotalWage=0;
		int numberOfDays=20;
		
		for(int i=0;i<20;i++)
		{


			switch(IsPresent)
			{
				case 1:
							 WagePerHour=20;
								FullDayHour=8;
								break;

			case 2:
			
						WagePerHour=20;
							FullDayHour=4;
							break;
			case 0:
                        WagePerHour=0;
				        FullDayHour=0;

						break;
			default:
						System.out.println("Invalid Value");
				
			}
			double Wage=EmployeeWageComputation_UC_5.DailyWageCalculation(WagePerHour,FullDayHour);
			TotalWage+=Wage;
		}
			System.out.println("The total wage of the Person is: "+TotalWage);
	}

	public static double DailyWageCalculation(int WagePerHour,int FullDayHour)
	{
		return (WagePerHour*FullDayHour);
	}






	public static void main(String[] args) 
	{
		EmployeeWageComputation_UC_5 e1 =new EmployeeWageComputation_UC_5();
		e1.EmployeeCheck();

	}
}


