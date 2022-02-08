/**
 * Kullanýcý Tarafýndan Girilen Sayýnýn Basamaklarý Toplamýný Bulan Program
 */
package Hafta_1;

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
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayý girin: ");
		int n = sc.nextInt();
		while(n != 0) {
			sum += n % 10 ;
			n = n / 10;
		}
		System.out.print("Sayýnýn basamaklarý toplamý: "+sum);
	}

}
