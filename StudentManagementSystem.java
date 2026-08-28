public class StudentManagementSystem 
{

    private static int javaCounter = 1;
    private static int pythonCounter = 1;
    private static int dsCounter = 1;

    public static void main(String[] args) 
    {
    
        String name1 = "Alice";
        String course1 = "Java";
        String roll1 = enrollStudent(name1, course1);
        double fee1 = calculateFee(course1);
        int[] marks1 = {85, 90, 78};
        double avg1 = calculateAverage(marks1);
        String grade1 = determineGrade(avg1);
        printReport(name1, course1, fee1, avg1, grade1, marks1);

        String name2 = "Bob";
        String course2 = "Python";
        String roll2 = enrollStudent(name2, course2);
        double fee2 = calculateFee(course2, true); 
        int[] marks2 = {92, 88, 95};
        double avg2 = calculateAverage(marks2);
        String grade2 = determineGrade(avg2);
        printReport(name2, course2, fee2, avg2, grade2, marks2);

        String name3 = "Charlie";
        String course3 = "DataScience";
        String roll3 = enrollStudent(name3, course3);

        double fee3 = calculateFee(course3, false, true); 
        int[] marks3 = {70, 65, 72};
        double avg3 = calculateAverage(marks3);
        String grade3 = determineGrade(avg3);
        printReport(name3, course3, fee3, avg3, grade3, marks3);
    }

    public static String enrollStudent(String name, String course) 
    {
        String prefix = "";
        int currentCount = 0;

        if (course.equalsIgnoreCase("Java")) 
        {
            prefix = "JAVA";
            currentCount = javaCounter++;
        } 
        else if (course.equalsIgnoreCase("Python")) 
        {
            prefix = "PYTHON";
            currentCount = pythonCounter++;
        } 
        else if (course.equalsIgnoreCase("DataScience")) 
        {
            prefix = "DS";
            currentCount = dsCounter++;
        } 
        else 
        {
            prefix = "COURSE";
            currentCount = 1;
        }

        String rollNumber = String.format("%s_%03d", prefix, currentCount);
        System.out.println("Enrolled: " + name + " in " + course + " (Roll: " + rollNumber + ")");
        return rollNumber;
    }

    public static double calculateFee(String course) 
    {
        double baseFee = 0;
        if (course.equalsIgnoreCase("Java")) 
        {
            baseFee = 15000;
        } 
        else if (course.equalsIgnoreCase("Python")) 
        {
            baseFee = 12000;
        } 
        else if (course.equalsIgnoreCase("DataScience")) 
        {
            baseFee = 20000;
        }
        System.out.println("Fee: Rs." + baseFee);
        return baseFee;
    }

    public static double calculateFee(String course, boolean hasScholarship) 
    {
        double fee = calculateFee(course); 
        if (hasScholarship) 
        {
            fee = fee * 0.80; 
            System.out.println("Fee: Rs." + fee + " (Scholarship applied)");
        }
        return fee;
    }

    public static double calculateFee(String course, boolean hasScholarship, boolean isLate) 
    {
        double fee = calculateFee(course, hasScholarship); 
        if (isLate) 
        {
            fee = fee + 500;
            System.out.println("Fee: Rs." + fee + " (Late fee applied)");
        }
        return fee;
    }

    public static double calculateAverage(int[] marks) 
    {
        if (marks.length == 0) return 0.0;
        
        int totalSum = 0;
        for (int mark : marks) 
        {
            totalSum += mark;
        }
        return (double) totalSum / marks.length;
    }

    public static String determineGrade(double average) 
    {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public static void printReport(String name, String course, double fee, double average, String grade, int[] marks) 
    {
        System.out.println("\n=== Report: " + name + " ===");
        System.out.println("Course: " + course);
        System.out.println("Fee Paid: Rs." + fee);
        
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) 
        {
            System.out.print(marks[i]);
            if (i < marks.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("=====================");
    }
}

