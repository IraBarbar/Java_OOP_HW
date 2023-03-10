
public class Stork extends Bird {
    /**
     * 
     * @param heightSm
     * @param weightGramm
     * @param eyeColor
     * @param heightFlightSm
     */
    public Stork(int heightSm, int weightGramm, String eyeColor, int heightFlightSm) {
        super(heightSm, weightGramm, eyeColor, heightFlightSm);
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public int getHeightFlightSm() {
        // TODO Auto-generated method stub
        return super.getHeightFlightSm();
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }

    @Override
    public void makeSound() {
        System.out.println("I am a stork. I sing. ");

    }

}
