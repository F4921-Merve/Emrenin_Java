package j11_MethodCreation;

public class c01_MethodCreation {
    public static void main(String[] args) {//main metod açılış

    /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/















topla();
        System.out.println("ağam bu yazıyı okuduysan ahanda yukarıdaki metodun call oldu");

topla2(34,43);//parametreli metod coll

        //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
//Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli


        System.out.println(topla4("selam",48));



    }//main kapanış

    private static int topla4(String str, int a) {//strin ve int parametreleri int return eden metod
        System.out.println(str);
        return a*2;

    }


    // bir method Class'in icinde ama  main method'un disinda  cereate edilir
    // Best practice-> method'lar main method'dan sonra create edilir.

       public static void topla (){//parametresiz return type olmayan void bir metod
        int a=33;
        int b=23;
           System.out.println(a+b);
           System.out.println("topla metodundan selamlar");

       }



       public static void topla2(int a,int b){
           System.out.println("bu metod parametreli");
           System.out.println(a+b);
       }



}//class kapanış
