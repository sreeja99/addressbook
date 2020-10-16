package addBook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookIOService {
	private static String HOME= "C:\\Users\\HP\\.eclipse\\org.eclipse.tips.state\\addBook\\src\\address-book.txt";
	public void writeData(List<AddressBook> contactList) {
		StringBuffer contactBuffer = new StringBuffer();
		contactList.forEach(employee -> {
			String employeeDataString = employee.toString().concat("\n");
			contactBuffer.append(employeeDataString);
		});
		try {
			Files.write(Paths.get(HOME), contactBuffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<AddressBook> readData() {
		List<AddressBook> contactList = new ArrayList<>();
		try {
			Files.lines(new File(HOME).toPath()).map(line -> line.trim())
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contactList;
	}
}

	
	