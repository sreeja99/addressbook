package addBook;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contacts person = new Contacts();
		int choice = 0;

		while (choice != 6) {
			// if its empty add atleast one contact
			if (person.addressBookMap.isEmpty()) {
				System.out.println("Please add an address book to begin");
				System.out.println("Enter the name of address book that u want to add:");
				String listName = sc.nextLine();
				person.addAddressList(listName);
			}
			//ensure there are no duplicates
			System.out.println("Enter the name of the address book you want to access");
			String listName = sc.nextLine();
			if (person.addressBookMap.containsKey(listName)) {
				person.contactList = person.addressBookMap.get(listName);
			}

			else {
				System.out.println("Address list with name" + listName + " not present. Please add it first.");
			}
			System.out.println(
					"Enter a choice: \n 1)Add a new contact \n 2)Edit a contact \n 3)Delete Contact \n 4)Add Address Book \n 5)View Address Book Contacts \n 6)Exit");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				//adding a contact
				System.out.println("Enter the details to add contact");
				System.out.println("Enter First Name");
				sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println("Enter Last Name");
				String lastName = sc.nextLine();
				System.out.println("Enter Address");
				String  address= sc.nextLine();
				System.out.println("Enter City");
				String city = sc.nextLine();
				System.out.println("Enter State");
				String  state= sc.nextLine();
				System.out.println("Enter Zip");
				int  zip= sc.nextInt();
				System.out.println("Enter Phone Number");
				long phoneNumber = sc.nextLong();
				System.out.println("Enter email");
				sc.nextLine();
				String email = sc.nextLine();
				AddressBook obj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
				person.addContact(obj);
				break;
			}
			case 2:
			{
				//editing contact
				System.out.println("Enter the details to edit the contact");
				System.out.println("Enter the first name");
				sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println("Enter Last Name");
				String lastName = sc.nextLine();
				System.out.println("Enter Address");
				String  address= sc.nextLine();
				System.out.println("Enter City");
				String city = sc.nextLine();
				System.out.println("Enter State");
				String  state= sc.nextLine();
				System.out.println("Enter Zip");
				int  zip= sc.nextInt();
				System.out.println("Enter Phone Number");
				long phoneNumber = sc.nextLong();
				System.out.println("Enter email");
				sc.nextLine();
				String email = sc.nextLine();
				person.editContact(firstName, lastName, address, city, state, zip, phoneNumber, email);
				break;
			}
			case 3:
			{
				//deleting contact
				System.out.println("Enter the details to delete the contact");
				System.out.println("Enter the first name");
				sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println("Enter Last Name");
				String lastName = sc.nextLine();
				System.out.println("Enter Address");
				String  address= sc.nextLine();
				System.out.println("Enter City");
				String city = sc.nextLine();
				System.out.println("Enter State");
				String  state= sc.nextLine();
				System.out.println("Enter Zip");
				int  zip= sc.nextInt();
				System.out.println("Enter Phone Number");
				long phoneNumber = sc.nextLong();
				System.out.println("Enter email");
				sc.nextLine();
				String email = sc.nextLine();
				person.delContact(firstName,lastName,address,city,state,zip,phoneNumber,email);
				break;
			}
			case 4:
			{ 
				//adding addressbook
				System.out.println("Enter the name of address book that u want to add:");
				listName = sc.nextLine();
				person.addAddressList(listName);
				break;
			}
			case 5:
			{
				//showing all contacts
				System.out.println(" " + person.contactList);
				break;
			}
			case 6:
			{
				System.out.println("Thank you for using the application");
			}
			}
	}
}
}