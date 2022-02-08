/**
 * Ýki sayýnýn yerini deðiþtiren program
 */
package Hafta_1;

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
		System.out.println("--Deðiþimden önce--");
		System.out.print("Birinci sayý: ");
		double input1 = sc.nextDouble();
		System.out.print("Ýkinci sayý: ");
		double input2 = sc.nextDouble();
		double temp = input1;
		input1 = input2;
		input2 = temp;
		System.out.println("--Deðiþimden sonra--");
		System.out.println("Birinci sayý: "+input1);
		System.out.print("Ýkinci sayý: "+input2);
	}

}
