package pl.testuj.oop;



// klasa abstrakcyna sluzy kako szablon z metodami ktore

public abstract class Animal {
    private static final int NUMBER_OF_ANIMALS = 2; // stała czyli nie można zmienić wartości bo jest klasa abstrakcyjna
    private String name;
    private int dupa = 101;

    public Animal() {
        System.out.println("Konstruktor klasy Animal");
    }


    // metoda abstrakcyjna - bez implementacji, implementacja będzie klasach pochodnych, metoda abstrakcykna nie moze byc statyczna
    public abstract void useVoice();

    public abstract void useSuperPowers();

    public abstract int getAge(int x);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDupa() {
        return dupa = 12;
    }

    public void setDupa(int dupa) {
        this.dupa = dupa;
        System.out.println(dupa);
    }
}
