package coffeeApp.Adapters;

import java.rmi.RemoteException;

import coffeeApp.Abstract.ICustomerCheckService;
import coffeeApp.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	public boolean result;
	@Override
	public boolean chekIfRealPerson(Customer customer){
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		/*return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.dateOfBirth);
		/*}catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;*/
		
	try {
			return result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return result;
		
	}

}
