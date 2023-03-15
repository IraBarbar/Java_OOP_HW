
import java.util.Scanner;

public class Program {
    public static void getInfo(ListFigures figures) {
        for (Figure figure : figures) {
            System.out.printf(figure.getClass().getSimpleName() + ":\n");
            figure.printInfo();
            figure.printArea();
            if (figure instanceof Circumference)
                ((Circumference) figure).printCircumference();
            if (figure instanceof Perimeter)
                ((Perimeter) figure).printPerimeter();
            System.out.println();
        }
    }

    public static void newFigure(Scanner iScanner, String typeClass, ListFigures figures) {
        if (!typeClass.isEmpty()) {
            if (typeClass.equals("Circle")) {
                figures.addNewCircle(iScanner);
            }
            if (typeClass.equals("Triangle")) {
                figures.addNewTriangle(iScanner);
            }
            if (typeClass.equals("Rectangle")) {
                figures.addNewRectangle(iScanner);
            }
            if (typeClass.equals("Square")) {
                figures.addNewSquare(iScanner);
            }
        } else
            System.out.println("The number is invalid!");
    }

    public static void sortArea(ListFigures figures) {
        figures.sort();
        for (Figure figure : figures) {
            System.out.printf(figure.getClass().getSimpleName() + ":\n");
            figure.printArea();
            figure.printInfo();
            if (figure instanceof Circumference)
                ((Circumference) figure).printCircumference();
            if (figure instanceof Perimeter)
                ((Perimeter) figure).printPerimeter();
            System.out.println();
        }
    }

    public static void delFigure(Scanner iScanner, ListFigures figures) {
        printInfo(figures);
        System.out.println("Enter the index of the figure to be removed:  ");
        int i = iScanner.nextInt();
        figures.delFigure(i - 1);
    }

    private static void printInfo(ListFigures figures) {
        for (Figure figure : figures) {
            System.out.printf("Index: ");
            System.out.println(++figures.index);
            System.out.printf(figure.getClass().getSimpleName() + ":\n");
            figure.printInfo();
            figure.printArea();
            if (figure instanceof Circumference)
                ((Circumference) figure).findCircumference();
            System.out.println();
        }
        figures.index = 0;
    }

    private static void printInfoOne(ListFigures figures,  String typeClass) {
        for (Figure figure : figures) {
            ++figures.index;
            if (figure.getClass().getSimpleName().equals(typeClass)) {
                System.out.printf("Index: ");
                System.out.println(figures.index);
                System.out.printf(figure.getClass().getSimpleName() + ":\n");

                figure.printInfo();
                figure.printArea();
                if (figure instanceof Circumference)
                    ((Circumference) figure).findCircumference();
                System.out.println();
            }
        }
        figures.index = 0;
    }

    public static void changeFigure(Scanner iScanner, String typeClass, ListFigures figures) {
        printInfoOne(figures, typeClass);
        System.out.println("Enter the index of the figure to be modified:  ");
        int i = iScanner.nextInt();
        if (typeClass.equals("Circle")) {
            figures.modifiedCircle(i - 1, iScanner);
        }
        if (typeClass.equals("Triangle")) {
            figures.modifiedTriangle(i - 1, iScanner);
        }
        if (typeClass.equals("Rectangle")) {
            figures.modifiedRectangle(i - 1, iScanner);
        }
        if (typeClass.equals("Square")) {
            figures.modifiedSquare(i - 1, iScanner);
        }
    }
}
