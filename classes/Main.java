package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add();
		customerManager.delete();
		customerManager.uptadate();
		//Değer Tipleri: “int”, “long”, “float”, “double”, “decimal”, “char”, “bool”, “byte”, “short”, “struct”, “enum”
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		//Referans Tipleri: “string”, “object”, “class”, “interface”, “array”, “delegate”, “pointer”
		int [] sayilar1= {1,2,3};
		int [] sayilar2= {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=9;
		System.out.println(sayilar2[0]);
	}

}
