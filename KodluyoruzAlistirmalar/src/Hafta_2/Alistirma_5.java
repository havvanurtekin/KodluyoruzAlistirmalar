/**
 * Kullan�c�dan 10 adet say� alarak bu say�lar�n toplam�n� ekranda g�steren program
 */
package Hafta_2;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
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
		System.out.println("L�tfen 10 adet say� girin: ");
		for(int i = 0; i < 10; i++) {
			sum += sc.nextInt();
		}
		System.out.println("Toplam: "+sum);
	}

}
