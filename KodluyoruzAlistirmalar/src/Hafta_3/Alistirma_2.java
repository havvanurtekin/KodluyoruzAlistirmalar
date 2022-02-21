/**
 * Girilen sayýnýn çarpým tablosunu yazdýrma.
 */
package Hafta_3;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lütfen bir sayý giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0, product = 0;
		System.out.println(n+" Sayýsýnýn Çarpým Tablosu \n");
		while(counter != 11) {
			
			product = counter * n;
			System.out.println(counter+" * "+n+" = "+product);
			counter++;
		}
		
	}

}
