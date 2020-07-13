import java.util.Random;

class EmployeeWageComputation_UC_2  
{
	public void EmployeeCheck()
	{
		Random rand=new Random();
		int IsPresent=rand.nextInt(2);
		int WagePerHour=0;
		int FullDayHour=0;
		if(IsPresent==1)
		{
			System.out.println("Employee is Present");
			 WagePerHour=20;
				FullDayHour=8;

		}
		else
		{
			System.out.println("Employee is Absent");
			
		}
		double Wage=EmployeeWageComputation_UC_2.DailyWageCalculation(WagePerHour,FullDayHour);
			System.out.println("The wage of the Person is: "+Wage);
	}

	public static double DailyWageCalculation(int WagePerHour,int FullDayHour)
	{
		return (WagePerHour*FullDayHour);
	}






	public static void main(String[] args) 
	{
		EmployeeWageComputation_UC_2 e1 =new EmployeeWageComputation_UC_2();
		e1.EmployeeCheck();

	}
}
