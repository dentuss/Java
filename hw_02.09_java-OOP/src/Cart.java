import java.util.ArrayList;
import java.util.List;

public class Cart
{
    private List<Product> products;

    public Cart()
    {
        this.products = new ArrayList<>();
    }

    public Cart(List<Product> initialProducts)
    {
        this();
        this.products.addAll(initialProducts);
    }

    public void addProduct(Product product)
    {
        if (product != null)
        {
            products.add(product);
        }
        else
        {
            throw new IllegalArgumentException("Cannot add null product");
        }
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public double getTotalPrice()
    {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
