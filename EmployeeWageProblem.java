public class EmployeeWageProblem {
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;

	private final String COMPANY;
	private final int WAGE_PER_HR;
	private final int MAX_WORKINGDAYS_PER_MONTH;
	private final int MAX_WORKINGHRS_PER_MONTH;
	private final int NUM_OF_EMPLOYEES;
	private int MonthlyWage;
	private int TotalWage;

	public EmployeeWageProblem(String COMPANY, int WAGE_PER_HR, int MAX_WORKINGDAYS_PER_MONTH, int MAX_WORKINGHRS_PER_MONTH,int NUM_OF_EMPLOYEES) {
		this.COMPANY = COMPANY;
		this.WAGE_PER_HR = WAGE_PER_HR;
		this.MAX_WORKINGDAYS_PER_MONTH = MAX_WORKINGDAYS_PER_MONTH;
		this.MAX_WORKINGHRS_PER_MONTH = MAX_WORKINGHRS_PER_MONTH;
		this.NUM_OF_EMPLOYEES = NUM_OF_EMPLOYEES;
	}

        public void computeEmpWage() {
		int HrsPerDay=0;
                int WorkingHrs=0;
                int Day=0;

                while(WorkingHrs <= MAX_WORKINGHRS_PER_MONTH && Day < MAX_WORKINGDAYS_PER_MONTH) {
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
                MonthlyWage = WorkingHrs * WAGE_PER_HR;
		System.out.println("Monthly Wage of an employee is "+MonthlyWage);
		TotalWage = MonthlyWage * NUM_OF_EMPLOYEES;
        }

	@Override
	public String toString() {
		return "*****Total Wage for Company " +COMPANY+ " is "+TotalWage+"*****\n";
	}

        public static void main(String args[]) {
		EmployeeWageProblem TCS = new EmployeeWageProblem("TCS",10,10,40,10);
		EmployeeWageProblem Infosys = new EmployeeWageProblem("Infosys",20,12,48,20);
		EmployeeWageProblem BridgeLabz = new EmployeeWageProblem("BridgeLabz",30,14,52,30);
		EmployeeWageProblem Amazon = new EmployeeWageProblem("Amazon",40,16,60,40);
		EmployeeWageProblem Netflix = new EmployeeWageProblem("Netflix",50,20,60,50);

                TCS.computeEmpWage();
		System.out.println(TCS);
                Infosys.computeEmpWage();
		System.out.println(Infosys);
                BridgeLabz.computeEmpWage();
		System.out.println(BridgeLabz);
                Amazon.computeEmpWage();
		System.out.println(Amazon);
                Netflix.computeEmpWage();
		System.out.println(Netflix);
        }
}
