package hw6;

public abstract class Candy implements Comparable<Candy> {

    protected String nameOfCandy;
    protected int weight;
    protected int percentOfSugar;

    public Candy(String nameOfCandy, int weight, int percentOfSugar) {
        this.weight = weight;
        this.percentOfSugar = percentOfSugar;
        this.nameOfCandy = nameOfCandy;
    }

    public int getWeight() {
        return weight;
    }

    public int getPercentOfSugar() {
        return percentOfSugar;
    }

    @Override
    public String toString() { // ink for learn:
        // http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
        return String.format("Name: %7s\t Weight: %d\t Persent of sugar: %s\t ", nameOfCandy, weight, percentOfSugar);
    }

    @Override
    public int compareTo(Candy anotherCandy) {
        return this.getWeight() - anotherCandy.getWeight();
    }
}
