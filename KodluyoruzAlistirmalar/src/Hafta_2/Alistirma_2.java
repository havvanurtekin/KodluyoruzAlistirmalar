/**
 * 1-N aras� 3 e ve 7�ye Tam B�l�nen Say�lar� Listeleme
 */
package Hafta_2;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen say�y� giriniz: ");
		int n = sc.nextInt();
	
			for(int i = 1; i <= n; i++) {
				if(i % 3 == 0 && i % 7 == 0) {
					System.out.println(i);
				}
			}
		
	}

}
