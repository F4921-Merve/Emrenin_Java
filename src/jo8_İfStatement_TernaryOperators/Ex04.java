package jo8_İfStatement_TernaryOperators;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {



        //girilen bir karekterin harf olup olmadığını kontrol edin.

        Scanner sc=new Scanner(System.in);

        System.out.println(" bir karekter giriniz");

        char krktr=sc.nextLine().charAt(0);

        if((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("girdiğimiz , karekter harftir");
        }else System.out.println(("giridğiniz karekter harf değildir:("));








    }
}
