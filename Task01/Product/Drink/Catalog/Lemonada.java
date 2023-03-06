public class Lemonada extends Drink {

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param volume
     */
    public Lemonada(String name, Double price, int count, double volume) {
        super(name, price, count, volume);
    }

    @Override
    public String toString() {
        return super.toString() + ".\n";
    }

}
