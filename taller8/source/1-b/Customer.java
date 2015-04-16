public class Customer {
    private String name;
    private String ci;
    private String phone;

    public Customer(String name, String ci, String phone) {
        this.name = name;
        this.ci = ci;
        this.phone = phone;
    }

    public String getCi() {
        return ci;
    }
}
