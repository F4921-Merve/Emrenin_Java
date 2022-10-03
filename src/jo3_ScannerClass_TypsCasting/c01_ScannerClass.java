package jo3_ScannerClass_TypsCasting;


import java.util.Scanner;

public class c01_ScannerClass {
    public static <kac> void main(String[] args) {

        //kullanıcıdan veri almak için 3 adım takip edilir.
        //1.adım scanner class dan obje create edilir.

       // Scanner scan=new Scanner(System.in);//scanner classından sc isminde değerini System içinden alan bir obje..

        //2adım kullanıcıdan istenen veri için bildirimde bulunur.

       // System.out.println("adınızı giriniz");

        //3adım kullanıcının girdiği veri data tipine göre bir varible atanır.

       // String isim=scan.nextLine();//kullanıcıdan gelen string tipinde isim verisi sc objesıyle nextline metoduyla atandı.










                // kullanıcıdan veri almak içinn şu adım takip edilir
                //1. adım-> Scanner class'dan obj create edilir.

                //  Scanner sc = new Scanner(System.in);// Scanner classından sc isminde değerini System içinden alan bir obj.

                //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
                //  System.out.print("adınızı giriniz :");

                //  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
                //  String isim=sc.nextLine();// kullanıcıdan gelen String tipinde isim verisi sc obj'ni nextLine() methodu ile atandı

                //  System.out.println("isim = " + isim);


         /*
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :2
                 Output : Yilda 12.41 kg seker kullaniyorsunuz

                Scanner sc=new Scanner(System.in);
                System.out.println("günlük içtiğniz çay sayısını giriniz :");//çay için 2 adım
                int caySayisi=sc.nextInt();//çay için 3 adım

                System.out.println("şeker sayinizi giriniz : "); // şeker için 2. adım
                int seker=sc.nextInt();// seker için 3 adım

               // System.out.println("yıllık seker tüketiminiz : "+(caySayisi*seker*1.7*365)/1000+"kg");

          */
       // Scanner sc=new Scanner(System.in);
       // System.out.println("isminizi giriniz");
       // char ch= sc.nextLine().charAt(1);
       // System.out.println("isminizin ilk karekteri:"+ch);

        Scanner sc=new Scanner(System.in);
        System.out.println("isminizi giriniz:");
     // char ch  =sc.nextLine().charAt(1);

     // String isim=sc.nextLine();
        //System.out.println("isim="+isim);
        String ad= sc.next();
        System.out.print("ad="+ad);



          }
        }









