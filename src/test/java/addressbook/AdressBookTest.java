package addressbook;

import junit.framework.*;

public class AdressBookTest {
	
    public static Test suite() {
        return new TestSuite(AdressBookTest.class.getDeclaredClasses());
    }

    // TODO: Osoitekirjan tekemisessä TDD:llä on päästy alkuun ja on kirjoitettu 
    // vähintään kolme testiä. Kaikki testit menevät läpi.
    public static class A_new_addressbook extends TestCase {
        private AddressBook book;

        protected void setUp() throws Exception {
        	book = new AddressBook();
        }

        public void test_Is_empty() {
            assertEquals("", book.toString());
        }    	
        
        public void test_has_no_persons() {
        	assertEquals(0, book.numberOfPersons());
        }
    }
    
    // TODO: Osoitekirjaan on toteutettu TDD:llä henkilöiden lisääminen. Kaikki testit menevät läpi.
    public static class When_a_new_person_is_added_to_addressbook extends TestCase {
    	private AddressBook book;
    	
    	protected void setUp() throws Exception {
    		book = new AddressBook();
    	}
    	
    	public void test_add_a_new_person() {
    		book.addPerson("Kokkonen", "Pirjo", "D239", "(09) 1951 1123");
    		
    		assertEquals(1, book.numberOfPersons());
    		assertEquals("Kokkonen, Pirjo, D239, (09) 1951 1123\n",
    					 book.toString());
    	}
    	
    }
    
    // TODO: Osoitekirjaan on toteutettu TDD:llä henkilöiden lisääminen ja hakeminen. 
    // Kaikki testit menevät läpi. 
    public static class When_a_person_is_searched_from_address_book extends TestCase {
    	private AddressBook book;
    	
    	protected void setUp() throws Exception {
    		book = new AddressBook();
    		book.addPerson("Kokkonen", "Pirjo", "D239", "(09) 1951 1123");
    		book.addPerson("Siven", "Reijo", "D236", "(09) 1951 1382");
    		book.addPerson("Toivonen", "Hannu", "D240b", "(09) 1951 1184");
    		book.addPerson("Naalisvaara", "Juho", "Kylänevantie", "(050) 3470 674");    		
    	}
    	
    	public void test_all_added_persons_are_in_the_book() {
    		assertEquals(
    				"Kokkonen, Pirjo, D239, (09) 1951 1123\n" +
    				"Siven, Reijo, D236, (09) 1951 1382\n" +
    				"Toivonen, Hannu, D240b, (09) 1951 1184\n" +
    				"Naalisvaara, Juho, Kylänevantie, (050) 3470 674\n",
					 book.toString());
    		assertEquals(4, book.numberOfPersons());
    	}
    	
    	public void test_search_finds_person_with_fname() {
    		
    		assertEquals("Toivonen, Hannu, D240b, (09) 1951 1184\n",
    					 book.search("Hannu").toString());
    		
    	}
    	
    	// TODO: find a person with lname
    	public void test_search_finds_person_with_lname() {
    		
    		assertEquals("Toivonen, Hannu, D240b, (09) 1951 1184\n",
    					 book.search("Toivonen").toString());
    		
    	}    	
    	
    	// TODO: find a person with address
    	public void test_search_finds_person_with_address() {
    		
    		assertEquals("Siven, Reijo, D236, (09) 1951 1382\n",
    					 book.search("D236").toString());
    		
    	}    	
    	
    	// TODO: find a person with phonenumber
    	public void test_search_finds_person_with_phonenumber() {
    		
    		assertEquals("Naalisvaara, Juho, Kylänevantie, (050) 3470 674\n",
    					 book.search("3470").toString());
    		
    	}        	
    	
    	// TODO: find many persons with phonenumber
    	public void test_search_finds_persons_with_phonenumber() {
    		
    		assertEquals(
    				"Kokkonen, Pirjo, D239, (09) 1951 1123\n" +
    				"Siven, Reijo, D236, (09) 1951 1382\n" +
    				"Toivonen, Hannu, D240b, (09) 1951 1184\n",
    				book.search("1951").toString());
    		
    	}  
    }

}
