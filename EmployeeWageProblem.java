public class EmployeeWageProblem{
	public static void main(String args[]){
		int WagePerHr=20;
		int HrsPerDay=8;
		int DailyWage;
		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");
		double EmpCheck = Math.floor(Math.random() * 10) % 2;
		if(EmpCheck == 1){
			System.out.println("Employee is Present");
			DailyWage = WagePerHr*HrsPerDay;
			System.out.println("Daily Wage is "+DailyWage);
		}else{
			System.out.println("Employee is absent");
		}
	}
}
