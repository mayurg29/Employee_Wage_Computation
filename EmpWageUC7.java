// Computing Employee Wage using Class Method

public class EmpWageUC7 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 10;
    public static final int MAX_HRS_PER_MONTH = 100;
    
    public static void calEmpWage() {
        // Variables
        int empHrs = 0, totalEmpWage =0, totalEmpHrs = 0, totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= MAX_HRS_PER_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            int empWage = empHrs * EMP_RATE_PER_HR;
            System.out.println("Emp Hr: " + empHrs);
            System.out.println("Emp Wage = " + empWage);
            System.out.println();
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println("totalEmpHrs = " + totalEmpHrs);
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }

    public static void main(String[] args) {
        calEmpWage();
    }
}
