/**
 * Verilen bir string�te harfler d���ndaki rakam ve karakterleri bulan program
 * olu�turma.
 */
package Hafta_3;

import java.util.ArrayList;
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

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				System.out.println("Harf: "+str.charAt(i));
			}else if (Character.isDigit(str.charAt(i))) {
				System.out.println("Say�: "+str.charAt(i));
			}else {
				
			}
		}
	}

}
