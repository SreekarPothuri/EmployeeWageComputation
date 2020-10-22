public class EmployeeWageProblem {
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;

        public static int computeEmpWage(String company, int WagePerHr, int Max_WorkingDaysPerMonth, int Max_WorkingHrsPerMonth) {
                int HrsPerDay=0;
                int WorkingHrs=0;
                int Day=0;

                while(WorkingHrs <= Max_WorkingHrsPerMonth && Day < Max_WorkingDaysPerMonth) {
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
                int MonthlyWage = WorkingHrs * WagePerHr;
                System.out.println("******Total Emp Wage for Company: " +company+ " is "+MonthlyWage+"**************");
                return MonthlyWage;
        }

        public static void main(String args[]) {
		System.out.println("*****WELCOME TO EMPLOYEE WAGE PROBLEM*****");
                computeEmpWage("PrimeVideo",10,2,10);
                computeEmpWage("Netflix",20,4,15);
                computeEmpWage("BridgeLabz",30,6,20);
                computeEmpWage("Amazon",40,8,25);
                computeEmpWage("Microsoft",50,10,30);
        }
}
