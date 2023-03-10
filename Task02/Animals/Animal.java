
public abstract class Animal implements MakeSound, PrintInfo {
    private int heightSm; // рост - см.
    private int weightGramm; // вес - граммы
    private String eyeColor;

    public int getHeightSm() {
        return heightSm;
    }

    public int getWeightGramm() {
        return weightGramm;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Animal(int heightSm, int weightGramm, String eyeColor) {
        this.heightSm = heightSm;
        this.weightGramm = weightGramm;
        this.eyeColor = eyeColor;
    }

    @Override
    public String printInfo() {
        if (weightGramm > 1000)
            return "\theightSm=" + heightSm + ", weight=" + weightGramm / 1000 + "kg, eyeColor=" + eyeColor + "";
        else
            return "\theightSm=" + heightSm + ", weightGramm=" + weightGramm + ", eyeColor=" + eyeColor + "";
    }

}
