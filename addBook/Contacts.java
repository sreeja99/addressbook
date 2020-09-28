package addBook;
import java.util.ArrayList;

public class Contacts {

	private ArrayList<AddressBook> contactList = new ArrayList<AddressBook>();

	public ArrayList<AddressBook> getContactList() {
		return contactList;
	}

	public void setContactList(ArrayList<AddressBook> contactList) {
		this.contactList = contactList;
	}
	public void addContact(AddressBook obj) {
		contactList.add(obj);
	}
	public void editContact(String firstName, String lastName, String address, String city, String state, int zip,
			long phoneNumber, String email) {
			for(AddressBook obj:contactList) {
				if(obj.getFirstName().equals(firstName)&&obj.getLastName().equals(lastName)) {
					obj.setFirstName(firstName);
					obj.setLastName(lastName);
					obj.setAddress(address);
					obj.setCity(city);
					obj.setState(state);
					obj.setPhoneNumber(phoneNumber);
					obj.setEmail(email);
					System.out.println("Contact updated successfully");
					break;
				}
				else
					System.out.println("There is no contact with that name");
			}
		}
	
public void delContact(String firstName, String lastName, String address, String city, String state, int zip,
		long phoneNumber, String email) {
		for(AddressBook obj:contactList) {
			if(obj.getFirstName().equals(firstName)&&obj.getLastName().equals(lastName)) {
				contactList.remove(obj);
				System.out.println("Contact deleted successfully");
				break;
			}
			else
				System.out.println("There is no contact with that name");
		}
	}
	
}


