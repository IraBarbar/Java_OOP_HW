import java.time.LocalDate;

public abstract class Wild extends Animal {
    private String habitat; // Место обитания
    private LocalDate dateFound; // Дата нахождения

    public Wild(int heightSm, int weightGramm, String eyeColor, String habitat, LocalDate dateFound) {
        super(heightSm, weightGramm, eyeColor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }

    @Override
    public String printInfo() {
        return "\theightSm=" + getHeightSm() + "sm, weight=" + getWeightGramm() / 1000 + "kg" + ", eyeColor="
                + getEyeColor() + "" +
                ",\n\thabitat=" + habitat + ", dateFound=" + dateFound + "";
    }

}
