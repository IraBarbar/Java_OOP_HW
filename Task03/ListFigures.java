import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ListFigures implements Iterable<Figure> {

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

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
            }
        } else {
            System.out.println("Invalid number!");
        }
        return figures;
    }

    public ArrayList<Figure> modifiedCircle(int index, Scanner iScanner) {
        System.out.println("Input radius in cm:");
        String radiusCm = iScanner.next();
        if (isDigit(radiusCm)) {
            if (Double.parseDouble(radiusCm) > 0) {
                Figure circle = new Circle(Double.parseDouble(radiusCm));
                figures.set(index, circle);
            }
            else {
                System.out.println("Invalid number!");
            }
        } else {
            System.out.println("Invalid number!");
        }
        return figures;
    }



    public void sort() {
        figures.sort(Comparator.comparingInt(o -> o.findArea()));
    }

    public ArrayList<Figure> delFigure(int index) {
        figures.remove(index);
        return figures;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public int getIndex() {
        return index;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
