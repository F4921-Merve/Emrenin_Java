package jo9_SwitchStatement;

import java.util.Scanner;

public class c01_SwichCase {

    public static void main(String[] args) {

/*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */

            //task=kullanıcının girdiği rakamı yazı ile print eden cod create ediniz.


        Scanner scn=new Scanner(System.in);
int rakam= scn.nextInt();

switch (rakam){
    case 0:
        System.out.println("girilen rakam sıfır");
    break;
    case 1:
        System.out.println("girilen rakam bir");
      break;
    case 2:
        System.out.println("girilen rakam üç");
        break;
    case 3:
        System.out.println("girilen rakam dört");
        break;
    case 5:
        System.out.println("girilen rakam beş");
        break;

    case 6:
        System.out.println("girilen rakam altı");
        break;

    case 7:
        System.out.println("girilen rakam yedi");
        break;

    case 8:
        System.out.println("girilen rakam sekiz");
        break;


    case 9:
        System.out.println("girilen rakam dokuz");
        break;


    default:
    System.out.println("adam gibi bir rakam gir:");





}
























    }




}
