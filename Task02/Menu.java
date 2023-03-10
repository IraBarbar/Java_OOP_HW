import java.util.Scanner;

public class Menu {

    public static void printMenu() {
        System.out.printf("\t\tMenu:\n" +
                "\t\t1. Add an animal to the zoo.\n" +
                "\t\t2. Remove an animal from the zoo.\n" +
                "\t\t3. View information about the animal.\n" +
                "\t\t4. Make an animal make a sound.\n" +
                "\t\t5. Print information about the animals.\n" +
                "\t\t6. Make all the animals currently in the zoo make a sound.\n" +
                "\t\t7. Exit.\n");
    }

    public static int numMenu(Scanner iScanner) {
        printMenu();
        String num = iScanner.next();
        if (isDigit(num)) {
            if (Integer.parseInt(num) > 0)
                return Integer.parseInt(num);
            else {
                System.out.println("Invalid number!");
                numMenu(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            numMenu(iScanner);
        }
        return 10;
    }

    public static void getMenu(Scanner iScanner, Zoo animals, String[] arr) {
        int num = numMenu(iScanner);
        switch (num) {
            case 1:
                Program.newAnimal(iScanner, addClass(arr, iScanner), animals);
                getMenu(iScanner, animals, arr);
                break;
            case 2:
                Program.delAnimal(iScanner, animals);
                getMenu(iScanner, animals, arr);
                break;
            case 3:
                Program.printInfoOne(animals, addClass(arr, iScanner));
                getMenu(iScanner, animals, arr);
                break;
            case 4:
                Program.printMakeSoundOne(animals, addClass(arr, iScanner));
                getMenu(iScanner, animals, arr);
                break;
            case 5:
                Program.printInfo(animals);
                getMenu(iScanner, animals, arr);
                break;
            case 6:
                Program.printMakeSoundAll(animals);
                getMenu(iScanner, animals, arr);
                break;
            case 7:
                break;
            default:
                getMenu(iScanner, animals, arr);
                break;
        }

    }

    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String addClass(String[] array, Scanner iScanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d. %s\n", i + 1, array[i]);
        }
        int num = iScanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (num - 1 == i)
                return array[i];
        }
        return "";
    }
}
