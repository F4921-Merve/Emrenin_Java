package Day01;

public class QO7_Converting {
/*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fa


   hrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/

    public static void main(String[] args) {

        int gallon=1000;
        double liters=gallon*3.785;
        String result=gallon+"gallondeğeri"+liters+"Litredir";
        System.out.println("result = " + result);


        double litre=100;
        double galon=litre/3.785;
        String result2=litre +"Litre degeri"+galon+"galona eşittir";
        System.out.println("result2 = " + result2);


        double sıcaklık=23;
        double santigrat=50;
        String result3=santigrat+"santigrat degeri"+sıcaklık + "sıcaklık degeri";
        System.out.println("result3 = " + result3);






    }








}
