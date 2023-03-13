import java.util.Scanner;

public class Program {
    public static void getInfo(ListFigures figures){
        figures.sort(figures);
        for (Figure figure : figures) {
            System.out.printf(figure.getClass().getSimpleName() + ":\n");
            figure.printInfo();
            figure.printArea();
            if (figure instanceof Circumference)
                ((Circumference) figure).findCircumference();
            System.out.println();
        }
    } 

    public static void newFigure(Scanner iScanner, String typeClass, ListFigures figures) {
        if (!typeClass.isEmpty()) {
            if (typeClass.equals("Circle")) {
                figures.addNewCircle(iScanner);
            }
            
        } else
            System.out.println("The number is invalid!");
    }
}
