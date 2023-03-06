import java.time.LocalDate;

public class Bread extends Food {
    private String typeOfFlour;
    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param bestBeforeBest
     * @param typeOfFlour
     */
    public Bread(String name, Double price, int count, LocalDate bestBeforeBest, String typeOfFlour) {
        super(name, price, count, bestBeforeBest);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\ttypeOfFlour=" + typeOfFlour + ".\n";
    }

    public String getTypeOfFlour() {
        return typeOfFlour;
    }

    public void setTypeOfFlour(String typeOfFlour) {
        this.typeOfFlour = typeOfFlour;
    }

    
}
