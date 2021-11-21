public class AnimalFood {
    private String name;
    private double price;
    private int quantity;
    private boolean isAvailable;

    public void foodPrint() {
        System.out.println("Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity + "\nAvailability: " + isAvailable);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
