package springcore;

public class Restaurant {
	HotDrink hotDrink;
	
	public void setHotDrink(HotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();
	}
}
