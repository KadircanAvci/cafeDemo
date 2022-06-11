package cafeDemo;




import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerService = new StarbucksCustomerManager(new MernisServiceAdapter());
		
	customerService.save(new Customer(1, "Kadircan", "Avcı", 1995,1111111111));
		
		
	}
}
	
		

