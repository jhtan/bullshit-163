import java.util.Comparator;
import java.util.Collections;
import java.util.Vector;
import java.util.HashMap;

public class RentSystem {
    private HashMap<Laptop, Customer> rent;
    private Vector<Laptop> laptop;
    private HashMap<String, Customer> customer;

    public RentSystem() {
        rent = new HashMap<Laptop, Customer> ();
        laptop = new Vector<Laptop> ();
        customer = new HashMap<String, Customer> ();
    }

    public void rent(Laptop laptop, Customer customer) {
        this.rent.put(laptop, customer);
    }

    public boolean isAvailable(Laptop laptop) {
        return this.rent.get(laptop) == null;
    }

    public void sortLaptops() {
        Collections.sort(this.laptop, new Comparator<Laptop>() {
                @Override
                public int compare(Laptop a, Laptop b) {
                    return a.getDamage().size() - b.getDamage().size();
                }
            });
    }

    public Laptop getAvailable() {
        for (int i=0; i<this.laptop.size(); i++) {
            if (this.rent.get(this.laptop.get(i)) != null) {
                return this.laptop.get(i);
            }
        }
        
        return null;
    }

    public void registerCustomer(Customer customer) {
        this.customer.put(customer.getCi(), customer);
    }

    public void registerLaptop(Laptop laptop) {
        this.laptop.add(laptop);
    }

    public void returnLaptop(Laptop laptop, Vector<String> newDamages) {
        laptop.getDamage().addAll(newDamages);
        rent.put(laptop, null);
    }
}
