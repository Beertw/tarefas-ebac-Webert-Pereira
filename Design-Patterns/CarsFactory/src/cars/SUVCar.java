package cars;

public class SUVCar implements SUV {

    @Override
    public void createCar() {
        System.out.println("You created a SUV car: " +
                "\nModel: " + SUVModel.BMW_X5 +
                "\nYear: 2022");
        System.out.println();
    }

}
