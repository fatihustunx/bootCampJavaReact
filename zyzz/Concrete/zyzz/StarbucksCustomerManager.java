package zyzz;

import java.io.IOException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}


	@Override
	public void Save(Customer customer) throws IOException {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new IOException("Not a valid person");
		}
	}
}
