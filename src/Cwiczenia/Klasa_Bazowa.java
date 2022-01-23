package Cwiczenia;

public class Klasa_Bazowa {

    private static String[] args;

    public static void main(String[] args) {
        Klasa_Bazowa.args = args;


        Double mojDouble1 = 8.99999999;
        System.out.println(mojDouble1);
        System.out.println(mojDouble1.intValue());


        int x = Integer.parseInt("12"); // zmiana typu string na int
        System.out.println(x);
        double a= Double.parseDouble("12"); //
        System.out.println(a);


    }

}
