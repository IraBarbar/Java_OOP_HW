
public class ChildensGood extends Product {
    private int minAge;
    private String hypoAllergenicity;
    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param minAge
     * @param hypoAllergenicity
     */

    public ChildensGood(String name, Double price, int count, int minAge, String hypoAllergenicity) {
        super(name, price, count);
        unit = "piese";
        this.minAge = minAge;
        this.hypoAllergenicity = hypoAllergenicity;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tminAge=" + minAge + ", hypoAllergenicity=" + hypoAllergenicity + "";
    }
    
}
