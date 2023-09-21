package pl.testuj.oop;

public class Dog extends Animal implements Petable, Runnable {

    private static int count = 0;

    public Dog() {
        count++;
        System.out.println("Konstruktor klasy Dog");
    }

    public void testDog() {

    }

    public static int getNumCount() {
        return count;
    }

    @Override
    public void useVoice() {
        System.out.println("Woof");
    }

    @Override
    public void useSuperPowers() {

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

    @Override
    public void setDupa(int dupa) {
        super.setDupa(dupa);
    }
}
