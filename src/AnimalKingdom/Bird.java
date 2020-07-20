package AnimalKingdom;

public class Bird extends Animal {

    public Bird(String name, int year) {
        super(name, year);
    }

    @Override
    String move() {
        return "Fly";
    }

    @Override
    String breath() {
        return "Lungs";
    }

    @Override
    String reproduce() {
        return "Eggs";
    }
}
