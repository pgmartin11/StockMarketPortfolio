package test.main.java.presistence;

import main.java.persistence.Person;
import org.junit.After;
import org.junit.Test;
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

    @Test
    public void testGetName() throws Exception {
        Person instance = new Person();
        String expResult = "Your mom";
        String result = instance.getName();
        assertEquals(expResult, result);
        instance = null;
    }

    @Test
    public void testGetEmail() throws Exception {
        Person instance = new Person();
        String expResult = "mom@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        instance = null;
    }

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

    @Test
    public void testSetEmail() throws Exception {
        String emailAddress = "digdug@yahoo.com";
        Person instance = new Person();
        instance.setEmail(emailAddress);
        String result = instance.getEmail();
        assertEquals(emailAddress, result );
        emailAddress = null;
        instance = null;
        result = null;
    }

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

    @Test
    public void testIsAllLetters() throws Exception {


    }

    @Test
    public void testIsWhitespace() throws Exception {

    }

    @Test
    public void testToString() throws Exception {
        Person instance = new Person();
        String expResult = "Name: Your mom, Address: mom@gmail.com, Stock Symbol: [GOOG]";
        String result = instance.toString();
        assertEquals(expResult, result);
        instance = null;
        result = null;
    }
}