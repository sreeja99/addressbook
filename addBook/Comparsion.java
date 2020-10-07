package addBook;

import java.util.Comparator;

public class Comparsion implements Comparator<AddressBook>{
   public enum order{NAME,STATE,CITY,ZIP}
   public order sortingBy;
   public Comparsion(order sortingBy) {
	   this.sortingBy=sortingBy;
   }
	
	@Override
	public int compare(AddressBook o1, AddressBook o2) {
		switch(sortingBy) {
		case NAME: 
			return (o1.getFirstName()+o1.getLastName()).compareTo(o2.getFirstName()+o2.getLastName());
		case CITY: 
			return (o1.getCity().compareTo(o2.getCity()));
		case STATE: 
			return (o1.getState().compareTo(o2.getState()));
		case ZIP: 
			return (o1.getZip().compareTo(o2.getZip()));
		default: System.out.println("Invalid choice");
		}
		return 0;
	
	}

}

