package Zajecia_08_11_2021;

import java.util.Scanner;

public class Praca_domowa_zajecia_2 {


    /**
     * Zajecia_08_11_2021.Metody - praca domowa
     * Anna Janus
     * 8.11.2021
     * 1 Ćwiczenie
     * Napisz metodę, która:
     * • nic nie zwraca
     * • przyjmuje jako argument wiek użytkownika
     * • wyświetla wiek użytkownika na ekranie
     * 2 Ćwiczenie
     * Napisz metodę, która:
     * • przyjmuje jako argument liczbę
     * • zwraca tę liczbę podniesioną do kwadratu
     * 3 Ćwiczenie
     * Napisz metodę, która:
     * • przyjmuje 3 liczby jako argumenty
     * • zwraca sumę tych trzech liczb
     * 4 Ćwiczenie
     * Wymyśl aplikację, którą chciałabyś/chciałbyś stworzyć. W komentarzu opisz krótko,
     * co ma robić ta aplikacja. Napisz 5 zmiennych, które będą Ci potrzebne w kodzie
     * tej aplikacji.
     * 5 Ćwiczenie
     * Napisz metodę, która przyjmuje jako argument promień koła i wyświetla na ekranie
     * wartość jego pola i obwodu (nic nie zwraca).
     * 1
     * 6 Cwiczenie
     * 6.1 Teoria
     * Metoda przedstawiona poniżej liczy wartość liczby (pierwszego argumentu) podniesionej
     * do potęgi (drugiego argumentu):
     * Math . pow( l i c zba , potega ) ;
     * Przekopiuj fragment kodu poniżej do funkcji main, uruchom program i zobacz co
     * zostanie wyświetlone na ekranie:
     * System . out . p r i n t l n (Math . pow( 2 , 4 ) ) ;
     * System . out . p r i n t l n (Math . pow( 3 , 2 ) ) ;
     * System . out . p r i n t l n (Math . pow( 5 , 1 ) ) ;
     * 6.2 Zadania
     * Do zadań wykorzystaj teorię z podpuktu 6.1
     * 6.2.1
     * Napisz metodę, która będzie przyjmowała jeden argument i zwróci ten argument
     * podniesiony do sześcianu
     * 6.2.2 dla chętnych
     * Wykorzystując metodę Math.pow napisz metodę, która policzy pierwiastek drugiego
     * stopnia
     **/


    //zad 1  Napisz metodę, która:
    //     • nic nie zwraca
    //     • przyjmuje jako argument wiek użytkownika
    //     • wyświetla wiek użytkownika na ekranie

    public class Ex1 {
        public static void main(String[] args) {
            printAge(5);
            printAge(10);
        }

        public static void printAge(int age) {
            System.out.println(age);
        }
    }


    // zad 2 * Napisz metodę, która:
    //     * • przyjmuje jako argument liczbę
    //     * • zwraca tę liczbę podniesioną do kwadratu
    public class Ex2 {
        public static void main(String[] args) {
            System.out.println(power(5));
            System.out.println(power(7));
        }

        public static double power(double number) {
            return number * number;
        }
    }


    // zad 3Napisz metodę, która:
    //     * • przyjmuje 3 liczby jako argumenty
    //     * • zwraca sumę tych trzech liczb
    public class Ex3 {
        public static void main(String[] args) {
            System.out.println(countThree(4, 7, 9));
            System.out.println(countThree(10.9, 201, 28));
        }

        public static double countThree(double first, double second, double third) {
            return first + second + third;
        }
    }


//zad 4Wymyśl aplikację, którą chciałabyś/chciałbyś stworzyć. W komentarzu opisz krótko,
//     * co ma robić ta aplikacja. Napisz 5 zmiennych, które będą Ci potrzebne w kodzie
//     * tej aplikacji.

    public class Ex4 {
        public static void main(String[] args) {
            //aplikacja do robienia notatek

            int numberOfNotes = 0;
            String username;
            String password;
            boolean isMenuActive = true;
            char pencilType = 'H'; //types available: H,F,B
        }
    }


// zad 5 Napisz metodę, która przyjmuje jako argument promień koła i wyświetla na ekranie
//     * wartość jego pola i obwodu (nic nie zwraca).

    public class Ex5 {
        public static void main(String[] args) {
            countCircle(5);
            countCircle(6.7);
        }

        public static void countCircle(double r) {
            System.out.println("Circuit: " + 2 * Math.PI * r); // mogliście zamiast Math.PI użyć też zaokrąglenia 3.14
            System.out.println("Area: " + Math.PI * r * r);
        }
    }


// zad 6 Cwiczenie
//     * 6.1 Teoria
//     * Metoda przedstawiona poniżej liczy wartość liczby (pierwszego argumentu) podniesionej
//     * do potęgi (drugiego argumentu):
//     * Math . pow( l i c zba , potega ) ;
//     * Przekopiuj fragment kodu poniżej do funkcji main, uruchom program i zobacz co
//     * zostanie wyświetlone na ekranie:
//     * System . out . p r i n t l n (Math . pow( 2 , 4 ) ) ;
//     * System . out . p r i n t l n (Math . pow( 3 , 2 ) ) ;
//     * System . out . p r i n t l n (Math . pow( 5 , 1 ) ) ;
//     * 6.2 Zadania
//     * Do zadań wykorzystaj teorię z podpuktu 6.1
//     * 6.2.1
//     * Napisz metodę, która będzie przyjmowała jeden argument i zwróci ten argument
//     * podniesiony do sześcianu
//     * 6.2.2 dla chętnych
//     * Wykorzystując metodę Math.pow napisz metodę, która policzy pierwiastek drugiego
//     * stopnia

    public class Ex6 {
        public static void main(String[] args) {
            System.out.println(cubePower(6));
            System.out.println(squareRoot(25));
        }

        public static double cubePower(double number) {
            return Math.pow(number, 3);
        }

        public static double squareRoot(double number) {
            return Math.pow(number, 0.5);
        }
    }

}









