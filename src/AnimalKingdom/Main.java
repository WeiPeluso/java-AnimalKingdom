package AnimalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Animal> filteredList=new ArrayList<>();

    public static void filterAnimal(List<Animal> animals, CheckAnimal tester){
        filteredList.clear();
        for(Animal v: animals) {
            if(tester.test(v)) {
                filteredList.add(v);
            }

        }

    }

    public static void main(String[] args){

        List<Animal> myList=new ArrayList<>();
        myList.add(new Mammal("Panda", 1869));
        myList.add(new Mammal("Zebra", 1778));
        myList.add(new Mammal("Koala", 1816));
        myList.add(new Mammal("Sloth", 1804));
        myList.add(new Mammal("Armadillo", 1758));
        myList.add(new Mammal("Raccoon", 1758));
        myList.add(new Mammal("Bigfoot",2021));
        myList.add(new Bird("Pigeon", 1837));
        myList.add(new Bird("Peacock", 1821));
        myList.add(new  Bird("Toucan", 1758));
        myList.add(new Bird("Parrot", 1824));
        myList.add(new Bird("Swan", 1758));
        myList.add(new Fish("Salmon",1758));
        myList.add(new Fish("Catfish", 1817));
        myList.add(new Fish("Perch", 1758));

//        List all the animals in descending order by year named
        System.out.println("*** List all the animals in descending order by year named ***");
        myList.sort((a1,a2)->a2.getYear() - a1.getYear());
        myList.forEach(a->System.out.println(a.toString()));

//        List all the animals alphabetically

        System.out.println("\n***List all the animals alphabetically***");
        myList.sort((a1,a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach(a->System.out.println(a.toString()));

//        List all the animals order by how they move
        System.out.println("\n***List all the animals order by how they move***");
        myList.sort((a1,a2)->a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach(a->System.out.println(a.toString()));

//        List only those animals the breath with lungs
        System.out.println("\n***List only those animals the breath with lungs***");
        filterAnimal(myList, a-> (a.breath()=="Lungs"));
        filteredList.forEach(a->System.out.println(a.getName() + " "
                + a.reproduce()+" " +a.move() +" "+ a.breath()+" "+ a.getYear()));


//        List only those animals that breath with lungs and were named in 1758
        System.out.println("\n***List only those animals that breath with lungs and were named in 1758***");
        filterAnimal(myList, a-> (a.breath()=="Lungs"&&a.getYear()==1758));
        filteredList.forEach(a->System.out.println(a.getName() + " "
                + a.reproduce()+" " +a.move() +" "+ a.breath()+" "+ a.getYear()));

//        List only those animals that lay eggs and breath with lungs

        System.out.println("\n*** List only those animals that lay eggs and breath with lungs***");
        filterAnimal(myList, a-> (a.breath()=="Lungs"&&a.reproduce().equals("Eggs")));
        filteredList.forEach(a->System.out.println(a.getName() + " "
                + a.reproduce()+" " +a.move() +" "+ a.breath()+" "+ a.getYear()));


//        List alphabetically only those animals that were named in 1758
        System.out.println("\n*** List alphabetically only those animals that were named in 1758");
        filterAnimal(myList, a-> (a.getYear()==1758));
        filteredList.sort((a1,a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach(a->System.out.println(a.getName() + " "
                + a.reproduce()+" " +a.move() +" "+ a.breath()+" "+ a.getYear()));

//        Stretch Goal
//        For the list of animals, list alphabetically those animals that are mammals.
        System.out.println("\n****For the list of animals, list alphabetically those animals that are mammals.");
        filterAnimal(myList, a-> (a.reproduce().equals("Live Births")));
        filteredList.sort((a1,a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach(a->System.out.println(a.getName() + " "
                + a.reproduce()+" " +a.move() +" "+ a.breath()+" "+ a.getYear()));

    }
}
