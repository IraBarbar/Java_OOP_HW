import java.time.LocalDate;

public class Milk extends Food {

    private Double fatPercentge; // процент жирности

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param bestBeforeBest
     * @param fatPercentge
     */

    public Milk(String name, Double price, int count, LocalDate bestBeforeBest, Double fatPercentge) {
        super(name, price, count, bestBeforeBest);
        unit = "litr";
        this.fatPercentge = fatPercentge;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tfatPercentge=" + fatPercentge + ".\n";
    }

}
