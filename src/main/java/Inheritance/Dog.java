package Inheritance;



public class Dog extends Animal {

    private String name = "Spider";

    public String dogDetails() {
        return name + " has " + getNoOfLegs() + " legs";
    }
}

