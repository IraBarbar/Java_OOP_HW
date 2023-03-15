public abstract class Figure  {
    public int area;

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
            System.out.printf("\tThe figure area = %dcm square.\n", findArea());
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

}
