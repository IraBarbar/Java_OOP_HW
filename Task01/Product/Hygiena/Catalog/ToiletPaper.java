public class ToiletPaper extends Hygiena {

    private Integer numOfLayers; // количество слоев

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param numOfPackage
     * @param numOfLayers
     */
    public ToiletPaper(String name, Double price, int count, int numOfPackage, Integer numOfLayers) {
        super(name, price, count, numOfPackage);
        this.numOfLayers = numOfLayers;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tnumOfLayers=" + numOfLayers + ".\n";
    }

}
