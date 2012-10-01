// Persistence tier

package edu.uml.project90308.persistence;

import edu.uml.project90308.presentation.*;
import edu.uml.project90308.businesslogic.*;

import java.util.*;

public class Person {

    private String name;
    private String email;
    private List symbol;

    // constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
        this.symbol = null;
    } // end constructor

    public Person(String name, String email, List symbol) {
        this.name = name;
        this.email = email;
        this.symbol = symbol;
    } // end constructor

    // default constructor
    public Person() {

        //List al = new ArrayList();

        this.name   = "Your Mamma";
        this.email  = "noEmail@studentl.uml.edu";
        //this.symbol = al;
    }

    // getter methods
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public List getSymbol(){
        return symbol;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String emailAddress) {
        this.email = emailAddress;
    }

    public void setSymbols(List al) {
        this.symbol = al;
    }

    public boolean isAllLetters(String s) {
        return true;
    }

    public static boolean isWhitespace(String str) {
        return true;
    }

    private void saveUser(Person p) {
        System.out.println("I saved a person object!");
    }

    private Person getUser(Person p) {
        return p;
    }

    private List getStockList(Person p) {
        List al = new ArrayList();
        return al;
    }

    public String toString() {
        return ("This is a return string!");
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Person)
                && name.equals(((Person) o).name)
                && email.equals(((Person) o).email);
    }

}