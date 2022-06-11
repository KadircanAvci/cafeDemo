package concrete;



import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
		
	}
	
	public void save(Customer customer) throws Exception  {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			
			
			System.out.println("Saved to DB : " + customer.getFirstName());
		
		}else {
			throw new Exception ("Not a valid person");
		}
	}
		
		

	
}

