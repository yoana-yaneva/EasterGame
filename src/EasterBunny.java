public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {
        // Private constructor to prevent direct instantiation
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    //Add dummy functionality
    public void open(String openBy) {
        System.out.println("The magic bag was opened by " + openBy + "!");
        System.out.println("Hmm.. What surprise does it have this year??");
    }

}
