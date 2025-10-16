package cars;

public class Civic extends Car {
    public Civic(int year) {
        super("Civic", year);
    }

    @Override
    public void printCars() {
        System.out.println("Model: " + getModel() + " - Year: " + getYear());
    }
}
