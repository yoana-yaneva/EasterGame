class Chick implements Observer {
    private String name;

    public Chick(String name) {
        this.name = name;
    }

    public void update(int eggCount) {
        if (eggCount % 5 == 0) {
            System.out.println("[" + name + "]: The basket is full!");
        }
    }
}