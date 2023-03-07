import java.time.LocalDate;

public class Food extends Product {

    private LocalDate bestBeforeBest; // срок годности

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param bestBeforeBest
     */

    public Food(String name, Double price, int count, LocalDate bestBeforeBest) {
        super(name, price, count);
        unit = "piese";
        this.bestBeforeBest = bestBeforeBest;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tbestBeforeBest=" + bestBeforeBest + "";
    }
}
