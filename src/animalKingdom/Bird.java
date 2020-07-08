package animalKingdom;

public class Bird extends Animal {
    public Bird(String name, int year){
        super(name, year);
    }

    @Override
    public String move(){
        return "Fly";
    }

    @Override
    public String reproduce(){
        return "Eggs";
    }

    @Override
    public String breathe(){
        return "Lungs";
    }

    @Override
    public String toString(){
        return "\nId: " + id + " Bird: " + name + " Year Named: " + year;
    }
}