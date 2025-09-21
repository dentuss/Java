public class PhysicalProduct extends Product
{
    private double weight;

    public PhysicalProduct(int id, String name, String brand, double price, double weight)
    {
        super(id, name, brand, price);
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public void purchase()
    {
        System.out.println("Purchased physical product: " + getName() + " - shipping weight: " + weight + "kg");
    }
}
