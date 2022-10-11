package zyzz;

import java.io.IOException;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public  void  Save(Customer customer) throws IOException {

		System.out.println("saved to db : " + customer.getFirstName());
	}

	// final if non virtual !
}
