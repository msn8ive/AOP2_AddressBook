package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact 
{		
		Scanner scan = new Scanner(System.in);
		String name;
		String streetAddr;
		String city;
		String state;
		String zip;
		String phone;
		public ArrayList<Contact> book = new ArrayList<>();
		String oldContactName = null;
		
	public Contact() 
	{
		// TODO Auto-generated constructor stub
	}

	public void add()
	{
		Contact newContact = new Contact();
				
        System.out.println("Please enter contact name...");
        this.name = scan.nextLine();
        newContact.setName(name);
       
        System.out.println("Please enter street address...");
        this.streetAddr = scan.nextLine();
        newContact.setStreetAddr(streetAddr);
        
        System.out.println("Please enter city...");
        this.city = scan.nextLine();
        newContact.setCity(city);
        
        System.out.println("Please enter state...");
        this.state = scan.nextLine();
        newContact.setState(state);
        
        System.out.println("Please enter zip code...");
        this.zip = scan.nextLine();
        newContact.setZip(zip);
        
        System.out.println("Please enter phone number...");
        this.phone = scan.nextLine();
        newContact.setPhone(phone);
        
        book.add(newContact);
        System.out.println("-------------------------------------------------------");
        System.out.println("New Contact Added: \n" + newContact.toString());
          
	}
	
	public String delete() 
	{
		for(int i=0; i<book.size(); i++) 
		 { 	
			//System.out.println(i + " " + book.toString());
		 	System.out.println(i + ". " + book.get(i)); 
		 }
		
		System.out.println();
		System.out.println("Which contact # would you like to delete? Enter index number:");
		int byeByeContact = scan.nextInt();
		
		String deletedContact = (book.get(byeByeContact)).toString();
		
		System.out.println("Deleting Contact #" + byeByeContact);
		book.remove(byeByeContact);
		
		
		return deletedContact;
		
	}
	
	
	public String update() 
	{
		for(int i=0; i<book.size(); i++) 
		 { 	
			//System.out.println(i + " " + book.toString());
		 	System.out.println(i + ". " + book.get(i)); 
		 }
		 	
		System.out.println();
		System.out.println("Which contact # would you like to update? Enter index number:");
		int updateChoice = scan.nextInt();
		//updateContact(updateChoice);
		Contact oldContact = book.get(updateChoice);
		String oldContactName = oldContact.toString();
		System.out.println(oldContactName);
		
		System.out.println();
		System.out.println("Overwriting chosen contact. Please enter new information:");
				
		Contact newContact = new Contact();
		
        System.out.println("Please enter contact name...");
        scan.nextLine();
         
        this.name = scan.nextLine();
        newContact.setName(name);
              
        System.out.println("Please enter street address...");
        this.streetAddr = scan.nextLine();
        newContact.setStreetAddr(streetAddr);
        
        System.out.println("Please enter city...");
        this.city = scan.nextLine();
        newContact.setCity(city);
        
        System.out.println("Please enter state...");
        this.state = scan.nextLine();
        newContact.setState(state);
        
        System.out.println("Please enter zip code...");
        this.zip = scan.nextLine();
        newContact.setZip(zip);
        
        System.out.println("Please enter phone number...");
        this.phone = scan.nextLine();
        newContact.setPhone(phone);
        
        book.set(updateChoice, newContact);
        System.out.println("-------------------------------------------------------");
        System.out.println("Contact Updated: \n" + newContact.toString());
		
        return oldContactName;
				
	}
	
	public void display() 
	{
		//System.out.println(book.get(1));
		System.out.println();
		 if (book.isEmpty()){
			 System.out.println("Address Book Empty");
			 	 
		 } else
		 for(int i=0; i<book.size(); i++) { 	
			//System.out.println(i + " " + book.toString());
		 	System.out.println(i + ". " + book.get(i)); 
		 } 		
	}

	public String toString()
	{
		return(this.name+"\t"+this.streetAddr+", "+this.city+", " + this.state + " " + this.zip+"\t"+this.phone);
	}
	
	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public String getName() {
		return name;
	}

	public void setOldContactName(String oldContactName) {
		this.oldContactName = oldContactName;
	}
	
	public String getOldContactName() {
		return oldContactName;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddr() {
		return streetAddr;
	}

	public void setStreetAddr(String streetAddr) {
		this.streetAddr = streetAddr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Contact> getBook() {
		return book;
	}

	public void setBook(ArrayList<Contact> book) {
		this.book = book;
	}
	
	
}
