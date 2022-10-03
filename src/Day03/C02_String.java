package Day03;

import java.util.Scanner;

public class C02_String {
    public static void main(String[] args) {

        /*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */


        Scanner scn=new Scanner(System.in);
        System.out.println("bir kelime girin:");
        String s=scn.nextLine();
        char ortancaKrk=s.charAt((s.length()-1)/2);
        if(s.length()%2==1 &&s.length()>=3){
            System.out.println("ortanca karekter:"+ortancaKrk);

        }else System.out.println("tek sayıda karakter içeren bir kelime giriniz...");















    }










}
