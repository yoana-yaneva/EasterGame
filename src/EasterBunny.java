public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {}

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public void decorateAndAddEgg(Basket basket, Egg egg) {
        Egg decoratedEgg = egg.produce();
        basket.addEgg(decoratedEgg);
    }

}
