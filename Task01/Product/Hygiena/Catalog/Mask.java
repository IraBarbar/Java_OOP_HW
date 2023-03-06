public class Mask extends Hygiena{
    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param numOfPackage
     */

    public Mask(String name, Double price, int count, int numOfPackage) {
        super(name, price, count, numOfPackage);
    }

    @Override
    public String toString() {
        return super.toString() + ".\n";
    }
    
}
