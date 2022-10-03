package jo8_İfStatement_TernaryOperators;

public class co1_İfStatement {
    public static void main(String[] args) {
        int krmYas = 33;
        int ismYas = 40;
        if (krmYas == ismYas) {
            System.out.println("aynı yasdaysanız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz");
        }
        if (krmYas >= 40)
            System.out.println("krmbey olgunluk yaşındasınız");
        //if blokta {} kullsnılmazsa ilk;kadar olan komut çalışır.


        if (krmYas + ismYas > 100) {
            System.out.println("krmbey ve ism bey yaşları toplamı 100  den büyük");

        }
              //ctrl+alt+l yazarsak reformat java format yapar.





    }
}
