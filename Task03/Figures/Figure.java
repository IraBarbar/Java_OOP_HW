public abstract class Figure  {
    public static Figure getRadiusCm;
    protected int area;

    // площадь:
    public int findArea() {
        if (examination())
            return area;
        else
            return 0;
    }

    public void printArea() {
        if (!examination())
            printNoExam();
        else
            System.out.printf("\tThe figure area = %d cm square.\n", findArea());
    }

    public boolean examination() {
        return true;
    }

    public void printNoExam() {
        if (!examination())
            System.out.println("The number is invalid!");
    }

    public void printInfo(){     
    }

    public static void setRadiusCm(Double a) {
    }

    public static Double getRadiusCm(double nextDouble) {
        return null;
    }
}
