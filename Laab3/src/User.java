import java.util.ArrayList;
import java.util.List;
class User {
    private String username;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getPurchased() {
        return purchased;
    }

    public void setPurchased(List<Media> purchased) {
        this.purchased = purchased;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private List<Media> purchased;
    private List<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchased = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }

    public void checkout() {
        for (Media media : shoppingCart) {
            media.purchase(this);
        }
        purchased.addAll(shoppingCart);
        shoppingCart.clear();
    }

    public void addToPurchased(Media media) {
        purchased.add(media);
    }

}
