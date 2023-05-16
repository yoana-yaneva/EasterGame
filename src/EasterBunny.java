public class EasterBunny {
    private static EasterBunny instance;

    private EasterBunny() {
    }

    public static EasterBunny getInstance() {
        if (instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public void open(String openBy) {
        System.out.println("The magic bag was opened by " + openBy + "!"+ "\n");
        System.out.println("Hmm.. What surprise does it have this year??"+ "\n");
    }

}
