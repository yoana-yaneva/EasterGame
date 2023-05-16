import java.util.Random;

public abstract class EggDecorator implements Egg {
    protected Egg decoratedEgg;

    public EggDecorator(Egg decoratedEgg){
        this.decoratedEgg = decoratedEgg;
    }

    @Override
    public void produce() {
        decoratedEgg.produce();
        applyStickerOrColor();
    }

    private void applyStickerOrColor() {
        Random random = new Random();
        int stickerChance = random.nextInt(10);

        if (stickerChance < 5) {
            System.out.println("Applying sticker to the egg");
        } else {
            System.out.println("Applying color to the egg");
        }
    }
}
