/**
 * �ki say�n�n yerini de�i�tiren program
 */
package Hafta_1;

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
		System.out.println("--De�i�imden �nce--");
		System.out.print("Birinci say�: ");
		double input1 = sc.nextDouble();
		System.out.print("�kinci say�: ");
		double input2 = sc.nextDouble();
		double temp = input1;
		input1 = input2;
		input2 = temp;
		System.out.println("--De�i�imden sonra--");
		System.out.println("Birinci say�: "+input1);
		System.out.print("�kinci say�: "+input2);
	}

}
