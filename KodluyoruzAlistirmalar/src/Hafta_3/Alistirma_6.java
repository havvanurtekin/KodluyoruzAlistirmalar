/**
 * Girilen say�n�n binary olup olmad��� kontrol� yapan bir metod olu�turma.
 */
package Hafta_3;

import java.util.Scanner;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_6 {

	/**
	 * @param args
	 */
	public static boolean isBinary(int n) {
		int temp = n;
		while(temp != 0) {
			if(temp % 10 > 1)
				return false;
			temp = temp / 10;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		if(isBinary(binary)) {
			System.out.println(binary+": Binary");
		}else {
			System.out.println(binary+": Binary de�il");
		}
	}

}
