public class EggFactory {
    public Egg getEgg(String eggType) {
        if (eggType == null) {
            return null;
        }
        else if(eggType.equalsIgnoreCase("DINO")){
            return new DinoEgg();
        }

        return null;
    }
}
