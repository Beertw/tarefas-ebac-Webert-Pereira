public class Main {
    public static void main(String[] args) {

        //Registering a client
        Client ben = new Client();
        ben.setName("Ben ex ex");
        ben.setCpf("123.456.789-11");
        ben.setAddress("Street Ex, n01");

        Client nath = new Client();
        nath.setName("Nath ex ex");
        nath.setCpf("321.456.789-11");
        nath.setAddress("Street Ex, n02");

        Client feliph = new Client();
        feliph.setName("Feliph ex ex");
        feliph.setCpf("999.456.789-11");
        feliph.setAddress("Street Ex, n03");

        Client lisa = new Client();
        lisa.setName("Lisa ex ex");
        lisa.setCpf("564.456.789-11");
        lisa.setAddress("Street Ex, n04");

        //Registering products
        Product table = new Product();
        table.setName("Table");
        table.setValue(500.00);
        table.setId("010-DD");

        Product door = new Product();
        door.setName("Door");
        door.setValue(200.00);
        door.setId("020-DD");

        Product airconditioning = new Product();
        airconditioning.setName("Air Conditioning");
        airconditioning.setValue(1000.00);
        airconditioning.setId("030-DD");

        Product wardrobe = new Product();
        wardrobe.setName("Wardrobe");
        wardrobe.setValue(750.00);
        wardrobe.setId("040-DD");

        //Resquest + Average of 4 clients
        Media requestBen = new Media();
        requestBen.setQuantity(2);
        double totalBen = table.getValue() * requestBen.getQuantity();
        System.out.printf("Client: %s\nRequest: %s\nId: %s\nQuantity: %d\nTotal value: $%.2f\n\n",
                ben.getName(),
                table.getName(),
                table.getId(),
                requestBen.getQuantity(),
                totalBen
        );

        Media requestNath = new Media();
        requestNath.setQuantity(1);
        double totalNath = airconditioning.getValue() * requestNath.getQuantity();
        System.out.printf("Client: %s\nRequest: %s\nId: %s\nQuantity: %d\nTotal value: $%.2f\n\n",
                nath.getName(),
                airconditioning.getName(),
                airconditioning.getId(),
                requestNath.getQuantity(),
                totalNath
        );

        Media requestFeliph = new Media();
        requestFeliph.setQuantity(1);
        double totalFeliph = wardrobe.getValue() * requestFeliph.getQuantity();
        System.out.printf("Client: %s\nRequest: %s\nId: %s\nQuantity: %d\nTotal value: $%.2f\n\n",
                feliph.getName(),
                wardrobe.getName(),
                wardrobe.getId(),
                requestFeliph.getQuantity(),
                totalFeliph
        );

        Media requestLisa = new Media();
        requestLisa.setQuantity(3);
        double totalLisa = door.getValue() * requestLisa.getQuantity();
        System.out.printf("Client: %s\nRequest: %s\nId: %s\nQuantity: %d\nTotal value: $%.2f\n\n",
                lisa.getName(),
                door.getName(),
                door.getId(),
                requestLisa.getQuantity(),
                totalLisa
        );

        //Media
        double totalMedia = (totalLisa + totalBen + totalFeliph + totalFeliph) / 4;
        System.out.printf("Avarege value of all purchases: $%.2f\n", totalMedia);

    }
}