package land;

public class Cow extends Herbivore implements Walkable{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Мууу";
    }

    @Override
    public int runSpeed() {
        return 20;
    }
    @Override
    public String toString() {
        return "Корова: " + super.toString();
    }
}
