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
        String[] listColor = new String[] { "black", "brown", "green", "blue", "grey" };
        String[] yesNo = new String[] { "yes", "no" };

        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input index eyeColor:");
        String eyeColor = listAnswer(listColor, iScanner);
        System.out.println("Input nickname:");
        String nickname = iScanner.next();
        System.out.println("Input breed:");
        String breed = iScanner.next();
        System.out.println("Input index vaccin:");
        String vaccin = listAnswer(yesNo, iScanner);
        System.out.println("Input index colorCoat:");
        String colorCoat = listAnswer(listColor, iScanner);
        LocalDate dateBirth = LocalDate.now();
        System.out.println("Input index  presenceWool:");
        String presenceWool = listAnswer(yesNo, iScanner);
        Animal cat = new Cat(heightSm, weightGramm, eyeColor, nickname,
                breed, vaccin, colorCoat, dateBirth, presenceWool);
        zoo.add(cat);
        return zoo;
    }

    public ArrayList<Animal> addNewDog(Scanner iScanner) {
        String[] listColor = new String[] { "black", "brown", "green", "blue", "grey" };
        String[] yesNo = new String[] { "yes", "no" };

        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input index eyeColor:");
        String eyeColor = listAnswer(listColor, iScanner);
        System.out.println("Input nickname:");
        String nickname = iScanner.next();
        System.out.println("Input breed:");
        String breed = iScanner.next();
        System.out.println("Input index vaccin:");
        String vaccin = listAnswer(yesNo, iScanner);
        System.out.println("Input index colorCoat:");
        String colorCoat = listAnswer(listColor, iScanner);
        LocalDate dateBirth = LocalDate.now();
        System.out.println("Input index training:");
        String training = listAnswer(yesNo, iScanner);
        Animal dog = new Dog(heightSm, weightGramm, eyeColor, nickname,
                breed, vaccin, colorCoat, dateBirth, training);
        zoo.add(dog);
        return zoo;
    }

    public ArrayList<Animal> addNewChicken(Scanner iScanner) {
        String[] listColor = new String[] { "black", "brown", "green", "blue", "grey" };

        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input index eyeColor:");
        String eyeColor = listAnswer(listColor, iScanner);
        System.out.println("Input flight altitude, cm:");
        int heightFlightSm = iScanner.nextInt();

        Animal chiken = new Chicken(heightSm, weightGramm, eyeColor, heightFlightSm);
        zoo.add(chiken);
        return zoo;
    }

    public ArrayList<Animal> addNewStork(Scanner iScanner) {
        String[] listColor = new String[] { "black", "brown", "green", "blue", "grey" };

        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input index eyeColor:");
        String eyeColor = listAnswer(listColor, iScanner);
        System.out.println("Input flight altitude, cm:");
        int heightFlightSm = iScanner.nextInt();

        Animal stork = new Stork(heightSm, weightGramm, eyeColor, heightFlightSm);
        zoo.add(stork);
        return zoo;
    }

    public ArrayList<Animal> addNewTiger(Scanner iScanner) {
        String[] listColor = new String[] { "black", "brown", "green", "blue", "grey" };

        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input index eyeColor:");
        String eyeColor = listAnswer(listColor, iScanner);
        System.out.println("Input habitat:");
        String habitat = iScanner.next();
        LocalDate dateFound = LocalDate.now();

        Animal tiger = new Tiger(heightSm, weightGramm, eyeColor, habitat, dateFound);
        zoo.add(tiger);
        return zoo;
    }

    public ArrayList<Animal> addNewWolf(Scanner iScanner) {
        String[] listColor = new String[] { "black", "brown", "green", "blue", "grey" };
        String[] yesNo = new String[] { "yes", "no" };

        System.out.println("Input heightSm:");
        int heightSm = iScanner.nextInt();
        System.out.println("Input weightGramm:");
        int weightGramm = iScanner.nextInt();
        System.out.println("Input index eyeColor:");
        String eyeColor = listAnswer(listColor, iScanner);
        System.out.println("Input habitat:");
        String habitat = iScanner.next();
        LocalDate dateFound = LocalDate.now();
        System.out.println("Input index leader of the pack:");
        String leaderPack = listAnswer(yesNo, iScanner);

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

    private String listAnswer(String[] array, Scanner iScanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\t%d. %s\n", i + 1, array[i]);
        }
        int num = iScanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (num - 1 == i)
                return array[i];
        }
        return "";
    }
}
