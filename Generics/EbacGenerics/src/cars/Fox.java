package cars;

public class Fox extends Car {
    public Fox(int year) {
        super("Fox", year);
    }

    @Override
    public void printCars() {
        System.out.println("Model: " + getModel() + " - Year: " + getYear());
    }
}

