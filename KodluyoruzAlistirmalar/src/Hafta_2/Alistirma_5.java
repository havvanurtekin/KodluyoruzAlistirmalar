/**
 * Kullanýcýdan 10 adet sayý alarak bu sayýlarýn toplamýný ekranda gösteren program
 */
package Hafta_2;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Lütfen 10 adet sayý girin: ");
		for(int i = 0; i < 10; i++) {
			sum += sc.nextInt();
		}
		System.out.println("Toplam: "+sum);
	}

}
