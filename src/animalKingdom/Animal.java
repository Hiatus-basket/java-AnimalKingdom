package animalKingdom;

abstract class Animal {
    // fields
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year; 

    // constructor
    public Animal(String name, int year){
        this.id = maxId++;
        this.name = name;
        this.year = year;
    }

    protected String eat(){
        return this.name + " ate food!";
    };

    abstract String move();
    abstract String breathe();
    abstract String reproduce();
}