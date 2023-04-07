package water;

public class Pike extends Predator implements Bubblemakeable {

    int bubbles;
    public Pike(String name, int bubbles){
        super(name);
        this.bubbles = bubbles;

    }

    @Override
    public int speed() {
        return 25;
    }

    @Override
    public int bubbles() {
        return this.bubbles;
    }
}
