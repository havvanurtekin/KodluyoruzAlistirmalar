/**
 * Bilgisayarýn rastgele tuttuðu 10 sayýdan çift ve tek olanlarýn sayýsýný gösteren program
 */
package Hafta_2;


import java.util.Random;

/**
 * @author Havva Nur TEKÝN
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
		System.out.println("Rastgele Sayýlar:");
		for(int i = 0; i < 10; i++) {
			sayi = r.nextInt();
			System.out.print(sayi+" ");
			if(sayi % 2 == 0)
				cift++;
			else
				tek++;
		}
		System.out.println("\nÇift sayý adedi: "+cift);
		System.out.println("Tek sayý adedi: "+tek);
	}

}
