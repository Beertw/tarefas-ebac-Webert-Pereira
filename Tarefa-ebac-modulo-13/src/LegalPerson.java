public class LegalPerson extends Person {
    private String cnpj;

    public LegalPerson(String name, String cnpj) {
        super(name, cnpj);
        this.cnpj = cnpj;
    }

    @Override
    public void specificInfo() {
        System.out.println("This is a legal person with CNPJ: " + cnpj);
    }

}
