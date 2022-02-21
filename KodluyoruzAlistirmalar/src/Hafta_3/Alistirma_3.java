/**
 * Girilen sayýnýn fibonacci serisini yazdýrma.
 */
package Hafta_3;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lütfen bir sayý giriniz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cursor1 = 0, cursor2 = 1;
		int sum = 0,counter = 2;
		System.out.print(cursor1+" "+cursor2);
		while(counter < n) {
			sum = cursor1 + cursor2;
			cursor1 = cursor2;
			cursor2 = sum;
			System.out.print(" "+sum);
			counter++;
		}
	}

}
