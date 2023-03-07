
public class Diaper extends ChildensGood {
    // памперсы:
    private int size;
    private int minWeight;
    private int maxWeight;
    private String typeDiaper;

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param minAge
     * @param hypoAllergenicity
     * @param size
     * @param minWeight
     * @param maxWeight
     * @param typeDiaper
     */

    public Diaper(String name, Double price, int count, String unit, int minAge, String hypoAllergenicity, int size,
            int minWeight, int maxWeight, String typeDiaper) {
        super(name, price, count, minAge, hypoAllergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.typeDiaper = typeDiaper;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tsize=" + size + ", minWeight=" + minWeight + ", maxWeight=" + maxWeight
                + ", typeDiaper="
                + typeDiaper + ".\n";
    }
}
