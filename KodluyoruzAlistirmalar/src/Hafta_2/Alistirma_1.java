/**
 * 1 � 1.000.000 Aras�ndaki Asal Say�lar� Listeleme
 */
package Hafta_2;

/**
 * @author Havva Nur TEK�N
 *
 */
public class Alistirma_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1000000,a;
		while(n > 2) {
			a = 0;
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					a++;
				}
			}
			if(a == 0) {
				System.out.print(n);
			}
			n--;
		}
	}

}
