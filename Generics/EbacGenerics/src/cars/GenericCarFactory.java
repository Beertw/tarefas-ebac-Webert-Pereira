package cars;

import java.util.List;

public class GenericCarFactory<T> extends CarFactory<T> {

    @Override
    public void createCar(List<T> listCar) {
        for (T car : listCar) {
            System.out.println("Car model: " + car);
        }
    }
}
