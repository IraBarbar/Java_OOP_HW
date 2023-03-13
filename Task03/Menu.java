import java.util.Scanner;

public class Menu {
    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void getMenu(Scanner iScanner, ListFigures figures, String[] arr) {
        int num = numMenu(iScanner);
        switch (num) {
            case 1:
                Program.getInfo(figures);
                getMenu(iScanner, figures, arr);
                break;
            case 2:
                Program.newFigure(iScanner, addClass(arr, iScanner), figures);
                getMenu(iScanner, figures, arr);
                break;
            case 3:
                
                getMenu(iScanner, figures, arr);
                break;
            case 4:
                
                getMenu(iScanner, figures, arr);
                break;
            case 5:
                
                getMenu(iScanner, figures, arr);
                break;
            case 6:
               
                getMenu(iScanner, figures, arr);
                break;
            case 7:
                break;
            default:
                getMenu(iScanner, figures, arr);
                break;
        }

    }

    private static void printMenu() {
        System.out.printf("\t\tMenu:\n" +
                "\t\t1. Print information about the figures.\n" +
                "\t\t2. Add a figure to the list of the figures.\n" +
                "\t\t3. Remove an animal from the list of the figures.\n" +
                "\t\t4. Change shape parameters by index.\n" +
                "\t\t5. Sort by area. Information output.\n" +
                "\t\t6. Make all the animals currently in the zoo make a sound.\n" +
                "\t\t7. Exit.\n");
    }
    private static int numMenu(Scanner iScanner) {
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
