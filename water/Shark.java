package water;

public class Shark extends Predator{
     public Shark(String name){
        super(name);
     }

    @Override
    public int speed() {
        return 19;
    }
}
