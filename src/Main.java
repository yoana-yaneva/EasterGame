import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        EasterBunny easterBunny = EasterBunny.getInstance();
        easterBunny.open("Easter Bunny");

        int eggsProduced = 0;

        while (eggsProduced < 5) {
            Egg randomEgg = EggFactory.produceRandomEgg();
            randomEgg.produce();
            eggsProduced++;
            System.out.println("-------------------");
        }
    }
}
