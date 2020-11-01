package shopping;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingCart {

    private Date created;
    private WebUser webUser;
    //private ArrayList<LineItem> lineItems;

    public ShoppingCart(Date created, WebUser webUser) {

        this.created = created;
        this.webUser = webUser;
    }

    public void deleteShoppingCart(){

        // to add
    }
}
