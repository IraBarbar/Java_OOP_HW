
import java.util.Scanner;

public class main {
  
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        String[] nameClass = new String[] {"Circle", "Triangle", "Rectangle", "Square"};
        ListFigures  figures = new ListFigures();
        
        Figure circle01 = new Circle(15);
        Figure circle02 = new Circle(10);
        Figure circle03 = new Circle(12);
        
        Figure triangle01 = new Triangle(10,11,15);
        figures.add(triangle01);
        figures.add(circle01);
        figures.add(circle02);
        figures.add(circle03);

        Figure rectangle01 = new Rectangle(9, 8);
        figures.add(rectangle01);

        Figure square01 = new Square(15);
        figures.add(square01);


        Menu.getMenu(iScanner, figures, nameClass);

        iScanner.close();
    }
}
