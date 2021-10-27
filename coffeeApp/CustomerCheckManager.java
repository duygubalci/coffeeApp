package coffeeApp;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class CustomerCheckManager implements ICustomerCheckService{
	@Override
	public boolean chekIfRealPerson(Customer customer) {
		return true ;
	}


}
