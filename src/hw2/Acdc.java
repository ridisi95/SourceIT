package hw2;

public class Acdc {

    public static void main(String[]args) {

        String acdc = "ACDC";
        int hexInt = Integer.decode("0x" + acdc.toLowerCase());
        System.out.println(hexInt);
    }
}
