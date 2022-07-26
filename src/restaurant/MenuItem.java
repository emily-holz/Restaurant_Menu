package restaurant;

public class MenuItem {
    private boolean newItem;
    private double price;
    private String description;
    private String category;

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public MenuItem(boolean newItem, double price, String description, String category) {
        this.newItem = newItem;
        this.price = price;
        this.description = description;
        this.category = category;
    }
}
