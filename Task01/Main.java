import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Diaper diaper01 = new Diaper("Huggis", 16.39, 1, "piece",
                1, "no",
                4, 9, 14, "trussiky");
        Program.showProduct(diaper01);

        Dummy dummy01 = new Dummy("Canpol Babies", 4.99, 1,
                0, "yes");
        Program.showProduct(dummy01);

        Lemonada lem01 = new Lemonada("Fanta", 2.25, 1, 1);
        Program.showProduct(lem01);

        Bread brad01 = new Bread("My family", 1.89, 1,
                LocalDate.of(2023, 03, 20),
                "the best sort");
        Program.showProduct(brad01);

        Egg egg01 = new Egg("C-1", 3.89, 1,
                LocalDate.of(2023, 04, 10),
                10);
        Program.showProduct(egg01);

        Milk milk01 = new Milk("Sofiyka", 2.41, 1,
                LocalDate.of(2023, 03, 10), 3.2);
        Program.showProduct(milk01);

        Mask mask01 = new Mask("Mask", 0.80, 1, 2);
        Program.showProduct(mask01);

        ToiletPaper toiletPaper01 = new ToiletPaper("Vesta", 14.30, 1,
                8,
                4);
        Program.showProduct(toiletPaper01);
    }
}
