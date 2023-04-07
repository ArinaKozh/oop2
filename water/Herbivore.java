package water;

public abstract class Herbivore extends WaterAnimal{
    public Herbivore(String name) {
        super(name);
    }
    @Override
    public String feed() {
        return "Водоросли";
    }

}
