package addBook;

import java.util.List;

public class AddressBookPrintFile {
	public enum IOservice {
		FILE_IO
	}

	private List<AddressBook> contactList;

	public AddressBookPrintFile() {
	}

	public AddressBookPrintFile(List<AddressBook> personsList) {
		this.contactList = personsList;
	}

	public void writePersonsData(IOservice ioservice) {
		if (ioservice.equals(IOservice.FILE_IO))
			new AddressBookIOService().writeData(contactList);
	}

	public List<AddressBook> readPersonsData(IOservice ioservice) {
		if (ioservice.equals(IOservice.FILE_IO))
			this.contactList = new AddressBookIOService().readData();
		return contactList;
	}
}
