public class ChickenEgg implements Egg{
    @Override
    public Egg produce() {
        System.out.println("Chicken egg has been produced!");
        return null;
    }


}
