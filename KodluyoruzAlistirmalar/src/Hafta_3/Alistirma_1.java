/**
 * While d�ng�s� ile fakt�riyel hesaplama.
 */
package Hafta_3;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("L�tfen bir say� giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int factorial = 1;
		while(n != 0) {
			factorial *= n;
			n--;
		}
		System.out.println("Fakt�riyel: "+factorial);		
		
	}

}
