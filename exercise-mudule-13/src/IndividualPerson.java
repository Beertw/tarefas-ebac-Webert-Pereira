public class IndividualPerson extends Person {
    private String cpf;

    public IndividualPerson(String name, String cpf) {
        super(name, cpf); // document = CPF
        this.cpf = cpf;
    }

    @Override
    public void specificInfo() {
        System.out.println("This is an individual person with CPF: " + cpf);
    }
}
