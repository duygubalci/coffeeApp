package coffeeApp;

public abstract class BaseCustomerManager implements ICustomer {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritaban�na kaydedildi.." + customer.getFirstName());
		
	}

}
