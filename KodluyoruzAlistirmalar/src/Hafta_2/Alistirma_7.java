/**
 * Kullan�c�n�n girdi�i metni kullan�c�n�n girdi�i say�da ekranda yazd�ran program
 */
package Hafta_2;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("L�tfen metni girin: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Metin ka� kere yaz�ls�n?: ");
		int adet = sc.nextInt();
		
		for(int i = 1; i <= adet; i++) {
			System.out.println(i+": "+input);
		}
	}

}
