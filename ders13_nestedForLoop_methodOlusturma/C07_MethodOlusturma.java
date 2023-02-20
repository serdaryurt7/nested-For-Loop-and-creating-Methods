package ders13_nestedForLoop_methodOlusturma;

public class C07_MethodOlusturma {

    public static void main(String[] args) {

        String str = "Java Muhtesemdir";

        String buyukStr = str.toUpperCase();

        System.out.println(str);    // Java Muhtesemdir

        System.out.println(buyukStr);   // JAVA MUHTESEMDİR

        // metnin buyuk harflere cevrilmis hali S icerir mi ?

        System.out.println(buyukStr.contains("S"));  // true

    }

}
