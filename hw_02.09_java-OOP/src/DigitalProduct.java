public class DigitalProduct extends Product
{
    private double fileSize;

    public DigitalProduct(int id, String name, String brand, double price, double fileSize)
    {
        super(id, name, brand, price);
        this.fileSize = fileSize;
    }

    public double getFileSize()
    {
        return fileSize;
    }

    public void setFileSize(double fileSize)
    {
        this.fileSize = fileSize;
    }

    @Override
    public void purchase()
    {
        System.out.println("Purchased digital product: " + getName() + " - file size: " + fileSize + "MB");
    }
}
