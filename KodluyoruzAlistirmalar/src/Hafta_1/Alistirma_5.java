/**
 * 1�den N�e Kadar Olan Say�lar�n Toplam�n� Bulan Program
 */
package Hafta_1;

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
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("N say�s�n� girin: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			sum += i;
		}
		System.out.println("Toplam: "+sum);
	}

}
