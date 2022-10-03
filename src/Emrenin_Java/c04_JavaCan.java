package Emrenin_Java;

import java.util.Scanner;

public class c04_JavaCan {
    public static void main(String[] args) {
        //                             1. SORU
        //Soru=Kullanıcı tarafından verilen bir harfin,harf olup olmadığını bulan bir kod yazın.
        /* Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        char karakter=sc.nextLine().charAt(0);
        if ((karakter >= 'A' &&karakter <= 'Z') || (karakter >= 'a' &&karakter <= 'z')){
            System.out.println("girdiğiniz karakter Alfabe'den bir harfdir :)");
        }else System.out.println("girdiğiniz karakter malesef harf değildir :(");


        //                             2. SORU
        //Soru=Girilen iki sayıyı seçilen dört işlemden birine uygulayıp sonucu print eden bir kod yazın.
        Scanner scn = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz : ");
        double sayı1= scn.nextDouble();

        System.out.println("2. sayıyı giriniz : ");
        double sayı2= scn.nextDouble();

        System.out.println("+ için -> 1 seciniz \n- için -> 2 seciniz \n* için -> 3 seciniz\n/ için -> 4 seciniz");
        int secim=scn.nextInt();

       if (secim ==1){
           System.out.println("Toplama sonucu : " +sayı1+"+"+sayı2+"="+(sayı1+sayı2));
       }else if (secim ==2){
            System.out.println("Çıkarma sonucu : " +sayı1+"-"+sayı2+"="+(sayı1-sayı2));
        }else if (secim ==3){
           System.out.println("Çarpma sonucu : " +sayı1+"*"+sayı2+"="+(sayı1*sayı2));
       }else if (secim ==4){
           System.out.println("Bölme sonucu : " +sayı1+"/"+sayı2+"="+(sayı1/sayı2));
       }else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");

                                          3. SORU

/* !Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur!


        // TASK03 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner scn=new Scanner(System.in);
        System.out.println("İstediğiniz bir sayı giriniz : ");
        int agaSayisi = scn.nextInt();

        System.out.println(" *** if-else ***");
        if (agaSayisi % 2 == 0){
            System.out.println("sayı çifttir");
        }else System.out.println("Sayı tektir");
        System.out.println(" *** ternary ***");
      String sonuç= (agaSayisi%2==0 ? "Sayınız çift" :"Sayınız tek");
        System.out.println("sonuç = " + sonuç);


        //                                 4. SORU
   // TASK04-> girilen  bir tamsayının Ngatif olup olmadığını kontrol eden kod yazın.

        Scanner scn = new Scanner(System.in);
        System.out.println("Negatif yada Pozitif olan bir sayı girin : ");
       // int kkllncsayısı= scn.nextInt();
       //  if (kkllncsayısı   */
    }
}
