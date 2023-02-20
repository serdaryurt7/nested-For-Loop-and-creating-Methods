package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {

        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        System.out.println("Tersten yazmak istediğiniz bir cümleyi ya da kelimeyi giriniz: ");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();



        for (int i = input.length()-1; i >= 0 ; i--) {

            System.out.print(input.charAt(i));

        }



    }
}
