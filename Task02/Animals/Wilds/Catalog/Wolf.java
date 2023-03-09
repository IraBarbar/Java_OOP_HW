import java.time.LocalDate;

public class Wolf extends Wild {

    private String leaderPack; // вожак стаи

    /**
     * 
     * @param heightSm
     * @param weightGramm
     * @param eyeColor
     * @param habitat
     * @param dateFound
     * @param leaderPack
     */
    public Wolf(int heightSm, int weightGramm, String eyeColor, String habitat, LocalDate dateFound,
            String leaderPack) {
        super(heightSm, weightGramm, eyeColor, habitat, dateFound);
        this.leaderPack = leaderPack;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\n\tleader of the pack " + leaderPack + ".\n" ;
    }

    @Override
    public void makeSound() {
        System.out.println("Uuuuuuu....");
        
    }

}
