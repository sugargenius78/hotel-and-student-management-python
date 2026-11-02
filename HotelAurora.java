import java.util.Scanner;

public class HotelAurora {
    public static void main(String[] args) {
        //  Enter Costumer's data 
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hotel Aurora");
        System.out.println("Enter Full Name :");
        String name = scan.nextLine();
        System.out.println("Enter Adress :");
        String adress = scan.nextLine();
        System.out.println("Enter Check-in Date :");
        String checkindate = scan.nextLine();
        System.out.println("Enter Check-out Date :");
        String checkoutdate = scan.nextLine();

        

        // Rooms type selection
        System.out.println(" Rooms type ");
        System.out.println("1. Single Room - 100$ per night");
        System.out.println("2. Double Room - 150$ per night");
        System.out.println("3. Deluxe Room - 250$ per night");
        System.out.println("4. Suite Room - 300$ per night");
        System.out.println("Selecte Room type :");
        int roomtype = scan.nextInt();

        // Room type calculation
        System.out.println("Enter number of nights :");
        int nights = scan.nextInt();
        double roomrent = 0;
        switch (roomtype) {
            case 1: roomrent = 100 * nights;break;
            case 2: roomrent = 150 * nights;break;
            case 3: roomrent = 250 * nights;break;
            case 4: roomrent = 300 * nights;break;
            default: roomrent = 0;
            System.out.println("Invalid Room type selected.");
                break;   
        }
        System.out.println("Total room price : $"+roomrent);

        
        // Display menu items and read user's choice.
        double restaurantbill = 0;
        int fooditem;
        while (true) {
            
            System.out.println("  Restaurant menu  ");
            System.out.println(" Appetizers :");
            System.out.println("1. Bruschetta - $8");
            System.out.println("2. Caesar Salad - $12");
            System.out.println("3. Spring Rolls (Vegetarian) - $10");
            System.out.println(" Main courses :");
            System.out.println("4. Grilled Chicken Breast - $18");
            System.out.println("5. Beef Tenderloin Steak - $28");
            System.out.println("6. Vegetarian Lasagna - $16");
            System.out.println("7. Fish and Chips - $20");
            System.out.println(" Specialities :");
            System.out.println("8. Lobster Tail - $35");
            System.out.println("9. Seafood Paella - $30");
            System.out.println("10. Chicken Parmesan - $22");
            System.out.println("Side dishes :");
            System.out.println("11. French Fries - $5");
            System.out.println("12. Steamed Vegetables - $6");
            System.out.println("13. Garlic Mashed Potatoes - $7");
            System.out.println("14. Rice Pilaf - $5");
            System.out.println(" Desserts :");
            System.out.println("15. Cheesecake - $8");
            System.out.println("16. Chocolate Lava Cake - $9");
            System.out.println("17. Tiramisu - $7");
            System.out.println(" Beverages :");
            System.out.println("18. Soft Drinks - $3");
            System.out.println("19. Fresh Juice (Orange, Apple, Cranberry) - $5");
            System.out.println("20. Coffee or Tea - $4");
            System.out.println("21. Wine (Glass) - $10");
            System.out.println("22. Beer (Bottle) - $6");
            System.out.println("0. Next.");
            System.out.println("Select food item (enter 0 to Move Next):");
            fooditem = scan.nextInt();

            // loop if 0 selected move next
            if (fooditem == 0) {
                break;  
            }
        
        
                // Adding prices.
            switch (fooditem) {
                case 1: restaurantbill += 8 ;break;
                case 2: restaurantbill += 12;break;
                case 3: restaurantbill += 10 ;break;
                case 4: restaurantbill += 18 ;break;
                case 5: restaurantbill += 28 ;break;
                case 6: restaurantbill += 16 ;break;
                case 7: restaurantbill += 20 ;break;
                case 8: restaurantbill += 35 ;break;
                case 9: restaurantbill += 30 ;break;
                case 10: restaurantbill += 22 ;break;
                case 11: restaurantbill += 5 ;break;
                case 12: restaurantbill += 6 ;break;
                case 13: restaurantbill += 7 ;break;
                case 14: restaurantbill += 5 ;break;
                case 15: restaurantbill += 8 ;break;
                case 16: restaurantbill += 9 ;break;
                case 17: restaurantbill += 7 ;break;
                case 18: restaurantbill += 3 ;break;
                case 19: restaurantbill += 5 ;break;
                case 20: restaurantbill += 4 ;break;
                case 21: restaurantbill += 10;break;
                case 22: restaurantbill += 6 ;break;
                default: 
                    System.out.println(" Invalid choice! please try again.");
                    break;
            }
        }
            System.out.println("food price :$"+restaurantbill); // Print food price selected
        
        // Display laundry items and read user's selection.
        double laundryprice = 0;
        int laundry;
        while (true) {
            
            System.out.println(" Laundry prices");
            System.out.println("1. Shirt/Blouse - 5$");
            System.out.println("2. Pants/Trousers - 7$");
            System.out.println("3. Dress - 10$");
            System.out.println("4. Suit(jacket + pants) - 15$");
            System.out.println("5. Towel - 3$");
            System.out.println("selected item or (enter 0 to Move Next) :");
            laundry = scan.nextInt();

            if (laundry == 0) {
                break;
            }
            

            // Adding prices
            switch (laundry) {
                case 1: laundryprice += 5;break;
                case 2: laundryprice += 7;break;
                case 3: laundryprice += 10;break;
                case 4: laundryprice += 15;break;
                case 5: laundryprice += 3;break;
                default:
                    System.out.println("Invalid choice! plese try again.");
                    break;
            }
        }
          
        System.out.println("Total laundry cost: $" + laundryprice); // print total price selected 
        
        // Display games tickets type and read user's selection.
        System.out.println(" Games Tickets");
        System.out.println("1. Board Games Ticket - 3$ per hour");
        System.out.println("2. Outdoor Games Ticket - 7$ per hour");
        System.out.println("3. Virtual Reality Ticket - 50$ per hour");
        System.out.println("Select a ticket :");
        int tickettype = scan.nextInt();

        System.out.println("Enter number of hours :");
        int hours = scan.nextInt();
        double tickets = 0;

        // calculate prices per hours
        switch (tickettype) {
            case 1: tickets = 3 * hours;break;
            case 2: tickets = 7 * hours;break;
            case 3: tickets = 50 * hours;break;
            default: tickets = 0;
                System.out.println(" Invalid Ticket selected.");
                break;
        }
        System.out.println("Ticket Price per hours :$"+tickets); // print final price.

        // Display summary of costumer's detail information.
        System.out.println("Full name :"+name);
        System.out.println("Adress :"+adress);
        System.out.println("Check-in Date :"+checkindate);
        System.out.println("Check-out Date :"+checkoutdate);
        System.out.println("Room Type :"+roomtype);
        System.out.println("Room Price :$"+roomrent);
        System.out.println("Restaurant bill :$"+restaurantbill);
        System.out.println("Laundry bill :$"+laundryprice);
        System.out.println("Games Ticket cost :$"+tickets);
        
        double totalCost = roomrent + restaurantbill + laundryprice + tickets;
        System.out.println("Total costs: $" + totalCost); // print total cost.

        scan.close();

    }
}