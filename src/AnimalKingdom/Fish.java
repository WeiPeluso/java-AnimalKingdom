package AnimalKingdom;

public class Fish extends Animal {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    String move() {
        return "Swim";
    }

    @Override
    String breath() {
        return "Gills";
    }

    @Override
    String reproduce() {
        return "Eggs";
    }
}
