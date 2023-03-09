
import java.time.LocalDate;

public abstract class Pet extends Animal implements ShowAffection, Train {

    private String nickname;
    private String breed; // Порода
    private String vaccin;
    private String colorCoat; // Цвет шерсти
    private LocalDate dateBirth;

    /**
     * 
     * @param heightSm
     * @param weightGramm
     * @param eyeColor
     * @param nickname
     * @param breed       //порода
     * @param vaccin
     * @param colorCoat   // цвет шерсти
     * @param dateBirth
     */
    public Pet(int heightSm, int weightGramm, String eyeColor, String nickname, String breed, String vaccin,
            String colorCoat, LocalDate dateBirth) {
        super(heightSm, weightGramm, eyeColor);
        weightGramm = getWeightGramm() / 1000;
        this.nickname = nickname;
        this.breed = breed;
        this.vaccin = vaccin;
        this.colorCoat = colorCoat;
        this.dateBirth = dateBirth;
    }

    @Override
    public String printInfo() {
        return "\theightSm=" + getHeightSm() + "sm, weight=" + getWeightGramm() / 1000 + "kg" + ", eyeColor="
                + getEyeColor() + "" + ",\n\tnickname=" + nickname + ", breed=" + breed + ", vaccin=" + vaccin
                + ",\n\tcolorCoat=" + colorCoat
                + ", dateBirth=" + dateBirth + "";
    }

}
