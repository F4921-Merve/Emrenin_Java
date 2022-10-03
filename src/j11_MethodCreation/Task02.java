package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //girilen ad ve soyadın ilk harfleri büyük diğerleri küçük yapan method create et


        Scanner scn=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad= scn.next();
        System.out.println("soyadınızı giriniz");
        String soyad= scn.next();
             ebikGabık( ad ,soyad);


















    }

    private static void ebikGabık(String ad,String soyad){
       ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
       soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad:" + ad + " " + soyad);

    }





}
