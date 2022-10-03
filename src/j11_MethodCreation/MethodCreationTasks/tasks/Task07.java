package j11_MethodCreation.MethodCreationTasks.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
   Scanner scn=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1=scn.nextInt();

        System.out.println("2.sayıyı giriniz");
        int sayı2=scn.nextInt();


        System.out.println("3.sayıyı giriniz");
        int sayı3=scn.nextInt();



        enküçükbul(sayı1,sayı2,sayı3);



    }//main sonu

public static void enküçükbul(int a,int b,int c){

        if (a<b && a<c){
            System.out.println("en küçük deger= "+a);
        }else if (b<a && b<c){
            System.out.println("en küçük değer ="+b);
        }else if (c<a && c<b){
            System.out.println("en küçük değer = " +c);
        }





}




    }

