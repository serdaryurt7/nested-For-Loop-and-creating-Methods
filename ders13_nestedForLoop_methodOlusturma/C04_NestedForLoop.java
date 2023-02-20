package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        // Aşağıdaki şekli oluşturan bir kod hazırlayın.

        //  * * * * * *
        //  * * * * * *
        //  * * * * * *
        //  * * * * * *

        // outer loop = satır sayısını kontrol ediyor

        for (int i = 1; i <= 4 ; i++) {

            for (int j = 1; j <= 6 ; j++) {  // inner loop = sütun sayısını kontrol ediyor

                System.out.print( "* ");

            }

            System.out.println("");

        }
    }
}
