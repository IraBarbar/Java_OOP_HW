import java.time.LocalDate;

public class Cat extends Pet {

    private String presenceWool; // Наличие шерсти

    /**
     * 
     * @param heightSm
     * @param weightGramm
     * @param eyeColor
     * @param nickname
     * @param breed
     * @param vaccin
     * @param colorCoat
     * @param dateBirth
     * @param presenceWool
     */
    public Cat(int heightSm, int weightGramm, String eyeColor, String nickname, String breed, String vaccin,
            String colorCoat, LocalDate dateBirth, String presenceWool) {
        super(heightSm, weightGramm, eyeColor, nickname, breed, vaccin, colorCoat, dateBirth);
        this.presenceWool = presenceWool;
    }

    @Override
    public void showAffection() {
        System.out.println("I will sit on your lap");

    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow...");

    }

    public String getPresenceWool() {
        return presenceWool;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ",\n\tpresenceWool=" + presenceWool + ".\n";
    }

    @Override
    public void train() {
        // TODO Auto-generated method stub
    }

}
