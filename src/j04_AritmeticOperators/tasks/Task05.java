package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
int saat=2;
int dakika=50;
int saniye=40;
        int sonuç=saat*3600+dakika*60+saniye;
        System.out.println(saat + "saat" + dakika +"dakika" +saniye +"saniye-->"+sonuç);

    }

}
