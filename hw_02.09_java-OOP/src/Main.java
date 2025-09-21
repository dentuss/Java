public class Main
{
    public static void main(String[] args)
    {
        PhysicalProduct laptop = new PhysicalProduct(1, "Laptop", "Dell", 1200, 2.5);
        DigitalProduct ebook = new DigitalProduct(2, "E-book", "Amazon", 15, 5.2);

        OnlineStore.ProductCatalog.addProduct(laptop);
        OnlineStore.ProductCatalog.addProduct(ebook);

        OnlineStore store = new OnlineStore();

        try
        {
            Product found = store.findProductById(1);
            System.out.println("Found: " + found);
        }
        catch (ProductNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Product missing = store.findProductById(99);
            System.out.println("Found: " + missing);
        }
        catch (ProductNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
