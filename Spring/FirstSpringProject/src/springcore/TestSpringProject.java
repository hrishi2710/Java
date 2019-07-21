package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaurant restaurantObj1 = (Restaurant) context.getBean("restaurantBean");
		restaurantObj1.setWelcomeNote("Object 1 is setting welcome note 1 property");
		restaurantObj1.greetCustomer();
		
		Restaurant restaurantObj2 = (Restaurant) context.getBean("restaurantBean");
		restaurantObj2.greetCustomer();
	}
}