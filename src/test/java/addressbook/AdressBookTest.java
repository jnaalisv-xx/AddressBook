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

}
