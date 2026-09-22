public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int MinutesInOven) {
        return 40 - MinutesInOven;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers,int MinutesInOven) {
        return (layers * 2) + MinutesInOven;
    }
    
}
