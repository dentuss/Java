import java.util.ArrayList;
import java.util.List;

public class OnlineStore
{
    private List<User> users;

    public OnlineStore()
    {
        this.users = new ArrayList<>();
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public List<User> getUsers()
    {
        return users;
    }

    public void purchaseAll(Purchasable[] items)
    {
        for (Purchasable item : items)
        {
            try
            {
                item.purchase();
            }
            catch (Exception e)
            {
                System.out.println("Failed to purchase item: " + item.getName());
            }
        }
    }
}
