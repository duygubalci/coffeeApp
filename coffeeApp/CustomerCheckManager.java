package coffeeApp;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class CustomerCheckManager implements ICustomerCheckService{

	public boolean result;
	@Override
	public boolean chekIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			return result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.dateOfBirth);
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


}
