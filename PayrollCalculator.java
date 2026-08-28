public class PayrollCalculator 
{
    public static void main(String[] args) 
    {
        
        String employeeName = "Rahul Sharma";
        int employeeId = 10245;
        double basicSalary = 45000.00;
        int yearsOfService = 3;

        double hra = 0.25 * basicSalary;  
        double da = 0.15 * basicSalary;   
        double ta = 0.10 * basicSalary;   
        double pf = 0.12 * basicSalary;   

        double grossSalary = basicSalary + hra + da + ta;
        double netSalary = grossSalary - pf;
        double annualSalary = netSalary * 12;
        
        double tax = 0.0;
        if (annualSalary > 500000) {
            tax = 0.10 * annualSalary;
        }

        double finalTakeHome = annualSalary - tax;
        int netSalaryInt = (int) netSalary; 

        System.out.println("+==================================================+");
        System.out.println("|                EMPLOYEE PAY SLIP                 |");
        System.out.println("+==================================================+");
        System.out.println("| Name: " + employeeName + "                               |");
        System.out.println("| ID: " + employeeId + "                                        |");
        System.out.println("| Service: " + yearsOfService + " Years                                 |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Basic Salary:                 Rs. " + basicSalary + "        |");
        System.out.println("| HRA (25%):                    Rs. " + hra + "        |");
        System.out.println("| DA (15%):                     Rs. " + da + "         |");
        System.out.println("| TA (10%):                     Rs. " + ta + "         |");
        System.out.println("| PF Deduction (12%):           Rs. " + pf + "         |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Gross Salary:                 Rs. " + grossSalary + "        |");
        System.out.println("| Net Monthly Salary:           Rs. " + netSalary + "        |");
        System.out.println("| Net Salary (Casted to Int):   Rs. " + netSalaryInt + "        |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Gross Annual Package:         Rs. " + annualSalary + "       |");
        System.out.println("| Income Tax Calculated:        Rs. " + tax + "             |");
        System.out.println("| Final Annual Take-Home:       Rs. " + finalTakeHome + "       |");
        System.out.println("+==================================================+");
    }
}
