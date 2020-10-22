import java.util.Scanner;

public class EmployeeWageProblem{
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static int WagePerHr;
	public static int Max_WorkingHrsPerMonth;
	public static int Max_WorkingDaysPerMonth;
	public static int HrsPerDay;
	public static int Day;
	public static int DailyWage;
	public static int MonthlyWage=0;
	public static int WorkingHrs=0;
	static int companyId;

	public static void empCompany(){
		System.out.println("1.TCS\n2.Infosys\n3.BridgeLabz\n4.Amazon\n5.Netflix\n");
		Scanner Id = new Scanner(System.in);
		System.out.println("Enter CompanyId");
		companyId = Id.nextInt();
		switch(companyId){
			case 1:
				System.out.println("-------------Welcome to TCS-------------------");
				WagePerHr=10;
				Max_WorkingHrsPerMonth=180;
				Max_WorkingDaysPerMonth=26;
				break;
			case 2:
				System.out.println("-------------Welcome to Infosys----------------");
				WagePerHr=20;
				Max_WorkingHrsPerMonth=185;
				Max_WorkingDaysPerMonth=25;
				break;
			case 3:
				System.out.println("--------------Welcome to BridgeLabz------------");
				WagePerHr=30;
				Max_WorkingHrsPerMonth=190;
				Max_WorkingDaysPerMonth=24;
				break;
			case 4:
				System.out.println("--------------Welcome to Amazon-----------------");
				WagePerHr=40;
				Max_WorkingHrsPerMonth=195;
				Max_WorkingDaysPerMonth=23;
				break;
			case 5:
				System.out.println("--------------Welcome to Netflix-----------------");
				WagePerHr=50;
				Max_WorkingHrsPerMonth=200;
				Max_WorkingDaysPerMonth=22;
				break;
			default:
				System.out.println("Invalid CompanyId");
				break;
		}
	}

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
		for(Day=1; Day<=Max_WorkingDaysPerMonth; Day++)
		{
			if(WorkingHrs>100)
			{
				DailyWage = 0;
				MonthlyWage+=DailyWage;
			}
			if(WorkingHrs<=100)
			{
				empHrs();
				DailyWage = WagePerHr * HrsPerDay;
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
		empCompany();
		monthlywage();
		System.out.println("Total Salary for month is " +MonthlyWage);
		System.out.println("Total Working Hours are " +WorkingHrs);
	}
}
