import java.util.Random;

public class ColorDecorator extends EggDecorator{
    public ColorDecorator(Egg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public Egg produce() {
        applyColor();
        return super.produce();
    }

    private void applyColor() {
        Random random = new Random();
        int colorIndex = random.nextInt(3);

        String[] stickers = {"Red", "Purple", "Green"};
        String selectedColor = stickers[colorIndex];

        System.out.println("---------------------------------");
        System.out.println("Applying " + selectedColor + " Color to the...");
    }
}