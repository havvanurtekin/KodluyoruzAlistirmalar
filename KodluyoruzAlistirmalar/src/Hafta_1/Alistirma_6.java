/**
 * Girilen Sayýnýn Çarpým Tablosunu Yazdýrma
 */
package Hafta_1;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayý girin: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			product = n*i;
			System.out.println(n+" * "+i+" = "+product);
		}
		
	}

}
