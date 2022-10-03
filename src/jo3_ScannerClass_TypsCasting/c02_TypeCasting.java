package jo3_ScannerClass_TypsCasting;


import java.util.Scanner;

public class c02_TypeCasting{
    public static void main(String[] args) {
       // boolean basarili=true;
       // boolean basari=basarili;
      //  System.out.println("basarili="+basarili);
      //  System.out.println("basari="+basari);


       // double d=17;
       // System.out.println("d="+d);//aouto veding oluyor.ondalığa çevirdi.

        //int sayi1=33;
      //  int sayi2=7;
        //System.out.println(sayi1/sayi2);//4 verir.java 2ınt sayıyı böldüğünde sonucu int atar.

//byte b=127;
  //int i=b;
       // System.out.println("i="+i);

        int num=1453;
        double d1=17; //num;
        System.out.println("d1  = "  +  d1);


        double db =  d1  /  num;
        System.out.println("db+ = "+db);



       double d2=14.53;
        int  num2= (int) d2;
        System.out.println("num2="+num2);

        double d3=333;
        long l= (long) d3;


       System.out.println("l="+l);

        double d4=571.4444;
        long  l2= (long) d3;
        System.out.println("l2 = "+l2);

        Scanner sc=new Scanner(System.in);
        System.out.println("ascci değeri istediğin karekteri gir:");
        char ch=sc.nextLine().charAt(1);
        int chasciDegeri=ch;
        System.out.println("chasci degeri="+chasciDegeri);







    }





}


