    //do while -ask user 
    //3 array to store three game data
    //ask score of each user
    //1st game - 1st arry add score
    //score0-100 3 inputs print highest score

    //user input Y/N to exit the program
    // ask user three Games - i.e three arrays
    //ask user how many players plays the game 
    //ask the scores
    //find the max score from each array ,display output as per game name
    // ask the user to exit or countinue
   
import java.util.Scanner;

public class Main4 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        char choice;

        do 
        {
            int numberOfGames;

            do 
            {
                System.out.print("Enter number of games: ");
                numberOfGames = sc.nextInt();
                sc.nextLine();

                if (numberOfGames < 1) 
                {
                    System.out.println("Please enter at least 1 game.");
                }

            } 
            while (numberOfGames < 1);

            String highestPlayer = "";
            String highestGameName = "";
            int highestScore = Integer.MIN_VALUE;

            for (int game = 1; game <= numberOfGames; game++) 
            {

                System.out.println("\n GAME " + game + " ");

                System.out.print("Enter game name: ");
                String gameName = sc.nextLine();

                System.out.print("Enter number of players: ");
                int n = sc.nextInt();
                sc.nextLine();

                String[] playerNames = new String[n];
                int[] scores = new int[n];

                int gameMaxScore = Integer.MIN_VALUE;
                String gameMaxPlayer = "";

                for (int i = 0; i < n; i++) 
                {

                    System.out.print("Enter player " + (i + 1) + " name: ");
                    playerNames[i] = sc.nextLine();

                    System.out.print("Enter score of " + playerNames[i] + ": ");
                    scores[i] = sc.nextInt();
                    sc.nextLine();

                    if (scores[i] > gameMaxScore) 
                    {
                        gameMaxScore = scores[i];
                        gameMaxPlayer = playerNames[i];
                    }

                    
                    if (scores[i] > highestScore) 
                    {
                        highestScore = scores[i];
                        highestPlayer = playerNames[i];
                        highestGameName = gameName;
                    }
                }

                System.out.println("\n--- Result for " + gameName + " ---");
                System.out.println("Highest in this game: " + gameMaxPlayer + " with " + gameMaxScore + " points");
            }

            System.out.println(" OVERALL HIGHEST SCORE FINDER ");
            System.out.println("Game Name       : " + highestGameName);
            System.out.println("Player Name     : " + highestPlayer);
            System.out.println("Highest Score   : " + highestScore);
            
            System.out.print("\nDo you want to continue? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine(); 

        } 
        while (choice == 'Y' || choice == 'y');

        System.out.println("\nProgram terminated. Goodbye!");
        sc.close();
    }
}
