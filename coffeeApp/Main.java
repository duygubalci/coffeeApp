package coffeeApp;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager();
		customerManager.save(new Customer(1,"Duygu","Balcý", new Date(1990,5,8), "24709574334" ));		

	}

}
