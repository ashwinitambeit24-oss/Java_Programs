
    //function - askSupervisor (data - countinuous three days which has profit or loss)
    //array with size 7
    //ask salesman -> enter data (10,-10)
    //ask Supervisor
    //0 Sunday 6-saturday
    //ask supervisor which data want's either profit or loss


import java.util.Arrays;
import java.util.Scanner;

public class Main5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] sales = new int[7];
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        // Input 7 days of data
        for (int i = 0; i < 7; i++) 
        {
            System.out.print("Enter sales for " + days[i] + ": ");
            sales[i] = sc.nextInt();
        }

        // Supervisor choice: 1 for Profit, 2 for Loss
        System.out.print("Enter 1 for Max Profit or 2 for Max Loss: ");
        int choice = sc.nextInt();

        askSupervisor(sales, days, choice);
    }

    public static void askSupervisor(int[] data, String[] days, int choice) 
    {
        int bestSum = data[0] + data[1] + data[2];
        int startDay = 0;

        // Check contiguous 3-day data
        for (int i = 0; i <= 4; i++) 
        {
            int currentSum = data[i] + data[i + 1] + data[i + 2];

            if (choice == 1 && currentSum > bestSum) 
            { 
                // Max Profit
                bestSum = currentSum;
                startDay = i;
            } 
            else if (choice == 2 && currentSum < bestSum) 
            { // Max Loss
                bestSum = currentSum;
                startDay = i;
            }
        }

       
        System.out.println("Result Sum: " + bestSum);
        System.out.println("Days: " + days[startDay] + " to " + days[startDay + 2]);
    }
}
