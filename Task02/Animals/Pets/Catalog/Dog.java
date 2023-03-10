import java.time.LocalDate;

public class Dog extends Pet {

private String training;
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
 * @param training
 */

public Dog(int heightSm, int weightGramm, String eyeColor, String nickname, String breed, String vaccin,
        String colorCoat, LocalDate dateBirth, String training) {
    super(heightSm, weightGramm, eyeColor, nickname, breed, vaccin, colorCoat, dateBirth);
    this.training = training;
}


@Override
public String printInfo() {
    return super.printInfo() + ",\n\ttraining-" + training + ".\n" ;
}

@Override
public void train() {
    System.out.println("I am trainable."); // Я поддаюсь дрессировке
    
}

@Override
public void showAffection() {
    System.out.println("I can be affectionate.");
    
}

@Override
public void makeSound() {
    System.out.println("Bow-wow...");
}


}
