// Presentation tier
package main.java.presentation;

import main.java.businesslogic.*;
import main.java.persistence.*;

public class PPages {
	
	public PPages() {
		return;
	}

	public void displayWelcomePage() {
		System.out.println("Welcome to the application");
	}

	public void displayLoginSuccess() {
		System.out.println("You have been logged in");
	}

	public void displayLoginError() {
		System.out.println("Could not log in with username and password provided");
	}

	public void displayLogout() {
		System.out.println("You have been logged out");
	}

}