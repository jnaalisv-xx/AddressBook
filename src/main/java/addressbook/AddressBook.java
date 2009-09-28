package addressbook;

import java.util.Enumeration;
import java.util.Vector;

public class AddressBook {
	
	Vector<Person> persons;

	public AddressBook() {
		this.persons = new Vector<Person>();
	}
	
	private AddressBook(Vector<Person> matches) {
		this.persons = matches;
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

	public AddressBook search(String string) {
		Enumeration<Person> enumeration = this.persons.elements();
		
		Vector<Person> matches = new Vector<Person>();
		
		while(enumeration.hasMoreElements()) {
			Person p = enumeration.nextElement();			
			if (p.matches(string))
				matches.add(p);			
		}

		return new AddressBook(matches);
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
	
	public boolean matches(String string) {
		return this.firstName.contains(string) ||
			   this.lastName.contains(string) ||
			   this.phoneNumber.contains(string) ||
			   this.address.contains(string);
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
