/**
 * 1’den N’e Kadar Olan Sayýlarýn Toplamýný Bulan Program
 */
package Hafta_1;

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
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("N sayýsýný girin: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			sum += i;
		}
		System.out.println("Toplam: "+sum);
	}

}
