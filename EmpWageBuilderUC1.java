public class EmpWageBuilderUC1{
	public static void main(String args[]){
//		System.out.println("*****Welcome To Employee Details*****");
		//Constants
		int IS_FULL_TIME = 1;
		//cOMPUTATION
		double empCheck = Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
