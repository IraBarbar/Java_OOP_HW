import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Zoo implements Iterable<Animal> {

    ArrayList<Animal> zoo;
    int index;

    public Zoo() {
        zoo = new ArrayList<>();
        index = 0;
    }

    /**
     * @param iScanner
     * @return
     */
    public ArrayList<Animal> addNewCat(Scanner iScanner) {
        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input eyeColor:");
        String eyeColor = iScanner.next();
        System.out.println("Input nickname:");
        String nickname = iScanner.next();
        System.out.println("Input breed:");
        String breed = iScanner.next();
        System.out.println("Input vaccin:");
        String vaccin = iScanner.next();
        System.out.println("Input colorCoat:");
        String colorCoat = iScanner.next();
        LocalDate dateBirth = LocalDate.now();
        System.out.println("Input presenceWool:");
        String presenceWool = iScanner.next();
        Animal cat = new Cat(heightSm, weightGramm, eyeColor, nickname,
                breed, vaccin, colorCoat, dateBirth, presenceWool);
        zoo.add(cat);
        return zoo;
    }

    public ArrayList<Animal> addNewDog(Scanner iScanner) {
        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input eyeColor:");
        String eyeColor = iScanner.next();
        System.out.println("Input nickname:");
        String nickname = iScanner.next();
        System.out.println("Input breed:");
        String breed = iScanner.next();
        System.out.println("Input vaccin:");
        String vaccin = iScanner.next();
        System.out.println("Input colorCoat:");
        String colorCoat = iScanner.next();
        LocalDate dateBirth = LocalDate.now();
        System.out.println("Input training:");
        String training = iScanner.next();
        Animal dog = new Dog(heightSm, weightGramm, eyeColor, nickname,
                breed, vaccin, colorCoat, dateBirth, training);
        zoo.add(dog);
        return zoo;
    }

    public ArrayList<Animal> addNewChicken(Scanner iScanner) {
        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input eyeColor:");
        String eyeColor = iScanner.next();
        System.out.println("Input flight altitude, cm:");
        int heightFlightSm = iScanner.nextInt();

        Animal chiken = new Chicken(heightSm, weightGramm, eyeColor, heightFlightSm);
        zoo.add(chiken);
        return zoo;
    }

    public ArrayList<Animal> addNewStork(Scanner iScanner) {
        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input eyeColor:");
        String eyeColor = iScanner.next();
        System.out.println("Input flight altitude, cm:");
        int heightFlightSm = iScanner.nextInt();

        Animal stork = new Stork(heightSm, weightGramm, eyeColor, heightFlightSm);
        zoo.add(stork);
        return zoo;
    }

    public ArrayList<Animal> addNewTiger(Scanner iScanner) {
        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input eyeColor:");
        String eyeColor = iScanner.next();
        System.out.println("Input habitat:");
        String habitat = iScanner.next();
        LocalDate dateFound = LocalDate.now();

        Animal tiger = new Tiger(heightSm, weightGramm, eyeColor, habitat, dateFound);
        zoo.add(tiger);
        return zoo;
    }

    public ArrayList<Animal> addNewWolf(Scanner iScanner) {
        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input eyeColor:");
        String eyeColor = iScanner.next();
        System.out.println("Input habitat:");
        String habitat = iScanner.next();
        LocalDate dateFound = LocalDate.now();
        System.out.println("Input leader of the pack:");
        String leaderPack = iScanner.next();

        Animal wolf = new Wolf(heightSm, weightGramm, eyeColor,
                habitat, dateFound, leaderPack);
        zoo.add(wolf);
        return zoo;
    }

    public ArrayList<Animal> delAnimal(int index) {
        zoo.remove(index);
        return zoo;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public void add(Animal an) {
        zoo.add(an);
    }

    @Override
    public Iterator<Animal> iterator() {

        Iterator<Animal> it = new Iterator<Animal>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < zoo.size();
            }

            @Override
            public Animal next() {
                return zoo.get(index++);
            }

        };
        return it;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
