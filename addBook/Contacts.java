package addBook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Contacts {

	List<AddressBook> contactList = new ArrayList<AddressBook>();//for adding contacts
	HashMap<String, List<AddressBook>> addressBookMap = new HashMap<String, List<AddressBook>>();//for adding address book
	public List<AddressBook> getContactList() {
		return contactList;
	}

	public void setContactList(ArrayList<AddressBook> contactList) {
		this.contactList = contactList;
	}
	//method for adding contact
	public void addContact(AddressBook obj) {
		contactList.add(obj);
	}
	//method for editing contact
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
	//method for deleting contact
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
   //adding new address book
   public void addAddressList(String listName) {
	   List<AddressBook> newAddressList = new LinkedList<AddressBook>();
	   addressBookMap.put(listName, newAddressList);
   	   System.out.println("Address Book added");
   }

 
   //searching person based on city or state
   public void searchSearchByCityOrState(String searchPerson,int searchChoice, String cityOrState) {
	   for(Map.Entry<String, List<AddressBook>> entry:addressBookMap.entrySet()) {
		   List<AddressBook> list=entry.getValue();
		   if(searchChoice==1)
			   list.stream().filter(obj -> ((obj.getCity().equals(cityOrState))&&(obj.getFirstName().equals(searchPerson)))).forEach(System.out::println);
			else if(searchChoice == 2)
				list.stream().filter(obj -> ((obj.getState().equals(cityOrState))&&(obj.getFirstName().equals(searchPerson)))).forEach(System.out::println);
	   }
   }


   ////Ability to view Persons by City or State UC9
   public void viewPersonByCityOrState(int searchChoice,String cityOrState) {
	   for(Map.Entry<String, List<AddressBook>> entry:addressBookMap.entrySet()) {
		   List<AddressBook> list=entry.getValue();
		   if(searchChoice==1)
			   list.stream().filter(obj -> ((obj.getCity().equals(cityOrState)))).forEach(System.out::println);
		   else if(searchChoice == 2)
			   list.stream().filter(obj -> ((obj.getState().equals(cityOrState)))).forEach(System.out::println);
	   }
   }

   //Ability to get number of contact persons in a city or state uc10
   public long countByCityOrState(int searchChoice,String cityOrState) {
	   long count=0;
	   for(Map.Entry<String, List<AddressBook>> entry:addressBookMap.entrySet()) {
		   List<AddressBook> list=entry.getValue();
		   if(searchChoice==1)
			   count+= list.stream().filter(obj -> ((obj.getCity().equals(cityOrState)))).count();
		   if(searchChoice==2)
			   count+= list.stream().filter(obj -> ((obj.getState().equals(cityOrState)))).count();
	   }
	   return count;
   }
}


