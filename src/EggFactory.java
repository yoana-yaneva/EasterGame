import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EggFactory {
    private static Egg getRandomEgg(Random random) {
        int eggType = random.nextInt(3);

        return switch (eggType) {
            case 0 -> new StickerDecorator(new DinoEgg());
            case 1 -> new StickerDecorator(new ChickenEgg());
            case 2 -> new StickerDecorator(new QuailEgg());
            default -> throw new IllegalArgumentException("Invalid egg type");
        };
    }

    public static Egg produceRandomEgg() {
        Random random = new Random();
        return getRandomEgg(random);
    }
}
