public class EmployeeWageProblem{
	public static void main(String args[]){
		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");
		double EmpCheck = Math.floor(Math.random() * 10) % 2;
		if(EmpCheck == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
