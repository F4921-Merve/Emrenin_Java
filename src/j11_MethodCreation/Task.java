package j11_MethodCreation;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        //girilen iki sayının eşitliğini kontrol eden method create ediniz

        Scanner scn=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        int sayı1= scn.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int sayı2= scn.nextInt();



eşitKontrol(sayı1,sayı2);




    }//main kapanış

    private static boolean eşitKontrol(int sayı1,int sayı2){
        boolean eşitmi=false;
        if(sayı1==sayı2){
            eşitmi=true;

        }else eşitmi=false;
        return eşitmi;



    }

public static  void eşitKontrol2(int a,int b){

        if (a==b){
            System.out.println("agam sayılar eşit");
        }else System.out.println("agam sayılar eşit değil");

}













}
