public class Product {

    protected String name;
    protected Double price;
    protected int count;
    protected String unit; // единица измерения

    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     */

    public Product(String name, Double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return "\tname=" + name + ":" + "\n\t\tprice=" + price + ", count=" + count + ", unit=" + unit + "";
    }
}
