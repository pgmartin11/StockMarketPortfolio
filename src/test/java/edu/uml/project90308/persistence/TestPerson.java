package edu.uml.project90308.persistence;

import edu.uml.project90308.persistence.NameException;
import edu.uml.project90308.persistence.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: seattlecamper
 * Date: 9/26/12
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestPerson {

    private Person person;
    private String DEFAULT_PERSON_NAME = "MOM";

    @Before
    public void setUp() throws NameException {
        person = new Person();
        person.setName(DEFAULT_PERSON_NAME);
    }

    /**
     * todo I was wondering if this is how you to the teardown step, see last line in testGetName() below
     * I have similar code in all the tests below YES, see my setupMethod()
     * <p/>
     * Any method with the @After annotation will run after a test is complete. Use them to clean up after tests
     * Any method with the @Before annotation will run before a test is run. Use them to setup the baseline environment.
     *
     * @throws Exception
     */
    @Test
    public void testGetName() throws Exception {
        Person instance = new Person();
        String result = instance.getName();
        assertEquals(DEFAULT_PERSON_NAME, result);
     }

    /**
     * @throws Exception
     */
    @Test
    public void testGetEmail() throws Exception {
        Person instance = new Person();
        String expResult = "mom@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        instance = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void testGetSymbol() throws Exception {
        ArrayList<String> symbolList = new ArrayList();
        symbolList.add("GOOG");

        Person instance = new Person();
        String expResult = "GOOG";
        String result = (String) symbolList.get(0);
        assertEquals(expResult, result);
        symbolList = null;
        instance = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void testSetName() throws Exception {
        String name = "Buddy";
        Person instance = new Person();
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
        name = null;
        instance = null;
        result = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void testSetEmail() throws Exception {
        String emailAddress = "digdug@yahoo.com";
        Person instance = new Person();
        instance.setEmail(emailAddress);
        String result = instance.getEmail();
        assertEquals(emailAddress, result);
        emailAddress = null;
        instance = null;
        result = null;
    }

    /**
     * @throws Exception
     */
    @Test
    public void testSetSymbols() throws Exception {
        ArrayList<String> symbol = new ArrayList();
        symbol.add("GOOG");
        Person instance = new Person();
        instance.setSymbols(symbol);
        ArrayList<String> result = instance.getSymbol();
        assertEquals(symbol, result);
        symbol = null;
        result = null;
        instance = null;
    }

    /**
     * todo I was wondering how you would write a JUnit test for a method like this
     */
    @Test(expected = NameException.class)
    public void testIsAllLetters() throws Exception {
        Person person = new Person();
        person.setName("Sam");
    }

    /**
     * todo I was wondering how you would write a JUnit test for a method like this
     */
    @Test(expected = NameException.class)
    public void testIsAllLettersNegative() throws Exception {
        Person person = new Person();
        person.setName("213");
    }


    /**
     * @throws Exception
     */
    @Test
    public void testIsWhitespace() throws Exception {

    }

    /**
     * @throws Exception
     */
    @Test
    public void testToString() throws Exception {
        Person instance = new Person();
        String expResult = "Name: Your mom, Address: mom@gmail.com, Stock Symbol: [GOOG]";
        String result = instance.toString();
        assertEquals(expResult, result);
       // todo no need to do this
        instance = null;
        result = null;
    }
}