package cars;

public class Corolla extends Car {
    public Corolla(int year) {
        super("Corolla", year);
    }

    @Override
    public void printCars() {
        System.out.println("Model: " + getModel() + " - Year: " + getYear());
    }
}