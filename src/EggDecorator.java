import java.util.Random;

public abstract class EggDecorator implements Egg {
    protected Egg decoratedEgg;

    public EggDecorator(Egg decoratedEgg){
        this.decoratedEgg = decoratedEgg;
    }

    @Override
    public Egg produce() {
        decoratedEgg.produce();
        return decoratedEgg;
    }

    public void applyStickerOrColor() {
        Random random = new Random();
        int stickerChance = random.nextInt(10);

        if (stickerChance < 5) {
            StickerDecorator stickerDecorator = new StickerDecorator(decoratedEgg);
            stickerDecorator.produce();
        } else {
            ColorDecorator colorDecorator = new ColorDecorator(decoratedEgg);
            colorDecorator.produce();
        }
    }

}