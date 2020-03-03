package Inheritance;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInheritance {

    @Test
    public  void testDogDetails(){
        Dog dog = new Dog();
        //dog.dogDetails();
        //String results = dog.dogDetails();
        assertEquals("Spider has 4 legs", dog.dogDetails());
    }
    @Test
    public void testCatDetails(){
        Cat cat = new Cat();
        //cat.catDetails();
        assertEquals("Kitty has 4 legs and makes Meow! sound",cat.catDetails());
    }
}
