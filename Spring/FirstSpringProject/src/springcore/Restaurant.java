package springcore;

import java.util.List;

public class Restaurant {

	/*private List restaruantWaitersList;

	public void setRestaruantWaitersList(List restaruantWaitersList) {
		this.restaruantWaitersList = restaruantWaitersList;
	}

	public void displayWaitersNames() {
		System.out.println("All waiters working in Restaruant  :  " + restaruantWaitersList);
	}*/
	
	String welcomeNote;
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
}