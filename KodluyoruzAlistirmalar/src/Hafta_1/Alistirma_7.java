/**
 * Kullan�c� Taraf�ndan Girilen Say�n�n Basamaklar� Toplam�n� Bulan Program
 */
package Hafta_1;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
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
		System.out.print("Bir say� girin: ");
		int n = sc.nextInt();
		while(n != 0) {
			sum += n % 10 ;
			n = n / 10;
		}
		System.out.print("Say�n�n basamaklar� toplam�: "+sum);
	}

}
