package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		
         Scanner scn=new Scanner(System.in);
		System.out.println("üç basamaklı bir sayı giriniz");
		int sayı=123;
		int ilksayı=sayı/100;
		int sonsayı=sayı%10;
		System.out.println(" esas toplam:" +  (ilksayı +sonsayı));


		
	}

}
