package factory;

import cars.*;

public class ToyotaFactory implements TypeFactory {
    @Override
    public Sedan createSedan() {
        return new SedanCar();
    }

    @Override
    public SUV createSUV() {
        return new SUVCar();
    }

    @Override
    public Sport createSport() {
        return new SportCar();
    }

}
