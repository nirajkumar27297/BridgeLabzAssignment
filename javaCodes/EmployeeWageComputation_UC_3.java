import java.util.Random;

class EmployeeWageComputation_UC_3  
{
	public void EmployeeCheck()
	{
		Random rand=new Random();
		int IsPresent=rand.nextInt(3);
		int WagePerHour=0;
		int FullDayHour=0;
		if(IsPresent==1)
		{
			System.out.println("Employee is Present");
			 WagePerHour=20;
				FullDayHour=8;

		}
		else if(IsPresent==2)
		{
			System.out.println("Employee Worked for PartTime");
			WagePerHour=20;
				FullDayHour=4;
		}

		else
		{
			System.out.println("Employee is Absent");
			
		}
		double Wage=EmployeeWageComputation_UC_3.DailyWageCalculation(WagePerHour,FullDayHour);
			System.out.println("The wage of the Person is: "+Wage);
	}

	public static double DailyWageCalculation(int WagePerHour,int FullDayHour)
	{
		return (WagePerHour*FullDayHour);
	}






	public static void main(String[] args) 
	{
		EmployeeWageComputation_UC_3 e1 =new EmployeeWageComputation_UC_3();
		e1.EmployeeCheck();

	}
}
