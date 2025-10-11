public abstract class Person {
    protected String name;
    protected String document;

    public Person(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Document: " + document);
    }

    public abstract void specificInfo();

}
