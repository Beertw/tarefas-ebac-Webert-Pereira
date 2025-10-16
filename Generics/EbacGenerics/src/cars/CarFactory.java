package cars;

import java.util.List;

abstract class CarFactory <T> {
    public abstract void createCar(List<T> listCar);
}
