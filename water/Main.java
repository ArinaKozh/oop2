package water;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Oceanarium oceanarium = new Oceanarium();
        Random rnd = new Random();
        oceanarium.addFish(new Carp("Немо", rnd.nextInt(10)));
        oceanarium.addFish(new Pike("Лена", rnd.nextInt(10)));
        oceanarium.addFish(new Shark("Кеша"));
        oceanarium.addFish(new Carp("Дора", rnd.nextInt(10)));

        oceanarium.showAll();
        System.out.println();
        oceanarium.bubblemaking();
        System.out.println();
        System.out.println();
        System.out.println("Чемпион по пусканию пузырей:");
        System.out.print(oceanarium.ChampionByBubbles());
        System.out.println();
        System.out.println("Чемпион по скорости:");
        System.out.print(oceanarium.ChampionBySpeed());
    }
}
