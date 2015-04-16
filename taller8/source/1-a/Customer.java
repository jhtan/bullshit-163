public class Customer {
    private String name;
    private String nit;

    public Customer (String name, String nit) {
        this.name = name;
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "NAME: " + name + "\tNIT: " + nit;
    }

    
}
