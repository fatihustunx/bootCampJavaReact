package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber="1234";
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="6789";
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="7542";
		
		CustomerManager customerManager=new CustomerManager();
		
		Customer[] customers= {abc,engin,hepsiBurada};
		
		customerManager.addMultiple(customers);
		}

}
