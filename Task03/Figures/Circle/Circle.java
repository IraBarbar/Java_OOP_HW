
public class Circle extends Figure implements Circumference {
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
    public int findArea() {
        if (examination()) {
            area = (int) (Math.PI * Math.pow(radiusCm, 2));
            return area;
        }
        else
            return 0;
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

    public double getRadiusCm() {
        return radiusCm;
    }

    public void setRadiusCm(double radiusCm) {
        this.radiusCm = radiusCm;
    }


}
