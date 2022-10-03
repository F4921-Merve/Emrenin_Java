package day02;

import java.util.Scanner;

public class Q02_Modulus {

    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */


    public static void main(String[] args) {


        Scanner scn=new Scanner(System.in);
        System.out.println("beş basamaklı bir sayı girin:");
        int sayı= scn.nextInt();
        int ilk2=sayı/1000;
        int son2=sayı%100;
        int ilkikitop=(ilk2/10) + (ilk2%10);
        System.out.println("ilkikitop = " + ilkikitop);
        int sonikitop=(son2/10) +  (son2%10);
        System.out.println("sonikitop = " + sonikitop);
        System.out.println("Esas Toplam = " + (ilkikitop + sonikitop));














    }



}
