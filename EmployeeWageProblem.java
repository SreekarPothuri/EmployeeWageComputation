public class EmployeeWageProblem{
	public static void main(String args[]){
		int is_full_time = 1;
		int is_part_time = 2;

		int WagePerHr = 20;
		int HrsPerDay_FullTime = 8;
		int HrsPerDay_PartTime = 4;
		int DailyWage;

		int WorkingDaysPerMonth = 20;
		int MonthlyWage;

		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");

		double EmpCheck = Math.floor(Math.random() * 10) % 3;
		int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

		switch(CheckEmp)
		{
			case 0:
				System.out.println("Employee is Absent");
				break;
			case 1:
				System.out.println("FullTime Employee is Present");
				DailyWage = WagePerHr * HrsPerDay_FullTime;
				System.out.println("Daily Wage is "+DailyWage);
				MonthlyWage = DailyWage * WorkingDaysPerMonth;
				System.out.println("Monthly Wages are "+MonthlyWage);
				break;
			case 2:
				System.out.println("Part Time Employee is Present");
				DailyWage = WagePerHr * HrsPerDay_PartTime;
				System.out.println("Daily Wage is "+DailyWage);
				MonthlyWage = DailyWage * WorkingDaysPerMonth;
				System.out.println("Monthly Wages are "+MonthlyWage);
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}
}
