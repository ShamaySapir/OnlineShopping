package shopping;

public class WebUser {
    private String loginId;
    private String password;
    private UserState state;
    private Customer customer;
    private ShoppingCart shoppingCart;

    public WebUser(String name, String password, UserState state, Customer customer) {

        this.loginId = name;
        this.password = password;
        this.state = state;
        this.customer = customer;
        this.shoppingCart = null;

    }
    public WebUser(String name, String password, UserState state, Customer customer, ShoppingCart shoppingCart){

        this.shoppingCart = shoppingCart;
        this.loginId = name;
        this.password = password;
        this.state = state;
        this.customer = customer;
    }

    public void addShoppingCart(ShoppingCart sc){

        if(shoppingCart == null){
            shoppingCart = sc;
        }
    }

    public void deleteWebUser(){
        shoppingCart.deleteShoppingCart();
    }
}
