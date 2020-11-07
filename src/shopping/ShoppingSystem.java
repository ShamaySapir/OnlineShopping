package shopping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ShoppingSystem {

    private HashMap<String, WebUser> webUsers; // String - (id) key
    private HashMap<String, Object> objects; // key - object id
    private HashMap<String, Supplier> suppliers; // key - supplier id
    private HashMap<String, Product> products; // key - product id

    private static int objectId = 0;

    private static WebUser activeWebUser;

    public ShoppingSystem() {
        this.webUsers = new HashMap<>();
        objects = new HashMap<>();
        ShoppingSystem.activeWebUser = null;

        // create default database

        this.addProduct("Bamba", "Bamba", "Moshe", "123");
        this.addProduct("Ramen", "Ramen", "Moshe", "123");

        this.addWebUser("Dani", "Dani123", "Israel", "Haifa", 100, "ShmuelHaNavi 3", "055425478512", "danibanani@post.bgu.ac.il", "ShmuelHaNavi 3", true);
        this.addWebUser("Dana", "Dana123", "Israel", "Ashdod", 100, "Rambam 8", "054832771", "danabanana@post.bgu.ac.il", "Rambam 8", true);

        activeWebUser = webUsers.get("Dana");
        addProductToAccount(products.get("Bamba"), 8,5);
        activeWebUser = null;
    }

    /**
     *Creates a web user in the system and sets to it a new account.
     */
    public void addWebUser(String loginId,String password, String country, String city, int balance, String street,String phone,String email,String billingAddress, Boolean isPremiumAccount){

        WebUser webUser = WebUser(loginId, password);
        Customer customer = new Customer(String.valueOf(objectId++), loginId, country, city, street, phone, email);

        Account account;
        if(isPremiumAccount)
            account = new PremiumAccount(String.valueOf(objectId++), billingAddress, balance);
        else
            account = new Account(String.valueOf(objectId++), billingAddress, balance);

        ShoppingCart shoppingCart = new ShoppingCart(String.valueOf(objectId++), new Date());

        shoppingCart.setAccount(account);
        account.setShoppingCart(shoppingCart);
        account.setCustomer(customer);
        customer.setAccount(account);
        customer.setWebUser(webUser);
        webUser.setCustomer(customer);

        objects.put(customer.getObjectId(), customer);
        objects.put(account.getObjectId(), account);
        objects.put(shoppingCart.getObjectId(), shoppingCart);
        objects.put(webUser.getObjectId(), webUser);
        webUsers.put(loginId, webUser);

    }

    public void removeWebUser(String id){

        if (activeWebUser.getLoginId().equals(id)){
            activeWebUser = null;
        }

        objects.remove(webUsers.getCustomer().getAccount().getShoppingCart().getObjectId());
        objects.remove(webUsers.getCustomer().getAccount().getObjectId());
        objects.remove(webUsers.getCustomer().getObjectId());
        objects.remove(webUsers.getObjectId());
        webUsers.remove(id);
    }

    public Boolean verifyLogin(String loginId, String password){

        if (webUsers.get(loginId).getPassword().equals(password)){

            webUsers.get(loginId).setUserState(UserState.ACTIVE);
            activeWebUser = webUsers.get(loginId);
            return true;
        }

        return false;
    }

    public String getActiveUser(){

        if (activeWebUser != null){
            return activeWebUser.getLoginId();
        }
        return "";
    }


    public void logOut(String Id){

        webUsers.get(Id).setUserState(UserState.NEW);
        activeWebUser = null;
    }

    public List<Product> showSellerProduct(String sellerId){

        Account seller = webUsers.get(sellerId).getCostumer().getAccount();

        if(seller instanceof PremiumAccount){
            return ((PremiumAccount) seller).getProducts();
        }

        return null;
    }

    public void addToShoppingCart(Product product, int quantity){

        LineItem lineItem = new LineItem(String.valueOf(objectId++), quantity, product);
        lineItem.setShoppingCart(activeWebUser.getShoppingCart());
        activeWebUser.getShoppingCart().addLineItem(lineItem);

        product.addLineItem(lineItem);
        lineItem.setProduct(product);

        objects.put(lineItem.getObjectId(), lineItem);
    }


    public Order getLastOrder(){

        List<Order> orders = activeWebUser.getCustomer().getAccount().getOrders();
        return orders.get(orders.size() - 1);
    }

    public void addProductToAccount(Product product, int quantity, int price){

        Account seller = activeWebUser.getCostumer().getAccount();

        if(seller instanceof PremiumAccount)
            ((PremiumAccount) seller).addProduct(product, quantity, price);
    }

    public void addProduct(String productName, String productId, String supplierName, String supplierId){

        Supplier supplier;
        if (!suppliers.containsKey(supplierId)) {
            supplier = new Supplier(String.valueOf(objectId++), supplierId, supplierName);
            suppliers.put(supplierId, supplier);
            objects.put(supplier.getObjectId(), supplier);
        }
        else
            supplier = suppliers.get(supplierId);

        Product product = new Product(String.valueOf(objectId++), productId, productName);

        supplier.addProduct(product);
        product.setSupplier(supplier);

        objects.put(product.getObjectId(), product);
        products.put(productId, product);
    }

    public void showObjectId(int objectId){

        System.out.println(objects.get(objectId).toString());
    }

    public void showAllObjects(){

        for (Object object: objects.values()) {
            System.out.println(object.toString());
        }
    }
}
