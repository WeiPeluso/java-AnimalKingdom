package AnimalKingdom;

public class Mammal extends Animal {


    public Mammal(String name, int year) {
        super(name, year);
    }

    @Override
    String move() {
        return "Walk";
    }

    @Override
    String breath() {
        return "Lungs";
    }

    @Override
    String reproduce() {
        return "Live Births";
    }

}
