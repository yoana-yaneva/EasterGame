public class DinoEgg implements Egg{
    @Override
    public Egg produce() {
        System.out.println("Dino egg has been produced!");
        return null;
    }

}
