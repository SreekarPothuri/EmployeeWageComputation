public class EmployeeWageProblem{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HR = 20;
	public static final int MAX_WORKINGHRS_PER_MONTH = 100;
	public static final int MAX_WORKINGDAYS_PER_MONTH = 20;
	public static int HrsPerDay;
	public static int Day;
	public static int DailyWage;
	public static int MonthlyWage=0;
	public static int WorkingHrs=0;

	public static void empHrs(){
		double EmpCheck = Math.floor(Math.random() * 10) % 3;
		int CheckEmp =(int) EmpCheck;//Type casting double to int for Emp attendance check

		switch(CheckEmp)
		{
			case 0:
				System.out.println("Day: "+ Day +" "+ "Employee is Absent");
				HrsPerDay=0;
				break;
			case 1:
				System.out.println("Day: "+ Day +" "+"FullTime Employee is Present");
				HrsPerDay=8;
				break;
			case 2:
				System.out.println("Day: "+ Day +" "+"Part Time Employee is Present");
				HrsPerDay=4;
				break;
			default:
				System.out.println("Invalid");
				break;
		}
	}

	public static void monthlywage(){
		for(Day=1; Day<=MAX_WORKINGDAYS_PER_MONTH; Day++)
		{
			if(WorkingHrs>100)
			{
				DailyWage = 0;
				MonthlyWage+=DailyWage;
			}
			if(WorkingHrs<=100)
			{
				empHrs();
				DailyWage = WAGE_PER_HR * HrsPerDay;
				System.out.println("Salary for day : "+DailyWage);
				MonthlyWage += DailyWage;
				System.out.println("Total Salary till date : "+MonthlyWage);
				WorkingHrs = WorkingHrs + HrsPerDay;
				System.out.println();
			}
		}
	}

	public static void main(String args[])
	{
		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");
		monthlywage();
		System.out.println("Total Salary for month is " +MonthlyWage);
		System.out.println("Total Working Hours are " +WorkingHrs);
	}
}
