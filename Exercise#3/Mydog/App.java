package Mydog;
public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        
        Cockapoo myPet = new Cockapoo();
        
        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
    }
}