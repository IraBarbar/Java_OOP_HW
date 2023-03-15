import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure implements Perimeter {

    List<Integer> sides;
    int index;

    public Polygon() {
        sides = new ArrayList<>();
        index = 0;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public boolean examination() {
        // TODO Auto-generated method stub
        return super.examination();
    }

    @Override
    public int findArea() {
        // TODO Auto-generated method stub
        return super.findArea();
    }

    @Override
    public void printArea() {
        // TODO Auto-generated method stub
        super.printArea();
    }

    @Override
    public void printInfo() {
        String[] letters = new String[] { "a", "b", "c", "d" };
        int i = 0;
        System.out.printf("\tSides:");
        for (Integer side : sides) {
            System.out.printf(" " + letters[i++] + " = " + side + "cm ");
        }
        System.out.println();
    }

    @Override
    public void printNoExam() {
        super.printNoExam();
    }

    @Override
    public Double findPerimeter() {
        return null;
    }

    @Override
    public void printPerimeter() {
        if (!examination())
            printNoExam();
        else
            System.out.printf("\tFigure perimeter = %.2fcm.\n", findPerimeter());
    }

}
