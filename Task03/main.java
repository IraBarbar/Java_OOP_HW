import java.util.Scanner;

public class main {
  
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        String[] nameClass = new String[] {"Circle"};

        ListFigures figures = new ListFigures();
        
        Figure circle01 = new Circle(15.0);
        Figure circle02 = new Circle(10.0);
        figures.add(circle01);
        figures.add(circle02);

        Menu.getMenu(iScanner, figures, nameClass);

        iScanner.close();
    }
}
