import java.util.HashMap;

public class Storage {
    private HashMap <String, Item> items;

    public Storage() {
        items = new HashMap <String, Item> ();
    }

    public void addItem (Item item) {
        items.put(item.getCode(), item);
    }

    public Item getItem(String code) {
        return items.get(code);
    }
    
}
