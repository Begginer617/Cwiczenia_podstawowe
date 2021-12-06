package pl.testuj;

import pl.testuj.access.HighSchool;
import pl.testuj.access.University;
import pl.testuj.oop.Animal;
import pl.testuj.oop.Cat;
import pl.testuj.oop.Dog;
import pl.testuj.oop.Elephant;

public class Main {

    public static void main(String[] args) {
        // klasa Animal jest abstrakcyjna, więc nie mogę stworzyć jej instancji
//	    Animal animal = new Animal();

        University university = new University();
        university.name = "Politechnika";

        HighSchool highSchool = new HighSchool();
        highSchool.name = "";

        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

        animalDog.useVoice();
        animalCat.useVoice();

        Dog[] dogs = new Dog[2];
        Cat[] cats = new Cat[2];

        Animal[] animals = new Animal[5];
        animals[0] = dog;
        animals[1] = animalDog;
        animals[2] = cat;
        animals[3] = animalCat;
        animals[4] = new Elephant();

        for (int i = 0; i < animals.length; i++) {
            voice(animals[i]);
        }
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
