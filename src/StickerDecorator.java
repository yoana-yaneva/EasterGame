public class StickerDecorator extends EggDecorator{
    public StickerDecorator(Egg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public Egg produce() {
        super.produce();
        return null;
    }
}