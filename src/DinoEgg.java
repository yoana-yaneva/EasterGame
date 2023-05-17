public class DinoEgg implements Egg{
    @Override
    public Egg produce() {
        System.out.println("Dino egg that has been produced!" + "\n");
        return null;
    }

}
