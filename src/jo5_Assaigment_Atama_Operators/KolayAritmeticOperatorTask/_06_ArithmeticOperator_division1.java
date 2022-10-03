package jo5_Assaigment_Atama_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda boşluk bırakarak 2 tane sayi giriniz ve enter'e basnız");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        System.out.println("num1: "+num1+" ve num2: "+num2+"`nin Toplami= "+ (num1+num2));

    }
}
