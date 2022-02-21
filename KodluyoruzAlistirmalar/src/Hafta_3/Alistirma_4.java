/**
 * Verilen bir string’te harfler dýþýndaki rakam ve karakterleri bulan program
 * oluþturma.
 */
package Hafta_3;

import java.util.ArrayList;
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

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				System.out.println("Harf: "+str.charAt(i));
			}else if (Character.isDigit(str.charAt(i))) {
				System.out.println("Sayý: "+str.charAt(i));
			}else {
				
			}
		}
	}

}
