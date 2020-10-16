package addBook;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import addBook.AddressBookPrintFile.IOservice;

class AddressBookMainTest {

	@Test
	void printingOnFile() {
		AddressBook[] arrayOfPeople = {
				new AddressBook("Sreeja", "Godishala", "hnk", "wgl", "telangana", "506004", "482483388", "srijagodishala@gmail.com"),
				new AddressBook("anjali", "varma", "bank colony", "karimnagar", "Telangana", "172818", "238479284",
						"anjalivarma@gmail.com") };
		AddressBookPrintFile contactList = new AddressBookPrintFile();
		contactList = new AddressBookPrintFile(Arrays.asList(arrayOfPeople));
		contactList.writePersonsData(IOservice.FILE_IO);
	}

}
