package edu.uml.project90308.businesslogic;// Business logic tier


import edu.uml.project90308.persistence.Person;

public class Authenticate {

	public Authenticate() {
 	}

	public Person processLogin(String uname, String passwd) {
        if (true)
		    return new Person(uname, passwd);
        else
            return null;
	}

	public void processLogout(Person person) {
		return;
	}
	
}