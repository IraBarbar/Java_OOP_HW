public abstract class Bird extends Animal implements Fly {

    private int heightFlightSm;

    /**
     * 
     * @param heightSm
     * @param weightGramm
     * @param eyeColor
     * @param heightFlightSm
     */

    public Bird(int heightSm, int weightGramm, String eyeColor, int heightFlightSm) {
        super(heightSm, weightGramm, eyeColor);
        this.heightFlightSm = heightFlightSm;
    }

    public int getHeightFlightSm() {
        return heightFlightSm;
    }

    public void setHeightFlightSm(int heightFlightSm) {
        this.heightFlightSm = heightFlightSm;
    }

    @Override
    public String printInfo() {
        if (heightFlightSm > 1000) {
            return super.printInfo() + "\n\tflight altitude=" + heightFlightSm / 1000 + "m.\n";
        } else
            return super.printInfo() + "\n\tflight altitude=" + heightFlightSm + "cm.\n";
    }

    @Override
    public void fly() {
        if (getHeightFlightSm() > 1000)
            System.out.printf("I'm flying at a height of %d m.\n", getHeightFlightSm() / 1_000);
        else
            System.out.printf("I'm flying at a height of %d centimeters.\n", getHeightFlightSm());

    }

}
