import java.util.Scanner;

public class GradingSystem 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Subject 1 Marks: ");
        int s1 = scanner.nextInt();
        
        System.out.print("Enter Subject 2 Marks: ");
        int s2 = scanner.nextInt();
        
        System.out.print("Enter Subject 3 Marks: ");
        int s3 = scanner.nextInt();
        //Marks Validation
        if (s1 < 0 || s1 > 100 || s2 < 0 || s2 > 100 || s3 < 0 || s3 > 100) 
        {
            System.out.println("Invalid marks entered");
            return; 
        }

        //CALCULATE AVERAGE
        double average = (s1 + s2 + s3) / 3.0;

        //CHECK INITIAL PASS OR FAIL STATUS
        boolean passed = (s1 >= 40 && s2 >= 40 && s3 >= 40 && average >= 50);

        //Grace Marks
        if (passed == false) 
            {
            if (s1 >= 35 && s1 <= 39 && s2 >= 40 && s3 >= 40) 
            {
                System.out.println("Grace marks applied to Subject 1");
                s1 = s1 + 5;
                System.out.println("Re-evaluated Subject 1: " + s1);
            } 
            else if (s2 >= 35 && s2 <= 39 && s1 >= 40 && s3 >= 40) 
            {
                System.out.println("Grace marks applied to Subject 2");
                s2 = s2 + 5;
                System.out.println("Re-evaluated Subject 2: " + s2);
            } 
            else if (s3 >= 35 && s3 <= 39 && s1 >= 40 && s2 >= 40) 
            {
                System.out.println("Grace marks applied to Subject 3");
                s3 = s3 + 5;
                System.out.println("Re-evaluated Subject 3: " + s3);
            }
            
            average = (s1 + s2 + s3) / 3.0;
            passed = (s1 >= 40 && s2 >= 40 && s3 >= 40 && average >= 50);
        }

        String grade = "F";
        if (average >= 90) 
        {
            grade = "A";
        } else if (average >= 80) 
        {
            grade = "B";
        } else if (average >= 70) 
        {
            grade = "C";
        } else if (average >= 60) 
        {
            grade = "D";
        }

        String remark = "";
        switch (grade) 
        {
            case "A": remark = "Excellent"; break;
            case "B": remark = "Good"; break;
            case "C": remark = "Average"; break;
            case "D": remark = "Below Average"; break;
            default: remark = "Fail"; break;
        }

        String status = "Failed";
        if (passed == true) 
        {
            status = "Passed";
        }

        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);
        System.out.println("Status: " + status);
        
        scanner.close();
    }
}

