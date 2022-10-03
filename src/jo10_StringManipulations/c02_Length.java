package jo10_StringManipulations;

public class c02_Length {


    public static void main(String[] args) {

        //length metodu girilen stringin uzunluğunu:içinde bulunan karekter sayısını return eder.
        // bütün karekterlerin adedini boşlukta dahil sayıp adedini verir


        String str="madem geldin dünyaya otur çalış javaya";
        int strKrktrSayısı=str.length();
        System.out.println(str);
        System.out.println(strKrktrSayısı);
        System.out.println(str.length());



        String str1="";
        System.out.println(str1.length());


        String str2=" ";
        System.out.println(str2.length());


        String str3=null;
        System.out.println(str3.length());
        //


        //null case sensitivediryani null ve büyük NULLhiçliği gösteren bir pointer.

















    }
}
