package addressbook;

import java.util.Enumeration;
import java.util.Vector;

public class AddressBook {
	
	Vector<Person> persons;

	public AddressBook() {
		this.persons = new Vector<Person>();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Enumeration<Person> enumeration = this.persons.elements();
		while(enumeration.hasMoreElements()) {
			Person p = enumeration.nextElement();
			sb.append(p.getLastName());
			sb.append(", ");
			sb.append(p.getFirstName());
			sb.append(", ");
			sb.append(p.getAddress());
			sb.append(", ");
			sb.append(p.getPhoneNumber());
			sb.append("\n");			
		}
		return sb.toString();
	}

	public int numberOfPersons() {
		return this.persons.size();
	}

	public void addPerson(String lastName, String firstName, String address, String phoneNumber) {
			this.persons.add(new Person(lastName, firstName, address, phoneNumber));		
	}

}

class Person {

	private final String lastName;
	private final String firstName;
	private final String address;
	private final String phoneNumber;

	public Person(String lastName, String firstName, String address, String phoneNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getAddress() {
		return this.address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

}
