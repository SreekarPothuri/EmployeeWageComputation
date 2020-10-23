import java.util.ArrayList;

public class EmployeeWageProblem implements Computable{
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;

	private int TotalWage;

	private ArrayList<CompanyEmployeeWage> EmpWageArray;

	public EmployeeWageProblem(){
		EmpWageArray = new ArrayList<>();
	}

	public void addCompanyEmployeeWage(String COMPANY,int WAGE_PER_HR,int MAX_WORKINGDAYS_PER_MONTH,int MAX_WORKINGHRS_PER_MONTH,int NUM_OF_EMPLOYEES){
		CompanyEmployeeWage CompanyEmployeeWage = new CompanyEmployeeWage(COMPANY,WAGE_PER_HR,MAX_WORKINGDAYS_PER_MONTH,MAX_WORKINGHRS_PER_MONTH,NUM_OF_EMPLOYEES);
		EmpWageArray.add(CompanyEmployeeWage);
	}

	public void computeEmpWage(){
		for(int i=0;i<EmpWageArray.size();i++){
			CompanyEmployeeWage CompanyEmployeeWage = EmpWageArray.get(i);
			CompanyEmployeeWage.setMonthlyWage(this.computeEmpWage(CompanyEmployeeWage));
			System.out.println(CompanyEmployeeWage);
		}
	}

        private int computeEmpWage(CompanyEmployeeWage CompanyEmployeeWage) {
		int HrsPerDay=0;
                int WorkingHrs=0;
                int Day=0;

                while(WorkingHrs <= CompanyEmployeeWage.MAX_WORKINGHRS_PER_MONTH && Day < CompanyEmployeeWage.MAX_WORKINGDAYS_PER_MONTH) {
                        Day++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch(empCheck) {
                                case IS_FULL_TIME:
					System.out.print("Day#"+Day+" "+"FullTime Employee and he is present");
                                        HrsPerDay=8;
                                        break;
                                case IS_PART_TIME:
					System.out.print("Day#"+Day+" "+"PartTime Employee and he is present");
                                        HrsPerDay=4;
                                        break;
                                default:
					System.out.print("Day#"+Day+" "+"Employee is Absent");
                                        HrsPerDay=0;
                                        break;
                        }
                        WorkingHrs += HrsPerDay;
                        System.out.println("\t"+"Emp Hr : " +HrsPerDay);
                }
                CompanyEmployeeWage.MonthlyWage = WorkingHrs * CompanyEmployeeWage.WAGE_PER_HR;
		TotalWage = CompanyEmployeeWage.MonthlyWage * CompanyEmployeeWage.NUM_OF_EMPLOYEES;
		System.out.println("Total Wage of Company is "+TotalWage);
		return CompanyEmployeeWage.MonthlyWage;
        }

        public static void main(String args[]) {
		EmployeeWageProblem e = new EmployeeWageProblem();

		e.addCompanyEmployeeWage("TCS",10,10,40,10);
		e.addCompanyEmployeeWage("Infosys",20,12,48,20);
		e.addCompanyEmployeeWage("BridgeLabz",30,14,52,30);
		e.computeEmpWage();
        }
}
