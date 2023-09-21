package pl.testuj.oop;

/*
Klasa abstrakcyjna może dziedziczyć tylko jedną klasę,
ale może za to dziedziczyć dowolną liczbę interfejsów.
Interfejs nie może dziedziczyć klas, może za to dziedziczyć dowolną liczbę interfejsów.
Klasa abstrakcyjna może zawierać metody abstrakcyjne jak i zywkłe. Może także nie zawierać żadnych.

 */

public interface Petable {
    void pet();

    default void printMsg() {
        System.out.println("Domyślna implementacja");
    }
}
