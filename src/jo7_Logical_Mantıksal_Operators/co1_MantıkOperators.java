package jo7_Logical_Mantıksal_Operators;

public class co1_MantıkOperators {
    public static void main(String[] args) {

      /*  -------- && - and - (ve)---------

                True   &&    True    -->  True
        True   &&    False   -->  False
        False  &&    True    -->  False
        False  &&    False   -->  False


                -------- ||- or - (veya)---------

                True   ||    True    -->  True
        True   ||    False   -->  True
        False  ||    True    -->  True
        False  ||    False   -->  False */

        boolean b1=true;
        int a=3;
        int c=7;
        System.out.println(b1&(a<c));
        System.out.println(b1&&(a>c));
        System.out.println(b1&(a==c));


        System.out.println(b1||(a<c));
        System.out.println(b1||(a>c));
        System.out.println(b1||(a==c));



        System.out.println(!(b1||(a<c)));//false



    }
}
