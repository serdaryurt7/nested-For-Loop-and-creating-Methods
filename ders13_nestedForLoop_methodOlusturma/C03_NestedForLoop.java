package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // 1 ile 4 arasındaki sayılar için çarpım tablosu oluşturalım

        // dış döngü satırları kontrol eder.

        for (int i = 1; i <= 4 ; i++) {

            // iç döngü her satırda olan değerleri kontrol eder.

            for (int j = 1; j <= 4 ; j++) {

                System.out.print(j*i + " ");
            }

            // iç döngü bittiğinde javayi alt satıra indirmeliyiz
            // iç döngü satır sayısını verir.
            // dış döngü sütun

            System.out.println(" ");

        }

    }
}
