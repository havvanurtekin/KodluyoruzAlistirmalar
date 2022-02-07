/**
 * Kullanýcýdan Alýnan Ýki Ondalýk Sayýyý Çarpma
 */
package Hafta_1;

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


		Scanner sc = new Scanner(System.in);
		System.out.print("Birinci sayýyý girin: ");
		double input1 = sc.nextDouble();
		System.out.print("Ýkinci sayýyý girin: ");
		double input2 = sc.nextDouble();
		double carpim = input1*input2;
		System.out.print("Çarpým sonucu: "+carpim);
	}

}
