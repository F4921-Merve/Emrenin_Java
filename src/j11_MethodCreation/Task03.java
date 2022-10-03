package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //task girilen iki sayıyı  seçilen dört işleme hesaplayan method yap


        Scanner scn = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        double sayı1 = scn.nextDouble();


        System.out.println("2.sayıyı giriniz");
        double sayı2 = scn.nextDouble();
        System.out.println("işleminizi giriniz: ");
        char işlem = scn.next().charAt(0);
        işlemMenu(işlem, (int) sayı1, (int) sayı2);


    }

    public static void işlemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x, y);
                break;
            case '-':
                çıkar(x, y);
                break;
            case '*':
                çarp(x, y);
                break;
            case '/':
                bol(x, y);
                break;
            default:
                System.out.println("hatalı seçim yaptınız");


        }
    }

    public static void topla(int a, int b) {
        System.out.println("a+b=" + (a + b));
    }

    public static void çarp(int a, int b) {
        System.out.println("a*b=" + (a * b));


    }

    public static void çıkar(int a, int b) {
        System.out.println("a-b=" + (a - b));

    }

    public static void bol(int a, int b) {
        System.out.println("a/b=" + (a / b));
    }
}