import java.util.Vector;

public class Bill {
    private Customer customer;
    private Vector<Item> bought;
    private Vector<Integer> quantity;

    public Bill() {
        customer = null;
        bought = new Vector<Item>();
        quantity = new Vector<Integer>();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addItem(Item item, int quantity) {
        bought.add(item);
        this.quantity.add(quantity);
    }

    public double computeTotal() {
        double total = 0;

        for (int i=0; i<bought.size(); i++) {
            total += bought.get(i).getSellingPrice() * quantity.get(i);
        }
        
        return total;
    }

    @Override
    public String toString() {
        String string = customer + "\n";

        for (int i=0; i<bought.size(); i++) {
            string += bought.get(i) + "\t" + quantity.get(i) + "\n";
        }

        return string + "TOTAL: \t" + computeTotal();
    }
}
