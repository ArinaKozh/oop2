package land;
public class Bear extends Predator implements Walkable{

    private int speed;
    public Bear(String name, int speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public String speak() {
        return "РРР";
    }

    @Override
    public int runSpeed() {
        return speed;
    }
    @Override
    public String toString() {
        return "Медведь: " + super.toString();
    }
}
