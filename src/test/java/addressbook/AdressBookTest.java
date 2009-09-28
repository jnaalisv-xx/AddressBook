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
    }
    
    // TODO: Osoitekirjaan on toteutettu TDD:llä henkilöiden lisääminen. Kaikki testit menevät läpi.
    // TODO: Osoitekirjaan on toteutettu TDD:llä henkilöiden lisääminen ja hakeminen. Kaikki testit menevät läpi. 

}
