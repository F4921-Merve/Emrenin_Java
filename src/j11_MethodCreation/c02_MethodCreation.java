package j11_MethodCreation;

import java.util.Scanner;

public class c02_MethodCreation {
    public static void main(String[] args) {


        //girilen 3notun ortalamasını hesaplayan method create ediniz



        Scanner scn=new Scanner(System.in);

        System.out.println("1.notu girinz: ");
        double not1= scn.nextDouble();

        System.out.println("2.notu girinz: ");
        double not2= scn.nextDouble();

        System.out.println("3.notu girinz: ");
        double not3= scn.nextDouble();
        double ortalamanız=ortalamaHesaplama(not1,not2,not3);
        System.out.println("not ortalamınız agam=" +ortalamanız);



















    }//main sonu
  private static double ortalamaHesaplama(double a,double b,double c){

      return (a+b+c)/3;
  }







}

