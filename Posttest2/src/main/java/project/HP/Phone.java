package project.HP;
import java.text.DecimalFormat;

public final class Phone {
    private final String phoneName;
    private final String brand;
    private double price;

    public Phone(String phoneName, String brand, double price) {
        this.phoneName = phoneName;
        this.brand = brand;
        this.price = price;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedPrice = decimalFormat.format(price);

        return "Phone Name: " + phoneName + ", Brand: " + brand + ", Price: Rp " + formattedPrice;
    }

    public final void setPrice(double price) {
        this.price = price;
    }
}
    