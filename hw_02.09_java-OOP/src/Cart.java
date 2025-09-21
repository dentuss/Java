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

    public void addProduct(Product p)
    {
        products.add(p);
    }

    public void removeProduct(Product p)
    {
        products.remove(p);
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public int getProductCount()
    {
        return products.size();
    }
}
