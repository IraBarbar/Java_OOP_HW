public class Drink extends Product {
    /**
     * 
     * объем
     */
    protected double volume;

    public Drink(String name, Double price, int count, double volume) {
        super(name, price, count);
        unit = "litr";
        this.volume = volume;
    }

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param volume
     */



    public Drink(String name, Double price, int count) {
        super(name, price, count);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tvolume=" + volume + "";
    }

}
