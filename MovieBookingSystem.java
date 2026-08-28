import java.util.Scanner;

public class MovieBookingSystem 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        boolean[][][] seats = new boolean[3][5][8]; 

        while (true) 
            {
            System.out.println("\n=== Movie Theater ===");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Tickets");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Hall Summary");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();

            if (choice == 1) 
                {
                
                System.out.print("Select hall (1-3): ");
                int hall = scanner.nextInt() - 1;

                System.out.println("\n Layout for Hall " + (hall + 1) + ":");
                System.out.println("   1 2 3 4 5 6 7 8");
                char[] rowLabels = {'A', 'B', 'C', 'D', 'E'};
                
                for (int r = 0; r < 5; r++) 
                {
                    System.out.print(rowLabels[r] + "  ");
                    for (int s = 0; s < 8; s++) 
                    {
                        
                        char status = seats[hall][r][s] ? 'B' : 'A';
                        System.out.print(status + " ");
                    }
                    System.out.println();
                }

            } else if (choice == 2) 
            {
               
                System.out.print("Select hall (1-3): ");
                int hall = scanner.nextInt() - 1;

                while (true) {
                    System.out.print("Enter row (A-E) or DONE: ");
                    String rowInput = scanner.next().toUpperCase();

                    if (rowInput.equals("DONE")) {
                        break; 
                    }

                    char rowChar = rowInput.charAt(0);
                    int rowIndex = rowChar - 'A'; 
                    System.out.print("Enter seat (1-8): ");
                    int seatIndex = scanner.nextInt() - 1;

                    if (rowIndex < 0 || rowIndex > 4 || seatIndex < 0 || seatIndex > 7) {
                        System.out.println("Invalid row or seat! Try again.");
                        continue;
                    }

                    if (seats[hall][rowIndex][seatIndex]) {
                        System.out.println("\nSeat already booked. Try again.");
                    } else {
                        seats[hall][rowIndex][seatIndex] = true; 
                        System.out.println("Seat " + rowChar + (seatIndex + 1) + " booked successfully!");
                    }
                }

            } else if (choice == 3) 
                {
                
                System.out.print("Select hall (1-3): ");
                int hall = scanner.nextInt() - 1;

                System.out.print("Enter row (A-E): ");
                char rowChar = scanner.next().toUpperCase().charAt(0);
                int rowIndex = rowChar - 'A';

                System.out.print("Enter seat (1-8): ");
                int seatIndex = scanner.nextInt() - 1;

                if (!seats[hall][rowIndex][seatIndex]) {
                    System.out.println("Seat was not booked.");
                } else {
                    seats[hall][rowIndex][seatIndex] = false;
                    System.out.println("Booking cancelled!");
                }

            } else if (choice == 4) {
                
                System.out.print("Select hall (1-3): ");
                int hall = scanner.nextInt() - 1;

                int booked = 0;
               
                for (int r = 0; r < 5; r++) {
                    for (int s = 0; s < 8; s++) {
                        if (seats[hall][r][s]) {
                            booked++;
                        }
                    }
                }

                int available = 40 - booked;
                double percentage = (booked / 40.0) * 100;

                System.out.println("Total seats: 40");
                System.out.println("Booked: " + booked);
                System.out.println("Available: " + available);
                System.out.println("Booking %: " + percentage + "%");

            } else if (choice == 5) {
                
                int totalBookedSeats = 0;
                System.out.println("\n--- FINAL THEATER SUMMARY ---");

                for (int h = 0; h < 3; h++) {
                    int hallBooked = 0;
                    for (int r = 0; r < 5; r++) {
                        for (int s = 0; s < 8; s++) {
                            if (seats[h][r][s]) {
                                hallBooked++;
                            }
                        }
                    }
                    totalBookedSeats += hallBooked;
                    System.out.println("Hall " + (h + 1) + " Booked: " + hallBooked + " / 40");
                }

                int totalRevenue = totalBookedSeats * 250;
                System.out.println("Total Revenue: Rs. " + totalRevenue);
                break; 
            }
        }
        scanner.close();
    }
}
