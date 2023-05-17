public class QuailEgg implements Egg{
    @Override
    public Egg produce() {
        System.out.println("Quail egg that has been produced!" + "\n");
        return null;
    }

}
