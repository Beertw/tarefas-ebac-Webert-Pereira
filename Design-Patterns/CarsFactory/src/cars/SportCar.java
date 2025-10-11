package cars;

public class SportCar implements Sport {

    @Override
    public void createCar() {
        System.out.println("You created a Sport car:" +
                "\nModel: " + SportModel.GR_SUPRA +
                "\nYear: 2026");
        System.out.println();
    }

}
