class Chick implements Observer {
    private String name;

    public Chick(String name) {
        this.name = name;
    }

    public void update(int eggCount) {
        if (eggCount > 5) {
            System.out.println("[" + name + "] Яйцата са готови!");
        }
    }
}