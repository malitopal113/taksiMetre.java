package TaksiMetre;
import java.util.Scanner;

public class TaksiMetre {

	public static void main(String[] args) {
		
		double perKm = 2.20, totalPrice; 
		int startPrice= 10, km;
		Scanner input = new Scanner(System.in);
		
		System.out.println("TAKSİMETRE");
		System.out.print("Lütfen mesafeyi KM cinsinden girin: ");
		
		km = input.nextInt();
		
		totalPrice = 10 + (km * perKm);
		
		totalPrice = totalPrice <20 ? 20 : totalPrice;
		
		System.out.println("Toplam Ücret: " + totalPrice + " TL");
	};

}
