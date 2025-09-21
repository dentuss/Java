public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User("Alice", 1);

        Cart cart1 = new Cart();
        cart1.addProduct(new Product("Tablet", "Apple", 999));
        cart1.addProduct(new Product("Monitor", "LG", 350));

        u1.addCart(cart1);

        OnlineStore store = new OnlineStore();
        store.addUser(u1);

        for (Product p : cart1.getProducts())
        {
            System.out.println(p);
        }

        int totalProducts = OnlineStore.getTotalProductsInAllCarts(store.getUsers());
        System.out.println("Total products in all carts: " + totalProducts);

        System.out.println("Initial catalog: " + OnlineStore.getInitialCatalog());
    }
}
