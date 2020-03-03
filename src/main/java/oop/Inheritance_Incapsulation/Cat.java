package oop.Inheritance_Incapsulation;

public class Cat extends Animal {
    String name= "Kitty",sound ="Meow!";

    public String catDetails(){
        return name+" has "+noOfLegs+" legs "+"and makes "+sound+" sound";
    }

}
