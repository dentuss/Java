public abstract class Product implements Purchasable
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

    public String getName()
    {
        return name;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
        else
        {
            throw new IllegalArgumentException("Price must be non-negative");
        }
    }

    @Override
    public abstract void purchase();

    @Override
    public String toString()
    {
        return brand + " " + name + " ($" + price + ")";
    }
}
