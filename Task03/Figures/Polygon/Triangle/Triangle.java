
public class Triangle extends Polygon {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sides.add(a);
        this.sides.add(b);
        this.sides.add(c);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public boolean examination() {
        if (a + b > c && a + c > b && c + b > a
                && a > 0 && b > 0 && c > 0)
            return super.examination();
        else
            return false;
    }

    @Override
    public int findArea() {
        Double p = ((double) (a + b + c)) / 2;
        int s = (int) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        return s;
    }

    @Override
    public void printArea() {
        super.printArea();
    }

    @Override
    public void printInfo() {        
        super.printInfo();
    }

    @Override
    public void printNoExam() {
        super.printNoExam();
    }

    @Override
    public Double findPerimeter() {
        if (examination()) {
            Double perimetr = (double) (a + c + b);
            return perimetr;
        } else
            return super.findPerimeter();
    }

    @Override
    public void printPerimeter() {
        super.printPerimeter();
    }

}
