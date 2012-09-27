// Persistence tier

package main.java.persistence;

import main.java.presentation.*;
import main.java.businesslogic.*;

import java.util.*;

//todo comment class
public class Person {

    private String name;
    private String email;
    private List symbol;

    // constructor         todo use JavaDoc
    public Person(String name, String email, List symbol) {
        this.name = name;
        this.email = email;
        this.symbol = symbol;
    } // end constructor

    // default constructor
    public Person() {

        List al = new ArrayList();

        this.name   = "Your Mamma";
        this.email  = "noEmail@studentl.uml.edu";
        this.symbol = al;
    }

    // getter methods          todo use JavaDoc
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

    public void setSymbols(List al) {           // todo use whole words for variable names they are much easier to read.
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

    private Person getUser(Person p) {      // todo use whole words for variable names they are much easier to read.
        return p;
    }

    private List getStockList(Person p) {
        List al = new ArrayList();
        return al;
    }

    public String toString() {
        return ("This is a return string!");
    }

}