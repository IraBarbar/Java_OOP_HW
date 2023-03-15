public class Rectangle extends Polygon {
    int a;
    int b;
    int c;
    int d;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        this.sides.add(a);
        this.sides.add(b);
        this.sides.add(c);
        this.sides.add(d);
    }

    @Override
    public boolean examination() {
        if (a == c && b == d && a > 0 && b > 0)
            return super.examination();
        else
            return false;
    }

    @Override
    public int findArea() {
        return a * b;
    }

    @Override
    public Double findPerimeter() {
        Double perimeter = (double) 2 * (a + b);
        return perimeter;
    }

    @Override
    public void printArea() {
        super.printArea();
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

}
