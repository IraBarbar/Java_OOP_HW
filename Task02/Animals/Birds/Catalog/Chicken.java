
public class Chicken extends Bird {
    /**
     * 
     * @param heightSm
     * @param weightGramm
     * @param eyeColor
     * @param heightFlightSm
     */
    public Chicken(int heightSm, int weightGramm, String eyeColor, int heightFlightSm) {
        super(heightSm, weightGramm, eyeColor, heightFlightSm);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public int getHeightFlightSm() {
        return super.getHeightFlightSm();
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }

    @Override
    public void setHeightFlightSm(int heightFlightSm) {
        super.setHeightFlightSm(heightFlightSm);
    }

    @Override
    public void makeSound() {
        System.out.println("Co-Co-Co");   
    }


}
