package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.conceretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ToDo: Spring IoC ile çözülecek !
		ProductService productService= new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product=new Product(1, 2,"Elma", 12, 50);
		
		productService.add(product);
		
	}

}
