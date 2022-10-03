package jo8_İfStatement_TernaryOperators;

import java.util.Scanner;

public class c07_NestedTernaryOperator {

    public static void main(String[] args) {


/*
TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */



        Scanner scn=new Scanner(System.in);
        int sayı= scn.nextInt();

        System.out.println((sayı > 999 && sayı < 10000) ? "4 Basamaklı" : sayı % 2 == 0 ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı");








    }















}
