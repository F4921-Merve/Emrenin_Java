package j11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.


		Scanner scn=new Scanner(System.in);
		System.out.println("saat giriniz");
		int saat=scn.nextInt();
		System.out.println("mili giriniz");
		int mil= scn.nextInt();
		System.out.println("kilogram giriniz");
		int kg=scn.nextInt();
		ceviren(saat,mil,kg);


	}
	
	public static void ceviren(int saat,int mil,int kg){
		int saniye=saat*3600;
		double km=mil*1.609344;
		int gram=kg *1000;
		System.out.println("+saat =" + saniye  +"\n" + "km = " + mil  + "\n" + "kg =" + gram );



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
