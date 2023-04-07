package water;

public abstract class WaterAnimal implements Swimmable {
    private String name;

    public abstract String feed();

    public WaterAnimal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Кличка животного: %s\n", this.name))
                .append(String.format("Корм: %s\n", feed()))
                .append(String.format("Скорость: %s\n", speed()));

        return res.toString();

    }
}
