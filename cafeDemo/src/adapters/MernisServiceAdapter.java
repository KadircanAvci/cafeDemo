package adapters;




import abstracts.ICustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		
			boolean result = kpsPublic.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName(),customer.getLastName(),customer.getDateOFBirth());
			if (result == true) {
				return true;
			}else {
				
				return false;
			}
			
	}

}
