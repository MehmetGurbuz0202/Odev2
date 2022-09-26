package classesWithAtributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","Asus Laptop",7000,100);
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(7000);
		product.setStockAmount(100);;
		System.out.println(product.getName());*/
		
		ProductManager prouctManager=new ProductManager();
		prouctManager.add(product);
			
		
	}

}
