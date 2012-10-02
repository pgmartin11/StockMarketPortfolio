package edu.uml.project90308.businesslogic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import edu.uml.project90308.persistence.Person;

/**
 * User: pgmartin
 * Date: 10/1/12
 * Time: 1:06 PM
 */
public class AuthenticateTest {

    private Person tPerson;

    @Before
    public void setup() {
        tPerson = new Person("pgmartin", "pg.martin@rcn.com");
    }

    @Test
    public void testAuthenticateConstruction() {
        return;
    }

    @Test
    public void testProcessLoginPositive() {
        Authenticate tAuthenticate = new Authenticate();
        Person person = tAuthenticate.processLogin("pgmartin", "pg.martin@rcn.com");
        assertEquals("Authentication was successful", person, tPerson);
    }

}
