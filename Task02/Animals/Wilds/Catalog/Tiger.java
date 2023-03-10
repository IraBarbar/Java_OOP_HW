import java.time.LocalDate;

public class Tiger extends Wild {

    @Override
    public String printInfo() {
        return super.printInfo() + ".\n";
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrrr....");
        
    }

    public Tiger(int heightSm, int weightGramm, String eyeColor, String habitat, LocalDate dateFound) {
        super(heightSm, weightGramm, eyeColor, habitat, dateFound);
    }
    
}
