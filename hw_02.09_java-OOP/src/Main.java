public class Main
{
    public static void main(String[] args)
    {
        PhysicalProduct laptop = new PhysicalProduct("Laptop", "Dell", 1200, 2.5);
        DigitalProduct ebook = new DigitalProduct("E-book", "Amazon", 15, 5.2);

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(ebook);

        User user = new User("TEST", 1);
        user.addCart(cart);

        OnlineStore store = new OnlineStore();
        store.addUser(user);

        Purchasable[] items = { laptop, ebook };
        store.purchaseAll(items);

        System.out.println("Total in cart: $" + cart.getTotalPrice());
    }
}
