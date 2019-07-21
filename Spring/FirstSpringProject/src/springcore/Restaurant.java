package springcore;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant{

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
	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("The bean is initialising");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("The bean is going to be destroyed");
	}*/
	
	public void init() {
		System.out.println("The bean is getting initialised");
	}
	
	public void destroy() {
		System.out.println("The bean is getting to be destroyed");
	}
	
}