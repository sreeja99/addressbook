package addBook;
import java.util.HashMap;

public class AddressBookDictionary {
	private HashMap<String,AddressBook> addBookDict = new HashMap<String,AddressBook>();
	public void setAddressBookDictionary(HashMap<String,AddressBook> addBookDict) {
		this.addBookDict = addBookDict;
	}
	public HashMap<String,AddressBook> getAddressBookDictionary() {
		return addBookDict;
	}
	public void addAddressBook(String addressBookName,AddressBook obj) {
		addBookDict.put(addressBookName, obj);
	}
	

}
