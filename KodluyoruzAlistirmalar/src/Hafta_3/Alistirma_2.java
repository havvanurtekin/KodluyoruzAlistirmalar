/**
 * Girilen say�n�n �arp�m tablosunu yazd�rma.
 */
package Hafta_3;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("L�tfen bir say� giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0, product = 0;
		System.out.println(n+" Say�s�n�n �arp�m Tablosu \n");
		while(counter != 11) {
			
			product = counter * n;
			System.out.println(counter+" * "+n+" = "+product);
			counter++;
		}
		
	}

}
