import java.util.ArrayList;
import java.util.List;

public class User
{
    private String name;
    private int userId;
    private List<Cart> carts;

    public User(String name, int userId)
    {
        this.name = name;
        this.userId = userId;
        this.carts = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public int getUserId()
    {
        return userId;
    }

    public List<Cart> getCarts()
    {
        return carts;
    }

    public void addCart(Cart cart)
    {
        carts.add(cart);
    }
}
