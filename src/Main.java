import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        EasterBunny easterBunny = EasterBunny.getInstance();

        Basket basket = new Basket();
        Chick chick1 = new Chick("Chick1");
        Chick chick2 = new Chick("Chick2");
        Chick chick3 = new Chick("Chick3");
        basket.addObserver(chick1);
        basket.addObserver(chick2);
        basket.addObserver(chick3);

        for (int i = 0; i < 7; i++) {
            Egg egg = EggFactory.produceRandomEgg(); // Променете типа на яйцето според нуждите
            easterBunny.decorateAndAddEgg(basket, egg);
        }
    }
}