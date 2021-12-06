package pl.testuj.oop;

public class Dog extends Animal implements Petable, Runnable {

    public Dog() {
        System.out.println("Konstruktor klasy Dog");
    }

    public void testDog() {

    }

    @Override
    public void useVoice() {
        System.out.println("Woof");
    }

    @Override
    public int getAge(int x) {
        return 0;
    }

    @Override
    public void pet() {
        System.out.println("Dog - pet");
    }

    @Override
    public void run() {

    }
}
