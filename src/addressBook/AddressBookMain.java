package addressBook;

import java.util.Scanner;

public class AddressBookMain {

	public AddressBookMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Contact contact = new Contact();
		//main menu of address book
		do {
            displayMenu();

            int choice = scan.nextInt();
            switch (choice) {
                case 1: // create a new account
                    contact.add();
                    break;

                case 2:  // read in files from existing account user
                	contact.delete();
                    break;

                case 3:  // make a new reservation
                	contact.update();
                    break;

                case 4:  // modify an existing reservation
                	contact.display();
                    break;

                case 5:
                    scan.close();
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
            }
        } while (true);
	}

	 public static void displayMenu() {
		 	System.out.println("-------------------------------------------------------");
		 	System.out.println("\nWelcome to Your Address Book!");
	        System.out.println("1. Add a Contact to the Address Book...");
	        System.out.println("2. Delete a Contact from the Address Book...");
	        System.out.println("3. Update a Contact from the Address Book...");
	        System.out.println("4. Display a Contact from the Address Book...");
	        System.out.println("5. Exit .... ");
	        System.out.println("-------------------------------------------------------");
	    }
}
