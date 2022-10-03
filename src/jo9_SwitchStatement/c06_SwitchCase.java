package jo9_SwitchStatement;

import java.util.Scanner;

public class c06_SwitchCase {

    public static void main(String[] args) {

      //girilen haftanın gününü hafta içi veya sonu olduğunu print eden code crate ediniz


        Scanner sc = new Scanner(System.in);
        System.out.print("girilen haftanın hafta sonumu hafta içimi olduğunu gir:");
        String gün= sc.next().toLowerCase();

        switch (gün){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içine aittir");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("haftasonuna aittir");
                break;
            default:
                System.out.println("lütfen doğru giriş yapınız");



        }


















    }
}
