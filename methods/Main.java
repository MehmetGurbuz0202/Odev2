package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

		mesaj(7);
	}
	public static void sayiBulmaca() {
		int[] sayilar= {0,1,2,3,4,5};
		int aranacak=6;
		boolean varMi=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
		
			System.out.println("Sayi mevcuttur:"+aranacak);
		}
		else {
			System.out.println("Sayi mevcut değildir:"+aranacak);
		}
		
			
		}
	public static void mesaj(int aranacak) {
		System.out.println("Girdiğiniz sayi :"+aranacak);
	}

}
