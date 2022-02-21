/**
 * While döngüsü ile faktöriyel hesaplama.
 */
package Hafta_3;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen bir sayý giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int factorial = 1;
		while(n != 0) {
			factorial *= n;
			n--;
		}
		System.out.println("Faktöriyel: "+factorial);		
		
	}

}
