/**
 * 2 tane dizideki elemanlarý karþýlaþtýrarak, ayný elemanlarý bulan program 
 * oluþturma.
 */
package Hafta_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Havva Nur TEKÝN
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
		System.out.println("Lütfen girceðiniz dizinin eleman sayýsýný giriniz: ");
		int eleman = sc.nextInt();
		System.out.println("Lütfen elemanlarý giriniz: ");
		for(int i = 0; i < eleman; i++) {
			String a = sc.next();
			arr1.add(a);
		}
		System.out.println("Lütfen elemanlarý giriniz: ");
		for(int i = 0; i < eleman; i++) {
			String a = sc.next();
			arr2.add(a);
		}
		System.out.println("2 dizideki ayný elemanlar:  ");
		arr2.retainAll(arr1);
		System.out.println(arr2);
	}

}
