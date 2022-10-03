package jo10_StringManipulations;

import java.util.Scanner;

public class c03_CharAt {
    public static void main(String[] args) {


        //charAt metodu parametre int olarak girilen index deki char değerini return eder
        //indeks değer 0 dan başlar


        String şehir="Istanbul";
        System.out.println("şehir.charAt(5)=" + şehir.charAt(5));
        char beşinciİndekxKrkt=şehir.charAt(5);

        //son indeks karektei
        şehir.charAt(şehir.length()-1);
        System.out.println(şehir.charAt(şehir.length()-1));

        //task istanbul kelımesi ortadaki karekteri print eden code yazın


        Scanner scn=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= scn.nextLine();
        if ((kelime.length()%2!=0)) {
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karektei yoktur");

























    }
}


