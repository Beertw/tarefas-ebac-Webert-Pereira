package cars;

public abstract class Car {

    private final String model;
    private final int year;

    public Car(String model, int year) {
        this.model = model;
        this. year  = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void printCars();

}
