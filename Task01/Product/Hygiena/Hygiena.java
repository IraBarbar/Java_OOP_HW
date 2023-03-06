public class Hygiena extends Product {
    /**
     * количество в упаковке
     */
    protected int numOfPackage;
    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param numOfPackage
     */
    public Hygiena(String name, Double price, int count, int numOfPackage) {
        super(name, price, count);
        unit = "piese";
        this.numOfPackage = numOfPackage;
    } 

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tnumOfPackage=" + numOfPackage + "";
    }
}
