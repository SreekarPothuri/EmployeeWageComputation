public class CompanyEmployeeWage{
	public final String COMPANY;
	public final int WAGE_PER_HR;
	public final int MAX_WORKINGDAYS_PER_MONTH;
	public final int MAX_WORKINGHRS_PER_MONTH;
	public final int NUM_OF_EMPLOYEES;
	public int MonthlyWage;

	public CompanyEmployeeWage(String COMPANY,int WAGE_PER_HR,int MAX_WORKINGDAYS_PER_MONTH,int MAX_WORKINGHRS_PER_MONTH,int NUM_OF_EMPLOYEES){
		this.COMPANY=COMPANY;
		this.WAGE_PER_HR=WAGE_PER_HR;
		this.MAX_WORKINGDAYS_PER_MONTH=MAX_WORKINGDAYS_PER_MONTH;
		this.MAX_WORKINGHRS_PER_MONTH=MAX_WORKINGHRS_PER_MONTH;
		this.NUM_OF_EMPLOYEES=NUM_OF_EMPLOYEES;
	}

	public void setMonthlyWage(int MonthlyWage){
		this.MonthlyWage=MonthlyWage;
	}

	@Override
	public String toString(){
		return "Monthly Employee Wage for "+ COMPANY +" is : "+MonthlyWage+"\n";
	}
}
