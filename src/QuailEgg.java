public class QuailEgg implements Egg{
    @Override
    public Egg produce() {
        System.out.println("Quail egg has been produced!");
        return null;
    }

}
