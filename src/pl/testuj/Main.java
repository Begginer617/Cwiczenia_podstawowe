package pl.testuj;

import pl.testuj.oop.Animal;
import pl.testuj.oop.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SubClass subClass = new SubClass("Wojtek");

        subClass.message();
//        System.out.println(University.PI);

        ArrayList<Integer> list10 = new ArrayList<Integer>(); // deklaracja i inicjalizacja pustej listy
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Tokyo", "London", "New York")); // Deklaracja i inicjalizacja listy z dodaniem elementow
        ArrayList<Integer> list = new ArrayList<Integer>(); // dododanie nowego elementu do listy
        list.add(1);
        System.out.println(list10 + "wystwetlenie pustej listy");
        System.out.println(list + "dodanie nowego elementu");

        int[] tablaca1 = new int[10];
        String[] tablica2 = {"Sraka", "Ptaka"};


//
//        Dog pies = new Dog();
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());
////
//        Dog pies2 = new Dog();
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());
//        System.out.println("Wartość pola statycznego count: " + Dog.getNumCount());

//        Petable petable = new Dog();
//        petable.pet();
//        petable.printMsg();
//
//
//        // klasa Animal jest abstrakcyjna, więc nie mogę stworzyć jej instancji
////	    Animal animal = new Animal();
//
//        University university = new University();
//        university.name = "Politechnika";
//
//        HighSchool highSchool = new HighSchool();
//        highSchool.name = "";
//
//        Dog dog = new Dog();
//        dog.testDog();
//        Cat cat = new Cat();
//
//        Animal animalDog = new Dog();
//        Animal animalCat = new Cat();
//
//        animalDog.useVoice();
//        animalCat.useVoice();
//
//        Dog[] dogs = new Dog[2];
//        Cat[] cats = new Cat[2];
//
//        Animal[] animals = new Animal[5];
//        animals[0] = dog;
//        animals[1] = animalDog;
//        animals[2] = cat;
//        animals[3] = animalCat;
//        animals[4] = new Elephant();
//
//        for (int i = 0; i < animals.length; i++) {
//            voice(animals[i]);
//        }
    }

    public static void voice(Animal animal) {
        animal.useVoice();
    }

//    public static void voiceDog(Dog dog) {
//        dog.useVoice();
//    }
//
//    public static void voiceCat(Cat cat) {
//        cat.useVoice();
//    }
}
