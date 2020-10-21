public class EmployeeWageProblem{
	public static void main(String args[]){
		int is_full_time = 1;
		int is_part_time = 2;

		int WagePerHr = 20;
		int HrsPerDay_FullTime = 8;
		int HrsPerDay_PartTime = 4;
		int DailyWage;

		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");

		double EmpCheck = Math.floor(Math.random() * 10) % 3;

		if(EmpCheck == 1)
		{
			System.out.println("Full Time Employee is Present");
			DailyWage = WagePerHr * HrsPerDay_FullTime;
			System.out.println("Daily Wage is "+DailyWage);
		}
		else if(EmpCheck ==2)
		{
			System.out.println("Part Time Employee is Present");
			DailyWage = WagePerHr * HrsPerDay_PartTime;
			System.out.println("Daily Wage is "+DailyWage);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
