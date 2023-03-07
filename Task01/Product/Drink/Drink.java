public class Drink extends Product {
    private double volume; // объем
    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param volume
     */

    public Drink(String name, Double price, int count, double volume) {
        super(name, price, count);
        unit = "litr";
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tvolume=" + volume + "";
    }

}
