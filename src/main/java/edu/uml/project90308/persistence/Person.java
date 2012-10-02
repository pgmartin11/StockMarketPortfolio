// Persistence tier

package edu.uml.project90308.persistence;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Alan Derrick
 *
 * This class represents a person.  The kind of person it represents is an investor for our stock
 * program.  The person has a name, an email address, and tracks certain stock symbols.   This Person
 * will check to make sure the name is valid (contains only letters and spaces).  This person will also
 * check to make sure the email address passed to it is not a blank line.
 *
 */
public class Person {
    private String name;
    private String email;
    private ArrayList symbols;

    /**
     * This constructor will accept various parameters and fill the new Person object
     *
     * @param name Name of the person
     * @param email E-mail of the person
     * @param symbols An ArrayList of stock symbols the person is tracking
     */
    public Person(String name, String email, ArrayList symbols) {
        this.name = name;
        this.email = email;
        this.symbols = symbols;
    } // end constructor

    /**
     * This constructor will auto-populate a new Person object.  So if no arguments are given, then this
     * constructor will create the Person object with the "default" values below
     */
    public Person() {

        ArrayList symbolList = new ArrayList();
        // add elements to the array list
        symbolList.add("GOOG");

        this.name = "Your mom";
        this.email = "mom@gmail.com";
        this.symbols = symbolList;
    }

    public Person(String uname, String passwd) {
    }

    /**
     * returns name of the Person
     *
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * returns email of the Person
     *
     * @return
     */
    public String getEmail(){
        return email;
    }

    /**
     * returns an ArrayList of the stock symbols the Person is tracking
     *
     * @return
     */
    public ArrayList<String> getSymbol(){
        return symbols;
    }

    /**
     * verifies the name only contains letters and white space, then sets the name
     *
     * @param name
     * @throws NameException
     */
    public void setName(String name) throws NameException {
        boolean isName = isAllLetters(name);

        if ( isName == true ) {
            this.name = name;
        }
        else {
            throw new NameException("A name must only have letters and spaces.");
        }
    } // end setName

    /**
     * verifies the email address isn't a blank line, then sets the email address
     *
     * @param emailAddress
     * @throws EmailAddressException
     */
    public void setEmail(String emailAddress) throws EmailAddressException {
        boolean isAddress = isWhitespace(emailAddress);
        if (!isAddress) {
            this.email = emailAddress;
        }
        else {
            throw new EmailAddressException("An email address can't be a blank line.", new IllegalStateException());
        }
    } // end setEmail

    /**
     * sets the Person object's ArrayList to the passed ArrayList
     *
     * @param stockSymbols
     */
    public void setSymbols(ArrayList stockSymbols) {
        this.symbols = stockSymbols;
    }

    /**
     * This method verifies the name contains only letters and whitespace
     *
     * @param string
     * @return
     */
    public boolean isAllLetters(String string){
        for(int x = 0 ; x < string.length();x++){
            if(!Character.isLetter(string.charAt(x)) && !Character.isWhitespace(string.charAt(x))){
                return false;
            } // end if
        } // end for
        return true;
    } // end isAllLetters

    /**
     * method to verify the string passed to it is not just a blank line
     *
     * @param string
     * @return
     */
    public static boolean isWhitespace(String string) {
        if (string == null) {
            return false;
        }
        int sz = string.length();
        for (int i = 0; i < sz; i++) {
            if ((Character.isWhitespace(string.charAt(i)) == false)) {
                return false;
            } // end if
        } // end for loop
        return true;
    } // end isWhitespace

    /** method to save the Person object
     *
     * @param person
     */
    private void saveUser(Person person) {
        // writing object to file
        try {
            FileOutputStream saveFile = new FileOutputStream(person.email);
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            save.writeObject(person);
            save.close();   // this also closes saveFile
        }
        catch (Exception e) { // catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    } // end saveUser

    /**
     * gets a Person object from file
     *
     * @param person
     * @return
     */
    private Person getUser(Person person) {
        try {
            FileInputStream saveFile = new FileInputStream(person.email);
            ObjectInputStream restore = new ObjectInputStream(saveFile);
            // Object obj = restore.readObject();
            Person person1 = (Person) restore.readObject();
            restore.close();
            return person1;
        }
        catch (Exception e) { // catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

        return person; // don't think it really should return person here...
    } // end getUser

    /**
     * Overrides the object's toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return ("Name: " + this.name + ", Address: " + this.email +
                ", Stock Symbol: " + this.symbols);
    } // end toString

} // end Person