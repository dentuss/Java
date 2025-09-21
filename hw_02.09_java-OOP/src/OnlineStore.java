import java.util.ArrayList;
import java.util.List;

public class OnlineStore
{
    private List<User> users;
    private static String storeName;
    private static List<Product> initialCatalog;

    public OnlineStore()
    {
        this.users = new ArrayList<>();
    }

    public OnlineStore(List<User> initialUsers)
    {
        this();
        this.users.addAll(initialUsers);
    }

    public void addUser(User u)
    {
        users.add(u);
    }

    public List<User> getUsers()
    {
        return users;
    }

    public static int getTotalProductsInAllCarts(List<User> users)
    {
        int total = 0;
        for (User u : users)
        {
            for (Cart c : u.getCarts())
            {
                total += c.getProductCount();
            }
        }
        return total;
    }

    static
    {
        storeName = "My Online Store";
        initialCatalog = new ArrayList<>();
        initialCatalog.add(new Product("Laptop", "Dell", 1200));
        initialCatalog.add(new Product("Phone", "Samsung", 800));
        initialCatalog.add(new Product("Headphones", "Sony", 200));
        System.out.println(storeName + " initialized with default products.");
    }

    public static List<Product> getInitialCatalog()
    {
        return initialCatalog;
    }
}
