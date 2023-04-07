package land;

public class Dolphin extends Predator implements Swimmable {

    public Dolphin(String name) {
        super(name); 
    }

    @Override
    public String speak() {
        return "Ультразвук";
    }

    @Override
    public String feed (){
        return "Рыба";
    }

    @Override
    public int Swimspeed() {
        return 50;
    }
    @Override
    public String toString() {
        return "Дельфин: " + super.toString();
    }
    
}