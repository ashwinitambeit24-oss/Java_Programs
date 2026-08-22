import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalBill = 0.0;
        int itemCount = 0;
        char choice; 
        
        System.out.println("--- Supermarket Cashier System  ---\n");
        
        do {
            itemCount++; 
            
            System.out.print("Enter name for item " + itemCount + ": ");
            String itemName = scanner.next();
            
            System.out.print("Enter price for " + itemName + ": ₹");
            double itemPrice = scanner.nextDouble();
            
            totalBill += itemPrice;
            
            System.out.print("Scan another item? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
            System.out.println(); 
            
        } while (choice == 'y');
        System.out.println("=================================");
        System.out.println("Total Items Scanned: " + itemCount);
        System.out.printf("FINAL BILL AMOUNT  : ₹%.2f\n", totalBill);
        System.out.println("=================================");
        
        scanner.close();
    }
}

