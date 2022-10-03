package jo10_StringManipulations;

import java.util.Scanner;

public class c04_Contains {
    public static void main(String[] args) {

        //string içerisinde istenen stringin varlığını kontrol eder.boolean return eder


        String s1="Enise Hanım başarılı bir QA tester team lead";
        System.out.println( s1.contains("hanım"));
        System.out.println(s1.contains("E"));




        String s2="Qa";
        System.out.println(s1.contains(s2));//true sıralama önemlı ılk s1 sonra s2
        System.out.println(s2.contains(s1));//false


        //girilen bir cümlede arana kelimenin varliğinı kontrol eden code create edınız
       // ternary kullanınız.


        Scanner scn=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle= scn.nextLine();
        System.out.println("kelime giriniz");
String kelime= scn.nextLine();
        System.out.println(cümle.contains(kelime));
        if(cümle.contains(kelime)){
            System.out.println("true");

        }else System.out.println("folse");
















    }
}
