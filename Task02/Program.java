import java.lang.reflect.Type;
import java.util.Scanner;

public class Program {

    public static void printInfo(Zoo animals) {
        for (Animal animal : animals) {
            System.out.printf("Index: ");
            System.out.println(++animals.index);
            System.out.printf(animal.getClass().getSimpleName());
            System.out.println(animal.printInfo());
        }
        animals.index = 0;
    }

    public static void getInfo(Zoo animals) {
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
                ((Fly) animal).fly();

            System.out.println();
        }
    }

    public static void newAnimal(Scanner iScanner, String typeClass, Zoo animal) {
        if (!typeClass.isEmpty()) {
            if (typeClass.equals("Cat")) {
                animal.addNewCat(iScanner);
            }
            if (typeClass.equals("Dog")) {
                animal.addNewDog(iScanner);
            }
            if (typeClass.equals("Chicken")) {
                animal.addNewChicken(iScanner);
            }
            if (typeClass.equals("Stork")) {
                animal.addNewStork(iScanner);
            }
            if (typeClass.equals("Tiger")) {
                animal.addNewTiger(iScanner);
            }
            if (typeClass.equals("Wolf")) {
                animal.addNewWolf(iScanner);
            }
        } else
            System.out.println("Numer is invalid!");
    }

    public static void delAnimal(Scanner iScanner, Zoo animal) {
        printInfo(animal);
        System.out.println("Enter the index of the animal to be removed:  ");
        int i = iScanner.nextInt();
        animal.delAnimal(i - 1);
    }

    public static void printInfoOne(Zoo animals, String typeClass) {
        for (Animal animal : animals) {
            if (animal.getClass().getSimpleName().equals(typeClass)) {
                System.out.printf(animal.getClass().getSimpleName());
                System.out.println(animal.printInfo());
            }
        }

    }

    public static void printMakeSoundOne(Zoo animals, String typeClass) {
        for (Animal animal : animals) {
            if (animal.getClass().getSimpleName().equals(typeClass)) {
                System.out.printf(animal.getClass().getSimpleName());
                System.out.printf(": ");
                animal.makeSound();
            }
        }
    }

    public static void printMakeSoundAll(Zoo animals) {
        for (Animal animal : animals) {
            System.out.printf(animal.getClass().getSimpleName());
            System.out.printf(": ");
            animal.makeSound();
        }
    }
}
