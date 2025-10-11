import app.*;
import factory.*;


public class Main {

    private static Application configureApplication() {
        Application app;
        TypeFactory factory;
        factory = new BMWFactory();
        factory = new HondaFactory();
        factory = new ToyotaFactory();
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.createCar();
    }
}