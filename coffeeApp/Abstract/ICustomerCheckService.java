package coffeeApp.Abstract;

import coffeeApp.Entities.Customer;

public interface ICustomerCheckService {
	
	public boolean chekIfRealPerson(Customer customer);

}
