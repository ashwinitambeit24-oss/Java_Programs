public class Portfolio 
{
    public static void main(String[] args) 
    {
        String name = "Rahul Sharma";
        int age = 20;
        String college = "IIT Bombay";
        String degree = "B.Tech Computer Science";
        int year = 2; 
        double cgpa = 8.75;
        String skill = "Java Programming";
        
        int yearsLeft = 4 - year;
        double futureCgpa = cgpa + 0.5;

        System.out.println("+==================================================+");
        System.out.println("|             PERSONAL PORTFOLIO CARD              |");
        System.out.println("+==================================================+");
        System.out.println("| Name: " + name + "                               |");
        System.out.println("| Age: " + age + "                                           |");
        System.out.println("| College: " + college + "                           |");
        System.out.println("| Degree: " + degree + "                  |");
        System.out.println("| Year: " + year + "nd Year                                  |");
        System.out.println("| CGPA: " + cgpa + "                                         |");
        System.out.println("| Skill: " + skill + "                         |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Years to Graduation: " + yearsLeft + "                           |");
        System.out.println("| Projected CGPA: " + futureCgpa + "                             |");
        System.out.println("+==================================================+");
    }
}
