import java.util.ArrayList;

public class Program {

    public static void printInfo(Animal animal) {
        System.out.printf(animal.getClass().getSimpleName());
        System.out.println(animal.printInfo());
    }


    public static void getInfo(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.printf(animal.getClass().getSimpleName());
            System.out.println(animal.printInfo());
            
            if (animal instanceof MakeSound)
                ((MakeSound) animal).makeSound();
            if (animal instanceof Train)
                ((Train) animal).train();
            if (animal instanceof ShowAffection)
                ((ShowAffection) animal).showAffection();
            if (animal instanceof Fly) 
                ((Fly)animal).fly();
        
            System.out.println();
        }
    }

}
