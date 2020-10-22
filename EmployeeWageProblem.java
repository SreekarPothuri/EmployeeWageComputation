public class EmployeeWageProblem{
	public static void main(String args[]){
		int is_full_time = 1;
		int is_part_time = 2;

		int WagePerHr = 20;
		int HrsPerDay_FullTime = 8;
		int HrsPerDay_PartTime = 4;
		int DailyWage;

		int Max_WorkingHrsPerMonth = 100;
		int Max_WorkingDaysPerMonth = 20;
		int MonthlyWage = 0;
		int WorkingHrs = 0;

		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");

		for(int i=1; i<= Max_WorkingDaysPerMonth; i++)
		{
			if(WorkingHrs>100)
			{
				DailyWage = 0;
				MonthlyWage+=DailyWage;
			}
			if(WorkingHrs<=100)
			{
				double EmpCheck = Math.floor(Math.random() * 10) % 3;
				int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

				switch(CheckEmp)
				{
					case 0:
						System.out.println("Employee is Absent");
						System.out.println("Wage per day is 0");
						System.out.println("Total Salary till date is "+MonthlyWage);
						System.out.println();
						break;
					case 1:
						System.out.println("FullTime Employee is Present");
						DailyWage = WagePerHr * HrsPerDay_FullTime;
						System.out.println("Wage per day is "+DailyWage);
						MonthlyWage = MonthlyWage + DailyWage;
						WorkingHrs = WorkingHrs + HrsPerDay_FullTime;
						System.out.println("Total Salary till date is "+MonthlyWage);
						System.out.println();
						break;
					case 2:
						System.out.println("Part Time Employee is Present");
						DailyWage = WagePerHr * HrsPerDay_PartTime;
						System.out.println("Wage per Day is "+DailyWage);
						MonthlyWage = MonthlyWage + DailyWage;
						WorkingHrs = WorkingHrs + HrsPerDay_PartTime;
						System.out.println("Total Salary till date is "+MonthlyWage);
						System.out.println();
						break;
					default:
						System.out.println("Invalid");
						break;
				}
			}
		}

		System.out.println("Total Salary for month is " +MonthlyWage);
		System.out.println("Total Working Hours are " +WorkingHrs);
	}
}
