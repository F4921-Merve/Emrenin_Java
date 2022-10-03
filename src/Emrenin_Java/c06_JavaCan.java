package Emrenin_Java;

import java.util.Scanner;

public class c06_JavaCan {
    public static void main(String[] args) {
        //                       YENİ KONU=STRİNG CLASS
        /* String class,java.lang kütüpanesinin altında bulunan ve bizlere karakter
        dizeleri üzerinde işlemler gerçekleştirmemizi kolaylaştıran bir imkan sağlar.
        !Bir string değişken,çift tırnak içine alınmış bir karakter koleksiyonu içerir:
        String myBootcamp = "clarusway";

        Bunlar sting işleminin toplamı işlemi olabilir!

                                     ÖRNEK

        String bootcamp="clarusway";
        String success="gayet başarılı";

        System.out.println(bootcamp+" "+success); //Sonuç="Clarusway gayet başarılı" der
        //                YADA
        System.out.println(bootcamp.concat(success));

        Küçük NOT=Eğer string konusunda "toUpperCase()" derse Harfi BÜYÜK olur!
        AMA "toLowerCase()" dersede Harfi KÜÇÜK olur!

        NOT="equals" kelimesi string konusunda string'leri eşit olup olmadığını kontrol eder!
        !Aynı değere sahip olmasına rağmen farklı iki objeye "==" denirse cevap hep "FALSE" olur!
        !String method'ları variable geçici değişiklik yapar!AMA değişken atama olursa kalıcı yapar!
         //                          ÖRNEK

        String bootcamp="clarusway";
        String success=bootcamp + "";

        System.out.println(bootcamp == success); // FALSE
        System.out.println(success == bootcamp); // FALSE
        System.out.println(bootcamp.equals(success)); // TRUE
        System.out.println(success.equals(bootcamp)); // TRUE *

        //                       GERÇEK ÖRNEKLER

        String name = "nur";
        String meslek = " Qa tester";
        name.concat(meslek);
        System.out.println(name.concat(meslek)); //Cevap=nurQa tester
        name = meslek.concat(name);
        System.out.println("name = " + name); //Cevap=name =  Qa testernur

        //  STRİNG ÖRNEKLERİ=

        //!length() methodu girilen string'in uzunluğunu:içinde bulunan karekter sayısını return eder!
        //!bütün karekterlerin(boşluk vs.) sayıp adedini verir!

        String str = "Madem geldin dünyaya otur çalış javaya";

        int strKrtrSayisi = str.length(); //!İnt type bir data verir!
        System.out.println(str); //Cevap=Madem geldin dünya'ya,O zaman Java'nın geç başına :)
        System.out.println(strKrtrSayisi); //Cevap=38
        System.out.println(str.length()); //Cevap=38

        String str1 ="";
        System.out.println(str1.length()); //Cevap=0

        String str2 =" ";
        System.out.println(str2.length()); //Cevap=1

        String str3=null;
        System.out.println(str3.length()); //!DİKKAT! Bu "str3" bölümünden "null" yazdığı için kabul etmez!


        //  CHAR ÖRNEKLERİ=

        //charAt metodu parametre int olarak girilen index deki char değerini return eder
        //indeks değer 0 dan başlar

        String şehir ="istanbul";
        System.out.println("şehir.charAT(5) = " + şehir.charAt(5));//şehir.charAT(5) = b
        char beşinciindexKrkt=şehir.charAt(5);
        System.out.println(beşinciindexKrkt);//Cevap=b
        //son index karakteri -> keng()-1
        şehir.charAt(şehir.length()-1);
        System.out.println(şehir.charAt(şehir.length()-1)); //Cevap=l

        System.out.println(şehir.charAt(0)); //Cevap=I

        System.out.println(şehir.charAt(6)); //Cevap=yanlış!Çünkü "istanbul" kelimesi 8 harfli'dir!

        //                           BÜYÜK BULUŞ
        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime gir : ");
        String kelime = scn.nextLine();

        if (kelime.length()%2!=0){
            System.out.println( kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta kelimesi yoktur");


        //!string içerisinde istenen stringin varlığını kontrol eder.boolean return eder!

        String s1="Enise hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım ifadesi varmıdır?")); //Cevap=FALSE
        System.out.println(s1.contains("E")); //Cevap=TRUE
        System.out.println(s1.contains(" ")); //Cevap=TRUE

        String s2="Qa";
        System.out.println(s1.contains(s2)); //Cevap=TRUE
        System.out.println(s2.contains(s1)); //Cevap=FALSE


        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.


        String şehir="istanbul";
        System.out.println(şehir.startsWith("i")); //Cevap=TRUE
        System.out.println(şehir.startsWith("is")); //Cevap=TRUE
        System.out.println(şehir.startsWith("s")); //Cevap=FALSE
        System.out.println(şehir.startsWith("e", 3)); //Cevap=FALSE
        System.out.println(şehir.startsWith("t", 2)); //Cevap=TRUE

        System.out.println(şehir.endsWith("l")); //Cevap=TRUE
        System.out.println(şehir.endsWith("bul")); //Cevap=TRUE
        System.out.println(şehir.endsWith("bu")); //Cevap=FALSE


        String str="bul";
        System.out.println(şehir.endsWith(str));   //Cevap=TRUE

        // Task01 --> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz" print eden code creae ediniz.

         //       2. BÜYÜK BULUŞ

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen E-mail hesabınızı girin : ");
        String hesap=scn.nextLine();

        if (hesap.contains("@gmail.com")){
            if (hesap.endsWith("@gmail.com")){
                System.out.println("hesabınız onaylandı");
            }else {
                System.out.println("geçerli hesap giriniz");
            }
        }else{
            System.out.println("lütfen gmail hesabı giriniz");
        }

        !NOT!=Eğer string bölümünde yazınızın yazaması ama boşlukları kabul
        etmesini istemiyorsanız kesinlikle "trim()" kullanmanız lazım!

        //                        ÖRNEK

        String bootcamp="   Clarusway ile java çooook kolay :)";
        System.out.println(bootcamp); //Cevap=    Clarusway ile java çooook kolay :)
        System.out.println(bootcamp.length()); //Cevap=37
        System.out.println(bootcamp.trim()); //Cevap=Clarusway ile java çooook kolay :)
        System.out.println(bootcamp.trim().length()); //Cevap=34

        !NOT!=Eğer string konusunda istediğiniz karakterin yeni karakter
        ile değistirmek isterseniz "replace()" kullanmanız lazım!

         //                      ÖRNEK

         String bootcamp="Clarusway ile java çok kolay :)";
        System.out.println(bootcamp.replace("a","x")); //Cevap=Clxruswxy ile jxvx çok kolxy :)
        System.out.println(bootcamp.replace("java",":)")); //Cevap=Clarusway ile :) çok kolay :)

        Task01 -->
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
        */




    }
}
