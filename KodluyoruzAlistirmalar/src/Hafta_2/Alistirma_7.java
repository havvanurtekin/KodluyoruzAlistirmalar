/**
 * Kullanýcýnýn girdiði metni kullanýcýnýn girdiði sayýda ekranda yazdýran program
 */
package Hafta_2;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen metni girin: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Metin kaç kere yazýlsýn?: ");
		int adet = sc.nextInt();
		
		for(int i = 1; i <= adet; i++) {
			System.out.println(i+": "+input);
		}
	}

}
