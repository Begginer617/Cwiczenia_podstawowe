package Zajecia_15_11_2021;

import java.util.Scanner;

public class Praca_domowa_webinar_3 {

    public static void main(String[] args) {

       /*
        1 Wrappery
        1.1 Ćwiczenie
        Napisz program, w którym przyjmiesz liczbę od użytkownika. Wykorzystując wrappery
        wyświetl użytkownikowi jego liczbę zaokrągloną w dół.
        1.2 Ćwiczenie - dla chętnych
        Napisz program w którym:
        • Zapytasz użytkownika o pierwszą liczbę i zapiszesz ją w zmiennej typu String
        • Zapytasz użytkownika o drugą liczbę i zapiszesz ją w drugiej zmiennej typu
        String
        • przekonwertujesz zmienne typu String na typ liczbowy i wyświetlisz użytkownikowi
        ich sumę
        2 Metody na zmiennej typu String
        2.1 Ćwiczenie
        Korzystając z metod dostępnych dla klasy String, przekonwertuj zmienną ’zmiennaTextowa’
        tak aby zawierała tylko duże litery. Wyświetl przekonwertowaną zmienną
        na ekranie.
        St r ing zmiennaTextowa = ” abc de f ghi ” ;
        2.2 Ćwiczenie - dla chętnych
        Napisz program, w którym:
        • Zapytasz użytkownika o dowolny tekst i zapiszesz go w zmiennej typu String
        • Zapytasz użytkownika o jeden dowolny znak i zapiszesz go w drugiej zmiennej
        typu char
        • poinformuj użytkownika, czy w podanym tekście znajduje się ten znak
        1
        3 Operatory
        3.1 Ćwiczenie
        Używając operatorów wyświetl na ekranie:
        • resztę z dzielenia 7089760 przez 11
        • informację, czy te dwie zmienne są sobie równe:
        i n t zmienna1 = 1 8 ;
        i n t zmienna2 = 1 9 ;
        • zmienną ’zmienna3’, którą wcześniej pomnóż przez 5;
        i n t zmienna3 = 18478475;
        3.2 Ćwiczenie - dla chętnych
        Rozpoczynasz tworzenie gry, w której celem jest przekomarzanie się z użytkownikiem.
                Jeśli użytkownik wpisze wartość ”true” wyświetl mu wartość ”false”. Jeśli
        wpisze ”false” wyświetl mu ”true”. W zadaniu wykorzystaj operator negacji */


        // zad 1.1
        // Napisz program, w którym przyjmiesz liczbę od użytkownika. Wykorzystując wrappery
        // wyświetl użytkownikowi jego liczbę zaokrągloną w dół.

        System.out.println("1 Wrappery");
        System.out.println("1.1 Ćwiczenie \n");
        System.out.println("Użytkowniku napisz proszę liczbę -> ");

        Scanner bamboDouble = new Scanner(System.in);

        Double userNumber1 = bamboDouble.nextDouble();
        Double userNumber2 = Math.floor(userNumber1);
        System.out.println("Twoja zaokraglona liczba to "+ userNumber2 );



        // zad 2
//        2 Metody na zmiennej typu String
//        2.1 Ćwiczenie
//        Korzystając z metod dostępnych dla klasy String, przekonwertuj zmienną ’zmiennaTextowa’
//        tak aby zawierała tylko duże litery. Wyświetl przekonwertowaną zmienną
//        na ekranie.
    }


//}
//
//
//public class zadanie_domowe_zajecia3 {
//    public static void main(String[] args) {
////        1 Wrappery
////        1.1 Ćwiczenie
////        Napisz program, w którym przyjmiesz liczbę od użytkownika. Wykorzystując wrap-
////        pery wyświetl użytkownikowi jego liczbę zaokrągloną w dół.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1 Wrappery");
//        System.out.println("1.1 Ćwiczenie");
//        System.out.print("Użytkowniku napisz liczbę z dwoma miejscami po przecinku -> ");
//        double userNumber = scanner.nextDouble();
//        System.out.println("Twoja liczba zaokrąglona w dół -> " + Math.floor(userNumber) + "\n");
//​
////        1.2 Ćwiczenie - dla chętnych
////        Napisz program w którym:
////        •Zapytasz użytkownika o pierwszą liczbę i zapiszesz ją w zmiennej typu String
////        •Zapytasz użytkownika o drugą liczbę i zapiszesz ją w drugiej zmiennej typu String
////        •przekonwertujesz zmienne typu String na typ liczbowy i wyświetlisz użytkow - nikowi ich sumę
//​
//        System.out.println("1.2 Ćwiczenie - dla chętnych");
//        System.out.print("Użytkowniku napisz pierwszą liczbę całkowitą -> ");
//        String firstNumber = scanner.next();
//        System.out.print("Użytkowniku napisz drugą liczbę całkowitą -> ");
//        String secondNumber = scanner.next();
//        System.out.print("Suma Twoich liczb to -> ");
//        System.out.println(Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber) + "\n");
//​
////        2 Metody na zmiennej typu String
////        2.1 Ćwiczenie
////        Korzystając z metod dostępnych dla klasy String, przekonwertuj zmienną ’zmiennaTextowa’ tak aby zawierała tylko duże litery.
////        Wyświetl przekonwertowaną zmienną na ekranie.
////        String zmiennaTextowa = ”abc def ghi ”;
//​
//        System.out.println("2 Metody na zmiennej typu String");
//        System.out.println("2.1 Ćwiczenie");
//        String zmiennaTextowa = "abc def ghi";
//        System.out.println("przekonwertuj zmienną ’zmiennaTextowa’-> \"abc def ghi\" tak, aby zawierała tylko duże litery -> " + zmiennaTextowa.toUpperCase() + "\n");
//​
////        2.2 Ćwiczenie - dla chętnych
////        Napisz program, w którym:
////        •Zapytasz użytkownika o dowolny tekst i zapiszesz go w zmiennej typu String
////        •Zapytasz użytkownika o jeden dowolny znak i zapiszesz go w drugiej zmiennej typu char
////        •poinformuj użytkownika, czy w podanym tekście znajduje się ten znak
//​
//        System.out.println("2.2 Ćwiczenie - dla chętnych");
//        System.out.print("Użytkowniku napisz dowolny tekst -> ");
//        String userAnyText = new Scanner(System.in).nextLine();
//        System.out.print("Użytkowniku podaj jedną dowlną literę -> ");
//​
//        if(userAnyText.contains(String.valueOf(scanner.next().charAt(0))))
//            System.out.println("Ta litera znajduje się w tym tekście \n");
//        else
//            System.out.println("Ta litera NIE znajduje się w tym tekście \n");
//​
////        3 Operatory
////        3.1 Ćwiczenie
////        Używając operatorów wyświetl na ekranie:
////        •resztę z dzielenia 7089760 przez 11
////        •informację, czy te dwie zmienne są sobie równe:
////        int zmienna1 = 18;
////        int zmienna2 = 19;
////        •zmienną ’zmienna3', którą wcześniej pomnóż przez 5;
////        int zmienna3 = 18478475;
//​
//        System.out.println("3 Operatory");
//        System.out.println("3.1 Ćwiczenie");
//        int zmienna1 = 18;
//        int zmienna2 = 19;
//        int zmienna3 = 18478475;
//        System.out.println("Reszta z dzielenia to -> " + 7089760%11);
//        System.out.println("Czy te zmienne są sobie równe -> " + (zmienna1 == zmienna2));
//        System.out.println("’zmienna3', pomnożona przez 5 -> " + zmienna3 * 5 + "\n");
//​
////        3.2 Ćwiczenie - dla chętnych
////        Rozpoczynasz tworzenie gry, w której celem jest przekomarzanie się z użytkownikiem. Jeśli użytkownik wpisze wartość ”true” wyświetl mu wartość ”false”. Jeśli
////        wpisze ”false” wyświetl mu ”true”. W zadaniu wykorzystaj operator negacji
//​
//        System.out.println("3.2 Ćwiczenie - dla chętnych");
//        System.out.print("Użytkowniku, czy używasz miecza do walki z orkiem? Napisz 'true' lub 'false' -> ");
//        boolean answer1 = scanner.nextBoolean();
//        if(!answer1)
//            System.out.println( !answer1 + "?! O_o Ja na Twoim miejscu użył bym zaklecia kuli ognia... ... .., ale Twoja sprawa. Także wiesz... giniesz");
//        else
//            System.out.println(!answer1 + "?! Wiesz, że zaklęcie rzuca się dużooo dłużej niż wyciąga ostry miecz?! Także wiesz... giniesz, jak by co");
//    }
//}
