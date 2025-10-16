import cars.GenericCarFactory;

import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        List<String> carModels = new ArrayList<>();
        carModels.add("Corolla");
        carModels.add("Civic");
        carModels.add("Fox");

        GenericCarFactory<String> factory = new GenericCarFactory<>();

        factory.createCar(carModels);
    }
}