package day02;

public class Q01_Modulus {

    // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
    // Hint: use / and %
    //    input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5

    public static void main(String[] args) {

        int b=12345;

        int birler=b%10; //5
        int onlar=(b/10)%10;//4
        int yuzler=(b/100) %10; //3
        int binler=(b/1000) %10;//2
        int onBinler=(b/10000);//1
        System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler+"\n");























    }


















}
