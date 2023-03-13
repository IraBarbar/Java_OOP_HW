public abstract class Figure {
    public Double area;

    // площадь:
    public Double findArea() {
        if (examination())
            return area;
        else
            return 0.0;
    }

    public void printArea() {
        if (!examination())
            printNoExam();
        else
            System.out.printf("\tThe figure area = %.2f cm square.\n", findArea());
    }

    public boolean examination() {
        return true;
    }

    public void printNoExam() {
        if (!examination())
            System.out.println("The number is invalid!");
    }

    public void findCircumference() {
    }

    public void printInfo(){     
    }

}
