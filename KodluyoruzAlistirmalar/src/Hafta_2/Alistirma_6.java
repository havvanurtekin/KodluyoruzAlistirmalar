/**
 * Bilgisayar�n rastgele tuttu�u 10 say�dan �ift ve tek olanlar�n say�s�n� g�steren program
 */
package Hafta_2;


import java.util.Random;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int sayi = 0, cift = 0, tek = 0;
		System.out.println("Rastgele Say�lar:");
		for(int i = 0; i < 10; i++) {
			sayi = r.nextInt();
			System.out.print(sayi+" ");
			if(sayi % 2 == 0)
				cift++;
			else
				tek++;
		}
		System.out.println("\n�ift say� adedi: "+cift);
		System.out.println("Tek say� adedi: "+tek);
	}

}
