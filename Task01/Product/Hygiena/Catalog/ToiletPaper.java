public class ToiletPaper extends Hygiena {
    /**
     * 
     * количество слоев
     */
    private Integer numOfLayers;

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

    public Integer getNumOfLayers() {
        return numOfLayers;
    }

    public void setNumOfLayers(Integer numOfLayers) {
        this.numOfLayers = numOfLayers;
    }

}
