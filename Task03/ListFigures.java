import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ListFigures implements Iterable<Figure> {

    ArrayList<Figure> figures;
    int index;

    /**
     * 
     * @param figures
     * @param index
     */
    public ListFigures() {

        figures = new ArrayList<>();
        index = 0;
    }

    private boolean isDigit(String s) throws NumberFormatException {
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

        System.out.println("Input radius in cm: ");
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

    public ArrayList<Figure> addNewTriangle(Scanner iScanner) {
        String[] letters = new String[] { "a", "b", "c" };
        int[] side = new int[3];
        int i = 0;
        for (String letter : letters) {
            System.out.printf("Input side %s in cm: ", letter);
            String temp = iScanner.next();
            if (Menu.isDigit(temp)) {
                if (Integer.parseInt(temp) > 0)
                    side[i++] = Integer.parseInt(temp);
            } else
                System.out.println("The number is invalid!");
        }
        Figure triangle = new Triangle(side[0], side[1], side[2]);
        if (triangle.examination())
            figures.add(triangle);
        else
            System.out.println("Sides entered incorrectly!");
        return figures;
    }

    public ArrayList<Figure> addNewRectangle(Scanner iScanner) {
        String[] letters = new String[] { "a", "b" };
        int[] side = new int[2];
        int i = 0;
        for (String letter : letters) {
            System.out.printf("Input side %s in cm: ", letter);
            String temp = iScanner.next();
            if (Menu.isDigit(temp)) {
                if (Integer.parseInt(temp) > 0)
                    side[i++] = Integer.parseInt(temp);
            } else
                System.out.println("The number is invalid!");
        }
        Figure rec = new Rectangle(side[0], side[1]);
        figures.add(rec);
        return figures;
    }

    public ArrayList<Figure> addNewSquare(Scanner iScanner) {
        System.out.printf("Input side a in cm: ");
        String temp = iScanner.next();
        if (Menu.isDigit(temp)) {
            if (Integer.parseInt(temp) > 0) {
                Figure square = new Square(Integer.parseInt(temp));
                figures.add(square);
            }
        } else
            System.out.println("The number is invalid!");
        return figures;
    }

    public ArrayList<Figure> modifiedCircle(int index, Scanner iScanner) {
        System.out.println("Input radius in cm: ");
        String radiusCm = iScanner.next();
        if (isDigit(radiusCm)) {
            if (Double.parseDouble(radiusCm) > 0) {
                Figure circle = new Circle(Double.parseDouble(radiusCm));
                figures.set(index, circle);
            } else {
                System.out.println("Invalid number!");
            }
        } else {
            System.out.println("Invalid number!");
        }
        return figures;
    }

    public ArrayList<Figure> modifiedTriangle(int index, Scanner iScanner) {
        String[] letters = new String[] { "a", "b", "c" };
        int[] side = new int[3];
        int i = 0;
        for (String letter : letters) {
            System.out.printf("Input side %s in cm: ", letter);
            String temp = iScanner.next();
            if (Menu.isDigit(temp)) {
                if (Integer.parseInt(temp) > 0)
                    side[i++] = Integer.parseInt(temp);
            } else
                System.out.println("The number is invalid!");
        }
        Figure triangle = new Triangle(side[0], side[1], side[2]);
        if (triangle.examination())
            figures.set(index, triangle);
        else
            System.out.println("Sides entered incorrectly!");
        return figures;
    }

    public ArrayList<Figure> modifiedRectangle(int index, Scanner iScanner) {
        String[] letters = new String[] { "a", "b" };
        int[] side = new int[2];
        int i = 0;
        for (String letter : letters) {
            System.out.printf("Input side %s in cm: ", letter);
            String temp = iScanner.next();
            if (Menu.isDigit(temp)) {
                if (Integer.parseInt(temp) > 0)
                    side[i++] = Integer.parseInt(temp);
            } else
                System.out.println("The number is invalid!");
        }
        Figure rectangle = new Rectangle(side[0], side[1]);
        figures.set(index, rectangle);
        return figures;
    }

    public ArrayList<Figure> modifiedSquare(int index, Scanner iScanner) {
        System.out.printf("Input side a in cm: ");
        String temp = iScanner.next();
        if (Menu.isDigit(temp)) {
            if (Integer.parseInt(temp) > 0) {
                Figure square = new Square(Integer.parseInt(temp));
                figures.set(index, square);
            }
        } else
            System.out.println("The number is invalid!");
        return figures;
    }

    public void sort() {
        figures.sort(Comparator.comparingInt(o -> o.findArea()));
    }

    public ArrayList<Figure> delFigure(int index) {
        figures.remove(index);
        return figures;
    }

}
