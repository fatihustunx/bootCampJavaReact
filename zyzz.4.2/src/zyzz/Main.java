package zyzz;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.Save(new Customer(1,"Fatih","�st�n","52897574165",new SimpleDateFormat("2001/02/12")));
		
	}

}
