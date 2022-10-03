package j04_AritmeticOperators;

import java.util.Scanner;

public class c02_IncrementDecrement {
    public static void main(String[] args) {

        //int a=7;

        //System.out.println(++a);//8
      //  System.out.println(a++);//8
       // System.out.println(a);//9
       // System.out.println(a++ + ++a);//20


        Scanner sc=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz");
        int sayi=sc.nextInt();
        int birler=sayi%10;
        sayi/=10;
        int onlar=sayi%10;
        int yuzler=sayi/10;
        System.out.println("Girdiğiniz sayinin birler basamagı:"+birler+"\n+girdiginiz sayinin onlar basamagı:"+onlar+"\nGirdiginiz sayinin yüzler basamgı:"+yuzler );













    }
}
