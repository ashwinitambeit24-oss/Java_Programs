import java.util.Scanner;

public class Main6
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // 1. Read number of employees
        System.out.println("Enter the Number of Employees : ");
        int n = scanner.nextInt();
        
        // 2. Read salaries into a double array
        System.out.println("Enter the Salaries of Employee: ");
        double[] salaries = new double[n];
        double totalPayroll = 0;

        for (int i = 0; i < n; i++) 
        {
            salaries[i] = scanner.nextDouble();
            totalPayroll += salaries[i]; 
        }

        // 3. Compute Average
        double averageSalary = totalPayroll / n;

        // 4. Find Highest and Lowest salaries along with their employee indices
        double maxSalary = salaries[0];
        int maxIndex = 0;
        double minSalary = salaries[0];
        int minIndex = 0;

        for (int i = 1; i < n; i++) 
            {
            if (salaries[i] > maxSalary) 
            {
                maxSalary = salaries[i];
                maxIndex = i;
            }
            if (salaries[i] < minSalary) 
            {
                minSalary = salaries[i];
                minIndex = i;
            }
        }

        // 5. Count employees above average and within Rs.5000 range
        int aboveAverageCount = 0;
        int withinRangeCount = 0;

        for (int i = 0; i < n; i++) 
            {
            if (salaries[i] > averageSalary) 
            {
                aboveAverageCount++;
            }
            // Check if salary is between avg - 5000 and avg + 5000 (inclusive)
            if (salaries[i] >= (averageSalary - 5000) && salaries[i] <= (averageSalary + 5000)) 
            {
                withinRangeCount++;
            }
        }

        // 6. Print Report Output
        System.out.println("===== Salary Analysis Report =====");
        System.out.println("Employees: " + n);
        System.out.println("Total Payroll: Rs." + totalPayroll);
        System.out.printf("Average Salary: Rs.%.2f\n", averageSalary);
        System.out.println("Highest Salary: Rs." + maxSalary + " (Employee " + (maxIndex + 1) + ")");
        System.out.println("Lowest Salary: Rs." + minSalary + " (Employee " + (minIndex + 1) + ")");
        System.out.println("Above Average: " + aboveAverageCount + " employees");
        System.out.println("Within Rs.5000 of Average: " + withinRangeCount + " employees");
        System.out.println("==================================");

        scanner.close();
    }
}
