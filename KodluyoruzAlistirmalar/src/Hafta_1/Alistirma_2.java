/**
 * Ýki Tam Sayýnýn Toplamý Programý
 */
package Hafta_1;

/**
 * @author Havva Nur TEKÝN
 * 
 */
import java.util.Scanner;

public class Alistirma_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Sayýlar: ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int toplam = input1 + input2;
		System.out.print("Toplam: "+toplam);
	}

}
