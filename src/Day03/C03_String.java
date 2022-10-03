package Day03;

import java.util.Scanner;

public class C03_String {

    public static void main(String[] args) {



// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scn=new Scanner(System.in);
        String isim=scn.next();
        String soyIsim=scn.next();
        if(isim.length()>soyIsim.length());{
            System.out.println("isminiz daha uzun");
            if(isim.length()==soyIsim.length())
                System.out.println("isim ve soyIsim uzunlukları eşit");
            else System.out.println("soyisiminiz daha uzun");

        }














    }
}
