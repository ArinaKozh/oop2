package water;

public abstract class Predator extends WaterAnimal {
    public Predator(String name){
        super(name);
    }

    @Override
    public String feed() {
        return "Рыба";
    }
    
}
