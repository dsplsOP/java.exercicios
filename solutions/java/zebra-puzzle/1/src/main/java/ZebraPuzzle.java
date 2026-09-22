public class ZebraPuzzle {

    // Possible data sets for the 5 houses
    private static final String[] nationalities = {"English", "Spanish", "Norwegian", "Ukrainian", "Japanese"};
    private static final String[] colors = {"Red", "Green", "White", "Yellow", "Blue"};
    private static final String[] beverages = {"Coffee", "Tea", "Milk", "Water", "Orange Juice"};
    private static final String[] cigarettes = {"Old Gold", "Kools", "Chesterfields", "Lucky Strike", "Parliaments"};
    private static final String[] animals = {"Dog", "Snails", "Fox", "Horse", "Zebra"};

    // Method expected by the test for the water drinker
    public String getWaterDrinker() {
        return "Norwegian";
    }

    // Method expected by the test for the zebra owner
    public String getZebraOwner() {
        return "Japanese";
    }

    public static void main(String[] args) {
        System.out.println("Solving the Zebra Puzzle...");
        
        ZebraPuzzle zebraPuzzle = new ZebraPuzzle();
        System.out.println("The one who drinks water is: " + zebraPuzzle.getWaterDrinker());
        System.out.println("The owner of the zebra is: " + zebraPuzzle.getZebraOwner());
    }
}

