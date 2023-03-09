
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
        return "\theightSm=" + heightSm + ", weightGramm=" + weightGramm + ", eyeColor=" + eyeColor + "";
    }

}
