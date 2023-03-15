
import java.util.Scanner;

public class Program {
    public static void getInfo(ListFigures figures){       
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
                figures.addNewCircle(iScanner);
            }
            if (typeClass.equals("Square")) {
                figures.addNewCircle(iScanner);
            }          
        } else
            System.out.println("The number is invalid!");
    }

    public static void sortArea(ListFigures figures){
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

    public static void printInfo(ListFigures figures){       
        for (Figure figure : figures) {
            System.out.printf(figure.getClass().getSimpleName() + ":\n");
            System.out.printf("Index: ");
            System.out.println(++figures.index);
            figure.printInfo();
            figure.printArea();
            if (figure instanceof Circumference)
                ((Circumference) figure).findCircumference();
            System.out.println();
        }
    } 

    public static void changeFigure(Scanner iScanner, String typeClass, ListFigures figures) {
        printInfo(figures);
        System.out.println("Enter the index of the figure to be modified:  ");
        int i = iScanner.nextInt();
        if(typeClass.equals("Circle")) {
            figures.modifiedCircle(i - 1, iScanner);
        }
    }
}
