public class Main {
    public static void main(String[] args) {
        AquariumFish anablep = new AquariumFish("Anablep anablep", "Four-eyed fish", 31.0, 25.0, "Insects ambushed at the surface of water.");

        System.out.println("Eneter the information of your fish.");
        System.out.println("Species name: " + anablep.getSpecies() + "\nCommon  Name: " + anablep.getCommonName() +
                "\nMaximum Temperature: " + anablep.getMaxTemp() + "\nMinimum Temperature: " + anablep.getMinTemp() +
                "\nDiet: " + anablep.getDiet());
    }
}
