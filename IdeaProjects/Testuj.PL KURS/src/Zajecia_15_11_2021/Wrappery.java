package Zajecia_15_11_2021;

public class Wrappery {

    public static void main(String[] args) {

        Double a = 1.156; // tak inicjalizujemy typy proste

//        Integer b = new Integer(1); // tak inicjalizujemy klasy


        // a, b - obiekty
        // c = 7;

        int c = 7;
        System.out.println( a instanceof Object);


        //Z wykorzystaniem metod dostępnych w wrapperach wydrukuj
        // - zmienną 'a' jako liczbę zmiennoprzecinkową
        // - zmienną 'e1' jako znak
        // - zmienną 'd' jako liczbę całkowitą



        Float d = 3.2f;
        Character e = 'a';
        Character e1 = 97-32;
        Boolean f = true;


        double jablko = 20.65;
        System.out.println(jablko);

        System.out.println(e1);


        System.out.println(d.longValue());

    }



}
