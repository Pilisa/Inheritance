package Inheritance;



public class Cat extends Animal {
    private String name= "Kitty",sound ="Meow!";

    public String catDetails(){

        return name+" has "+getNoOfLegs()+" legs "+"and makes "+sound+" sound";
    }

}

