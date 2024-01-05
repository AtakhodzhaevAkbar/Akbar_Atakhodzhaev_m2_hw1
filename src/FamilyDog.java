public class FamilyDog {
    private int age;
    private DogStatistics dogStatistic;
    private Color dogColor;

    public FamilyDog(int age, DogStatistics dogStatistic, Color dogColor) {
        this.age = age;
        this.dogStatistic = dogStatistic;
        this.dogColor = dogColor;
    }

    public int getAge() {
        return age;
    }

    public DogStatistics getDogStatistic() {
        return dogStatistic;
    }

    public Color getDogColor() {
        return dogColor;
    }
}
