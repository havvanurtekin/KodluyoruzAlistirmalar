/**
 * 2 tane dizideki elemanlar� kar��la�t�rarak, ayn� elemanlar� bulan program 
 * olu�turma.
 */
package Hafta_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen girce�iniz dizinin eleman say�s�n� giriniz: ");
		int eleman = sc.nextInt();
		System.out.println("L�tfen elemanlar� giriniz: ");
		for(int i = 0; i < eleman; i++) {
			String a = sc.next();
			arr1.add(a);
		}
		System.out.println("L�tfen elemanlar� giriniz: ");
		for(int i = 0; i < eleman; i++) {
			String a = sc.next();
			arr2.add(a);
		}
		System.out.println("2 dizideki ayn� elemanlar:  ");
		arr2.retainAll(arr1);
		System.out.println(arr2);
	}

}
