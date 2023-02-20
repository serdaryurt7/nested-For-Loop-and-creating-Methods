package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C08_MethodOlusturma {

    public static void main(String[] args) {

        // Kullanıcıdan iki sayı alıp, bunların toplamını yazdıran bir method oluşturun.

        isteToplaYazdir();
        isteToplaYazdir();
    }

    public static void isteToplaYazdir(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

        double sayi1 = scanner.nextDouble();

        double sayi2 = scanner.nextDouble();

        System.out.println("Girilen sayıların toplamı: " + (sayi1 + sayi2));


    }

}
