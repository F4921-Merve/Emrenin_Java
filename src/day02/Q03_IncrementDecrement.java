package day02;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("---------Arttırma--------");

        int a=1;
        System.out.println(++a); //Cevap 2
        System.out.println(a++); //Cevap hala 2
        System.out.println(a); //Cevap 3

        System.out.println("------Azaltma------");

        int b=5;
        System.out.println(--b); //Cevap 4
        System.out.println(b--); //Cevap hala 4
        System.out.println(b); //Cevap 3

        System.out.println("----soru1----");

        int x=20;
        int y=15;
        System.out.println(++x + y--); //Cevap 36
        System.out.println("x = " + x); //x = 21
        System.out.println("y = " + y); //y = 14

        System.out.println(++x + --y); //35
        System.out.println("x = " + x); //x = 22
        System.out.println("y = " + y); //y = 13

        System.out.println("------soru2------");

        int k=5;
        System.out.println(++k + k++ + k++ + --k + k-- + k); //Cevap 39
        System.out.println("k = " + k); //Cevap 6

    }
}
