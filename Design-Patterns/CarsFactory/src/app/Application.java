package app;

import cars.*;
import factory.*;

public class Application {
    private final Sedan sedan;
    private final SUV suv;
    private final Sport sport;

    public Application(TypeFactory factory) {
        sedan = factory.createSedan();
        suv = factory.createSUV();
        sport = factory.createSport();
    }

    public void createCar() {
        sedan.createCar();
        suv.createCar();
        sport.createCar();
    }

}
