import java.util.HashMap;
import java.util.Vector;

public class CashingSystem {
    private HashMap <String, Customer> customers;
    private Storage storage;
    private Bill currentBill;
    private Vector<Bill> bills;

    public CashingSystem() {
        customers = new HashMap <String, Customer> ();
        storage = new Storage();
        currentBill = null;
        bills = new Vector<Bill>();
    }

    public void newBill() {

        if (currentBill != null) {
            bills.add(currentBill);
        }

        this.currentBill = new Bill();
    }

    public Customer getCustomer(String nit) {
        return customers.get(nit);
    }

    public void setCustomerData(String nit, String name) {
        if (getCustomer(nit) == null) {
            customers.put(nit, new Customer(nit, name));
        }

        currentBill.setCustomer(customers.get(nit));
    }

    public void addItem(Item item, int quantity) {
        currentBill.addItem(item, quantity);
    }

    public void disposeCurrentBill() {
        this.currentBill = null;
    }

    public String printBill() {
        return currentBill.toString();
    }
}
