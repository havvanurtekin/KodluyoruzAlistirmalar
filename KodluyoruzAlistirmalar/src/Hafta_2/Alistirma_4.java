/**
 * Girilen Metindeki Sesli Harfleri Bulan Program
 */
package Hafta_2;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sesli = {"a", "e", "�", "i", "o","�","u","�",
						"A","E", "I", "�", "O","�","U","�"};
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen bir metin girin: ");
		String input = sc.nextLine();
		
			for(int j = 0; j < sesli.length; j++) {
				if(input.contains(sesli[j])) {
					System.out.println(sesli[j]);
				}
				
			}
		
	}

}
