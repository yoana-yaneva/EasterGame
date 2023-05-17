import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        EasterBunny easterBunny = EasterBunny.getInstance();

        Basket basket = new Basket();
        Chick chick1 = new Chick("Little");
        Chick chick2 = new Chick("Sweettle");
        Chick chick3 = new Chick("Chippy");
        basket.addObserver(chick1);
        basket.addObserver(chick2);
        basket.addObserver(chick3);


        Random random = new Random();
        int numIterations = random.nextInt(10) + 1;
        System.out.println("The MAGIC BAG made " + numIterations + " eggs this year!");

        for (int i = 0; i < numIterations; i++) {
            Egg egg = EggFactory.produceRandomEgg();
            easterBunny.decorateAndAddEgg(basket, egg);
        }

        if (numIterations < 5) {
            System.out.println("The MAGIC BAG didn't produce enough eggs to fill the basket :(");
        }
    }
}