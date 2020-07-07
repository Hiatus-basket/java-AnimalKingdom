package animalKingdom;

abstract class Animal {
    // fields
    protected int maxId = 0;

    protected int id;
    protected String name;
    protected int year; 

    // constructor
    public Animal(String name, int year){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }

    // void String eat(){
    //     return name + " ate food!";
    // };
}