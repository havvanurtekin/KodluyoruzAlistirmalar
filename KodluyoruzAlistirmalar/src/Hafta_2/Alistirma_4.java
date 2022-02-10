/**
 * Girilen Metindeki Sesli Harfleri Bulan Program
 */
package Hafta_2;

import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
 *
 */
public class Alistirma_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sesli = {"a", "e", "ý", "i", "o","ö","u","ü",
						"A","E", "I", "Ý", "O","Ö","U","Ü"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir metin girin: ");
		String input = sc.nextLine();
		
			for(int j = 0; j < sesli.length; j++) {
				if(input.contains(sesli[j])) {
					System.out.println(sesli[j]);
				}
				
			}
		
	}

}
