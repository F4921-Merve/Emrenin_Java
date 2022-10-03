package j02_DataTyps_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {
        String name="Haluk";
        int yas=33;
        System.out.println( name.toLowerCase());

        String tc="12345";
        String id="98765";
      int yeniTC=  Integer.valueOf(tc);//tc Stringi İnt çevirir.

      int yeniID=  Integer.valueOf(id);//tc Stringi İnt çevirir.
        System.out.println("yeniId=" + "yeniId");


        System.out.println("yeniId+yeniTC");
        String okulNo="2345431";
        int yeniOkulNo=Integer.parseInt(okulNo);
        System.out.println("yeniOkulNo="+yeniOkulNo);




// TASK-> byte short int maximum ve minimum değerlerini print eden code yazını
        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5







    }
}
