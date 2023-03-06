
public class Dummy extends ChildensGood {
    //соска
    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param minAge
     * @param hypoAllergenicity
     */
    public Dummy(String name, Double price, int count,  int minAge, String hypoAllergenicity) {
        super(name, price, count, minAge, hypoAllergenicity);
    }



    @Override
    public String toString() {
        return super.toString() + ".\n\t\t";
    }
    
}
