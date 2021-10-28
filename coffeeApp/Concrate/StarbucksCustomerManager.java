package coffeeApp.Concrate;

import coffeeApp.Abstract.BaseCustomerManager;
import coffeeApp.Abstract.ICustomerCheckService;
import coffeeApp.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
		this.customerCheckService=customerCheckService;
	}
	/*public StarbucksCustomerManager() {
		// TODO Auto-generated constructor stub
	}*/
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.chekIfRealPerson(customer)){
			super.save(customer);
			//BaseCustomerManager.save(customer);
			System.out.println("Kaydedildi");
			
		}else{
			System.out.println("kaydedilmedi");
		}
		
		
	}



}
