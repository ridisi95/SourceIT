package HW6;

public class Main {

    public static void main(String args[]) {

        Candy cow = new Cow("cow", 7, 90);
        Candy gelatin = new Gelatin("gelatin", 4, 50);
        Candy caramel = new Caramel("caramel", 5, 75);

        Gift gift = new Gift();

        gift.putCandy(cow);
        gift.putCandy(gelatin);
        gift.putCandy(caramel);

        gift.showMeContent();
        gift.sortCandies();
        gift.showMeContent();
        gift.showWeight();
        gift.showCandyWhichHasTheSameSugarPerecent(90);
    }
}