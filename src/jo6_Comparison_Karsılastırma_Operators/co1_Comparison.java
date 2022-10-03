package jo6_Comparison_Karsılastırma_Operators;

public class co1_Comparison {
    public static void main(String[] args) {

        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */

        int slmYs=33;
       int krmYs=41;
        System.out.println("krm b esit mi slm b -> "+(krmYs==slmYs));//false
        System.out.println("krm b esit değil  mi slm b -> "+(krmYs!=slmYs));//true
        System.out.println("krm b kucuk mu  slm b -> "+(krmYs<slmYs));//true
        System.out.println("krm b buyuk mu   slm b -> "+(krmYs>slmYs));//true

        String name="kerem bey";
        String name1="kerem bey";
        System.out.println(name1==name);


        String s1="kerem bey";
        String s2="kerem bey";
        System.out.println(s2==s1);

    }
}
