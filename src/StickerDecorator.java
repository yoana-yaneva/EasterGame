import java.util.Random;

public class StickerDecorator extends EggDecorator{
    public StickerDecorator(Egg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public Egg produce() {
        applySticker();
        return super.produce();
    }

    private void applySticker() {
        Random random = new Random();
        int stickerIndex = random.nextInt(3);

        String[] stickers = {"Bird", "Rabbit", "Heart"};
        String selectedSticker = stickers[stickerIndex];

        System.out.println("---------------------------------");
        System.out.println("Applying " + selectedSticker + " Sticker to the...");
    }
}