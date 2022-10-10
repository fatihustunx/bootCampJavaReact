package oop_intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Product product=new Product(); // referans oluþturma, instance
		Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram",10);
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V16");
		product2.setDetail("32 GB Ram");
		product2.setUnitPrice(16000);
		product2.setDiscount(10);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		System.out.println(product1.getName());
		System.out.println(product2.getName());
		
		
		/*
		Product[] products= {product_1,product_2,product_3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		
		Category category_1=new Category();
		category_1.id=1;
		category_1.name="Bilgisayar";
		
		Category category_2=new Category();
		category_2.id=1;
		category_2.name="Ev/Bahçe";
		
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product_1);
		
		productManager.addToCart(product_2);
		
		productManager.addToCart(product_3);
		*/
	}

}
