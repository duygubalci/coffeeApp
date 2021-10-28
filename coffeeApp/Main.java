package coffeeApp;

import coffeeApp.Abstract.BaseCustomerManager;
import coffeeApp.Adapters.MernisServiceAdapter;
import coffeeApp.Concrate.StarbucksCustomerManager;
import coffeeApp.Entities.Customer;

;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//customerManager.save(new Customer(1,"Duygu","Balcý", new Date(1990,5,8), "24709574334" ));
		customerManager.save(new Customer("24709574324","Duygu","Balcý", 1990));
		//customerManager.save(new Customer(2,"Engin","Demiroð", new Date(1985,1,6), "11111111111" ));

	}

}
