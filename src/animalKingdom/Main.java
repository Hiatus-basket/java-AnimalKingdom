package animalKingdom;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static List<Animal> filteredList = new ArrayList<>();

    public static void filterAnimal(List<Animal> animals, CheckAnimal tester){
        filteredList.clear();

        for(Animal a : animals){
            if (tester.test(a)){
                filteredList.add(a);
            }
        }
    }
    public static void main(String[] args){
        // Mammals
        Mammal panda = new Mammal("Panda", 1896);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Racoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(Perch);

        System.out.println(animalList);

        System.out.println("\n*** Descending order by Year ***");
        animalList.sort((a, b) -> Integer.compare(a.getYear(), b.getYear()));
        System.out.println(animalList);

        System.out.println("\n*** alphabetically ***");
        animalList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println(animalList);

        System.out.println("\n*** by movement ***");
        animalList.sort((a,b) -> a.move().compareToIgnoreCase(b.move()));
        System.out.println(animalList);

        System.out.println("\n*** breathe with lungs ***");
        filterAnimal(animalList, a -> a.breathe() == "Lungs");
        for(int i = 0; i < filteredList.size(); i++){
            System.out.println(filteredList.get(i).getName() + " " +
            filteredList.get(i).reproduce() + " " + filteredList.get(i).breathe() +
            " " + filteredList.get(i).getYear());
        }
        // System.out.println(filteredList);

        System.out.println("\n*** breathe with lungs and named in 1758 ***");
        filterAnimal(animalList, a -> a.breathe() == "Lungs" && a.getYear() == 1758);
        for(int i = 0; i < filteredList.size(); i++){
            System.out.println(filteredList.get(i).getName() + " " +
            filteredList.get(i).reproduce() + " " + filteredList.get(i).breathe() +
            " " + filteredList.get(i).getYear());
        }
        // System.out.println(filteredList);

        System.out.println("\n*** breathe with lungs and lay eggs ***");
        filterAnimal(animalList, a -> a.breathe() == "Lungs" && a.reproduce() == "Eggs");
        for(int i = 0; i < filteredList.size(); i++){
            System.out.println(filteredList.get(i).getName() + " " +
            filteredList.get(i).reproduce() + " " + filteredList.get(i).breathe() +
            " " + filteredList.get(i).getYear());
        }
        // System.out.println(filteredList);

        System.out.println("\n*** Named in 1758 listed alphebetically ***");
        filterAnimal(animalList, a -> a.getYear() == 1758);
        filteredList.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        for(int i = 0; i < filteredList.size(); i++){
            System.out.println(filteredList.get(i).getName() + " " +
            filteredList.get(i).reproduce() + " " + filteredList.get(i).breathe() +
            " " + filteredList.get(i).getYear());
        }
        // System.out.println(filteredList);
    }
}