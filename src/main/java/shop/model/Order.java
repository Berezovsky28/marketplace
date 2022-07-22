package shop.model;

public class Order {
    private Long id;
    private User user;
    private Product product;

    private Long generateId = 1000L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order(User user, Product product) {
        this.id = generateId;
        this.user = user;
        this.product = product;
        generateId++;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
