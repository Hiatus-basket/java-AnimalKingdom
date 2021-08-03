package animalKingdom;

public class Mammal extends Animal{
    public Mammal(String name, int year){
        super(name, year);
    }

    @Override
    public String breathe(){
        return "Lungs";
    }

    @Override
    public String reproduce(){
        return "Live Birth";
    }

    @Override
    public String move(){
        return "Walk";
    }

    @Override
    public String toString(){
        return "\nId: " + id + " Mammal: " + name + " Year Named: " + year;
    }
}