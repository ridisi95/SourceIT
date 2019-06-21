package hw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {

    private List<Candy> candies = new ArrayList();

    public void showMeContent() {
        candies.stream().forEach(x -> System.out.println(x));
        System.out.println();
    }

    public void showWeight() {
        int sum = candies.stream().mapToInt(x -> x.getWeight()).sum();
        System.out.println("Gift weight is " + sum);
        System.out.println();
    }

    public void showCandyWhichHasTheSameSugarPerecent(int sugarPercent) {
        candies.stream().filter(x -> x.getPercentOfSugar() == sugarPercent).forEach(System.out::println);
        System.out.println();
    }

    public void putCandy(Candy candy) {
        this.candies.add(candy);
    }

    public void sortCandies() {
        Collections.sort(candies);
    }
}
