/**
 * Kullan�c�dan Al�nan �ki Ondal�k Say�y� �arpma
 */
package Hafta_1;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.print("Birinci say�y� girin: ");
		double input1 = sc.nextDouble();
		System.out.print("�kinci say�y� girin: ");
		double input2 = sc.nextDouble();
		double carpim = input1*input2;
		System.out.print("�arp�m sonucu: "+carpim);
	}

}
