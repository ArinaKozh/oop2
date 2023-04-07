package water;

public class Carp extends Herbivore implements Bubblemakeable {

    int bubbles;
    public Carp(String name, int bubbles){
        super(name);
        this.bubbles = bubbles;
    }

    @Override
    public int speed() {
        return 12;
    }

    @Override
    public int bubbles() {
        return this.bubbles;
    }
    
}
