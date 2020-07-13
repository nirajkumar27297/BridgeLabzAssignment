import java.util.Random;

class EmployeeWageComputation_UC_1
{
	public void EmployeeCheck()
	{
		Random rand=new Random();
		int IsPresent=rand.nextInt(2);
		if(IsPresent==1)
		{
			System.out.println("Employee is Present");
			

		}
		else
		{
			System.out.println("Employee is Absent");

		}
	
	}
	public static void main(String[] args) 
	{
		EmployeeWageComputation_UC_1 e1 =new EmployeeWageComputation_UC_1();
		e1.EmployeeCheck();

	}
}
