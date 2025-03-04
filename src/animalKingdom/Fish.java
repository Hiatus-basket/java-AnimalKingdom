package animalKingdom;

public class Fish extends Animal {
    public Fish(String name, int year){
        super(name, year);
    }

    @Override
    public String move(){
        return "Swim";
    }

    @Override
    public String breathe(){
        return "Gills";
    }

    @Override
    public String reproduce(){
        return "Eggs";
    }

    @Override
    public String toString(){
        return "\nId: " + id + " Fish: " + name + " Year Named: " + year;
    }
}