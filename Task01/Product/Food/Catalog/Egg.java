import java.time.LocalDate;

public class Egg extends Food {

    private int amountInPackage; // количество в упаковке

    /**
     * 
     * @param name
     * @param price
     * @param count
     * @param unit
     * @param bestBeforeBest
     * @param amountInPackage
     */

    public Egg(String name, Double price, int count, LocalDate bestBeforeBest, int amountInPackage) {
        super(name, price, count, bestBeforeBest);
        this.amountInPackage = amountInPackage;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n\t\tamountInPackage=" + amountInPackage + ".\n";
    }
}
