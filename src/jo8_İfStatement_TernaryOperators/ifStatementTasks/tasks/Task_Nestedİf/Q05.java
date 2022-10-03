package jo8_İfStatement_TernaryOperators.ifStatementTasks.tasks.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scn = new Scanner(System.in);
        System.out.println("yaşını  giriniz");
        int yaş = scn.nextInt();
        if (yaş < 18) {
            System.out.println("kan bağışı yapılamaz");
        } else System.out.println("kilonuzu girin");
           int kilo= scn.nextInt();
           if(kilo<50){
               System.out.println("kan bağışı yapabilmek için yeterli kiloya sahip olmadığınızdan"+"kanbağışı yapamazsınız");




        }else System.out.println("kan bağışı yapabilirsiniz");

    }





}
