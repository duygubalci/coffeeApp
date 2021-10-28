package coffeeApp.Abstract;

import coffeeApp.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomer {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi.." + customer.getFirstName());
		
	}

}
