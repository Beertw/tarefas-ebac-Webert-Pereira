import cars.*;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static <T extends Car> void listCars(List<T> cars) {
        for (T car : cars) {
            car.printCars();
        }
    }

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Civic(2015));
        cars.add(new Corolla(2022));
        cars.add(new Fox (2010));

        listCars(cars);

    }
}