import java.util.Comparator;

public class Circle extends Figure implements Circumference, Comparator<Figure> {
    private double radiusCm;

    public Circle(double radiusCm) {
        this.radiusCm = radiusCm;
    }

    @Override
    public boolean examination() {
        if (radiusCm > 0 )
            return true;
        else
            return false;
    }

    @Override
    public void findCircumference() {
        if (!examination())
            printNoExam();
        else {
            Double circumference = 2 * Math.PI * radiusCm;
            System.out.printf("\tThe circumference = %.2f cm.\n", circumference);
        }
    }

    @Override
    public Double findArea() {
        if (examination())
            return Math.PI * Math.pow(radiusCm, 2);
        else
            return 0.0;
    }

    @Override
    public void printArea() {
        super.printArea();
    }

    @Override
    public void printNoExam() {
        super.printNoExam();
    }

    @Override
    public void printInfo() {
        System.out.println("\tThe radius of the circle = " + radiusCm + "cm.");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    
    public int compareTo(Figure o) {
        if (this.findArea() > o.findArea())
            return 1;
        else if (this.findArea() < o.findArea())
            return -1;
        else
            return 0;
    }

    @Override
    public int compare(Figure o1, Figure o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }

}
