package jo8_İfStatement_TernaryOperators;

import java.util.Scanner;

public class c06_NestedTernaryOperator {

     /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */


    public static void main(String[] args) {


        Scanner scn=new Scanner(System.in);
        int sayı= scn.nextInt();
        System.out.println(sayı>=0 ?(sayı<10 ?  "Rakam":"Pozitif sayı") : "Negatif Sayı");










    }











}
