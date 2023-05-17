public class ChickenEgg implements Egg{
    @Override
    public Egg produce() {
        System.out.println("Chicken egg that has been produced!" + "\n");
        return null;
    }


}
