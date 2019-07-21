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
	
	public void init() {
		System.out.println("The bean intiated!");
	}
	
	public void destroy() {
		System.out.println("Bean will get destroyed");
	}
}