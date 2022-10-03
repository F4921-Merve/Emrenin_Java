package jo9_SwitchStatement;

import java.util.Scanner;

public class c03_SwichStatement {

//TASK girilen ay numarsına göre kaç gün çektiğini print eden code create ediniz.



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("agam bir ay gir bakam  : ");
        int ayNo = sc.nextInt();

switch (ayNo){

    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        System.out.println("girilen ay 31 gün içerir");
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        System.out.println("girilen ay 30 güm içerir");
        break;
    case 2:
        System.out.println("yılını giriniz");
        int yıl= sc.nextInt();
        if (yıl%4==0){
            System.out.println("girilen  ay şubat ayı 29 gün içerir");
        }else System.out.println("girilen ay şubat ayı 28 gün içerir");
        break;
    default:
        System.out.println("adam gibi birşey gir");









}


















    }
}
