import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListFigures implements Iterable<Figure> {
    
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    ArrayList<Figure> figures;

    int index = 0;

    /**
     * 
     * @param figures
     * @param index
     */
    public ListFigures() {
        figures = new ArrayList<>();
        index = 0;
    }

    @Override
    public Iterator<Figure> iterator() {

        Iterator<Figure> it = new Iterator<Figure>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < figures.size();
            }

            @Override
            public Figure next() {
                return figures.get(index++);
            }

        };
        return it;
    }

    public void add(Figure fig) {
        figures.add(fig);
    }

    public ArrayList<Figure> addNewCircle(Scanner iScanner) {

        System.out.println("Input radius in cm:");
        String radiusCm = iScanner.next();
        if (isDigit(radiusCm)) {
            if (Double.parseDouble(radiusCm) > 0) {
                Figure circle = new Circle(Double.parseDouble(radiusCm));
                figures.add(circle);
            } else {
                System.out.println("Invalid number!");
                // addNewCircle(iScanner);
            }
        } else {
            System.out.println("Invalid number!");
            // addNewCircle(iScanner);
        }
        return figures;
    }
    
    public void sort(ListFigures as) {
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
