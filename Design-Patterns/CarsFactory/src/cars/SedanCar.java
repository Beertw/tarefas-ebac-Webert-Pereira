package cars;

public class SedanCar implements Sedan {

    @Override
    public void createCar() {
        System.out.println("You created a Sedan car:" +
                "\nModel: " + SedanModel.CIVIC +
                "\nYear: 2025");
        System.out.println();
    }

}
