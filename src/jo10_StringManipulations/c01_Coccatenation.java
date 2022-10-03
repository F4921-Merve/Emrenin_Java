package jo10_StringManipulations;

public class c01_Coccatenation {


    public static void main(String[] args) {

      //concat() metodu içine aldığı string veraibleyi çalıştığı stringin sonuna ekler.
      //javada + işlemi yapılırken eğer en az bir sting veraible varsa tüm java  toplama  değil try {


        String name="merve";
        String meslek="AQ tester";
        System.out.println(name.concat(meslek));

        //tric tsring metodları veriablede geçiçi değişiklik yapar.ama değişken atama yapılırsa kalıcı değişken yaılır.

        name=meslek.concat(name);
        System.out.println("name="+name);


        System.out.println(name.concat(true + " :) "));

           //concat metodu parametre olarak string type harici tüm dataları stringe çevirip cocat eder.











    }
}
