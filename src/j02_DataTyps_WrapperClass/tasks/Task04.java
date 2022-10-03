package j02_DataTyps_WrapperClass.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */


        Scanner scn=new Scanner(System.in);
        System.out.println("*****  clarusway  spor salononu hoşgeldiniz **** ");

        System.out.println("isminizi giriniz");
        String isim= scn.next();

        System.out.println("soyad giriniz");
        String soyad= scn.nextLine();

        System.out.println("yaşınızı giriniz");
        int yaş= scn.nextInt();

        System.out.println("boyunuzu giriniz");
        double boy=scn.nextDouble();

        System.out.println("kionuzu giriniz");
        int kilo= scn.nextInt();
        System.out.println("isim:" + isim + "\n "+ "soyad:" + soyad +  "\n" +  "yaş:" + yaş + "\n" +  "kilo:" +  kilo + "\n" + "boy:" + boy  );

        System.out.println("spor salanumuzun aylık ücreti 20tl:" );
        int aylıkücret=scn.nextInt();
        int toplamücret=scn.nextInt();

        System.out.println("kac ay geleceksiniz");

        System.out.println("toplamücret:" + aylıkücret*toplamücret);


    }
}
