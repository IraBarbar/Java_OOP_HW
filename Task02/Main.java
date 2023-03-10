import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        Zoo animals = new Zoo();
        String[] listClasses = new String[] {"Cat", "Dog", "Tiger", "Wolf", "Chicken", "Stork"};
        
        Animal cat01 = new Cat(0, 15000, null, null, null, "yes", null, null, null);
        animals.add(cat01);

        Animal dog01 = new Dog(100, 20000, "brawn", "Bobik", "oucharka", "yes", "black", LocalDate.of(2020, 12, 20),
                "yes");
        animals.add(dog01);

        Animal tigr01 = new Tiger(90, 105000, "brawn", "Africa", LocalDate.of(2018, 01, 07));
        animals.add(tigr01);

        Animal wolf01 = new Wolf(95, 75000, "black", "Asia", LocalDate.of(2017, 10, 10), "no");
        animals.add(wolf01);

        Animal chicken01 = new Chicken(45, 4000, "black", 150);
        animals.add(chicken01);

        Animal stork01 = new Stork(101, 8000, "black", 100000);
        animals.add(stork01);
        
        Menu.getMenu(iScanner, animals, listClasses);
               
        iScanner.close();
    }
}
