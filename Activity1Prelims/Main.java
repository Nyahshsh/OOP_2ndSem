package Activity1Prelims;

public class Main {
    public static void main(String[] args) {
        Brassiere bra1 = new Brassiere();
        bra1.color = "Red";
        bra1.type = "Push-up";
        bra1.brand = "Avon";
        bra1.fabric = "Cotton";
        bra1.size = "AA";

        Brassiere bra2 = new Brassiere();
        bra2.color = "Black";
        bra2.type = "Lingerie";
        bra2.brand = "Victoria's Secret";
        bra2.fabric = "Lace";
        bra2.size = "D";

        bra1.printDescription();
        bra2.printDescription();
    }
}
