// Business logic tier
package edu.uml.project90308.businesslogic;

import edu.uml.project90308.presentation.*;
import edu.uml.project90308.persistence.*;

public class Authenticate {

	public Authenticate() {
		return;
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