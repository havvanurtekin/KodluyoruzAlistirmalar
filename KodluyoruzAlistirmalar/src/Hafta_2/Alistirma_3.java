/**
 * Diziyi Alfabetik Olarak Sýralama (Kullanýcýnýn gireceði kelimelerden oluþan
diziyi alfabetik olarak sýralama)
 */
package Hafta_2;

import java.util.ArrayList;
import java.util.Collections;
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
		ArrayList<String> a = new ArrayList<String>();
		boolean b = true;
		int i = 0;
		a.add(sc.next());
		while(!a.get(i).equals(".")) {
			++i;
			a.add(sc.next());
			
		}
		Collections.sort(a); 
		System.out.println(a);
	}

}
