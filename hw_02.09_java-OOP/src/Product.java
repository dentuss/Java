public class Product implements AutoCloseable
{
    private String name;
    private String brand;
    private double price;

    public Product(String name, String brand, double price)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Product(String name, String brand)
    {
        this(name, brand, 0.0);
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }

    public void setPrice(double price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
    }

    @Override
    public void close()
    {
        System.out.println("Product " + name + " is being disposed manually.");
    }

    @Override
    public String toString()
    {
        return brand + " " + name + " ($" + price + ")";
    }
}