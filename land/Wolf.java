package land;

public class Wolf extends Predator implements Walkable{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Уууррр";
    }

    @Override
    public int runSpeed() {
        return 40;
    }
    @Override
    public String toString() {
        return "Волк: " + super.toString();
    }
}