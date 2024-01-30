package ch008.class01;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		rest.keyboardEnd();
	}
}
