public class EmpWageBuilderUC{
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 5;
	public static final int MAX_HRS_IN_MONTH = 20;
	public static void main(String args[])
	{
//		System.out.println("*****Welcome To Employee Details*****");
		//VARIABLES
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWD = 0;
		//cOMPUTATION
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWD < NUM_OF_WORKING_DAYS)
		{
			int empHrs = 0;
			int empWage = 0;
			totalWD++;

			int empCheck = (int) Math.floor(Math.random()*10)%3;

			switch (empCheck)
				{
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
				}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalWage += empWage;
			totalEmpHrs += empHrs;
			System.out.println("Emp Hrs: "+empHrs);
			System.out.println("Emp Wage: "+empWage);
		}
		System.out.println("total Emp wage = " + totalWage);
	}
}
