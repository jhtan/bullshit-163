public class Item {
    private String name;
    private String code;
    private int inStock;
    private double sellingPrice;

    public Item(String name, String code, double sellingPrice) {
        this.name = name;
        this.code = code;
        this.inStock = 0;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return code + " " + name;
    }

    public void remove(int quantity) {
        inStock -= quantity;
        if (inStock < 0) {
            System.err.println(this + "'s stock is in negative numbers." +
                               "making an inventory is strongly recommended");
        }
    }

    public void add(int quantity) {
        inStock += quantity;
    }

    public String getCode() {
        return code;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
