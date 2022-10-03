package Day03;

import java.util.Scanner;

public class C04_String {

    public static void main(String[] args) {



            // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
            // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                int bosluk = str.indexOf(" ");
                if(bosluk ==-1  && !str.isEmpty())  //bosluk karakteri yoksa ve string ifadem bos degilse
                    System.out.println("sartlara uygun");
                else System.out.println("sartlara uygun degildir");
            }
        }









