public class EmpWageBuilderUC2{
	public static void main(String args[]){
//		System.out.println("*****Welcome To Employee Details*****");
		//Constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//VARIABLES
		int empHrs = 0;
		int empWage = 0;
		//cOMPUTATION
		double empCheck = Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}
}
