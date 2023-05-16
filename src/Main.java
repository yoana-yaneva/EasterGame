import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create the Easter Bunny singleton instance
        EasterBunny easterBunny = EasterBunny.getInstance();
        easterBunny.open("Easter Bunny");

        Random random = new Random();
        int eggsProduced = 0;

        while (eggsProduced < 5) {
            Egg randomEgg = getRandomEgg(random);
            randomEgg.produce();
            eggsProduced++;
            System.out.println("-------------------");
        }

//        Egg stickerEgg1 = new StickerDecorator(new DinoEgg());
//        stickerEgg1.produce();
    }

    private static Egg getRandomEgg(Random random) {
        int eggType = random.nextInt(3); // Generate a random number between 0 and 2

        return switch (eggType) {
            case 0 -> new StickerDecorator(new DinoEgg());
            case 1 -> new StickerDecorator(new ChickenEgg());
            case 2 -> new StickerDecorator(new QuailEgg());
            default -> throw new IllegalArgumentException("Invalid egg type");
        };
    }
}
