package shopping;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    protected String accountId;
    protected String billingAddress;
    protected boolean isClosed;
    protected Date open;
    protected Date closed;
    protected int balance;
    protected ShoppingCart shoppingCart;
    protected ArrayList<Order> orders;
    protected ArrayList<Payment> payments;
    protected Customer customer;
    protected int object_id;

    public Account(String accountId, String billingAddress,int balance, int object_id) {
        this.accountId = accountId;
        this.billingAddress = billingAddress;
        this.isClosed = false;
        this.open = new Date();
        this.orders = new ArrayList<>();
        this.payments = new ArrayList<>();

    }

    public Customer getCustomer() {
        return customer;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public int getObject_id() {
        return object_id;
    }

    public void setObject_id(int object_id) {
        this.object_id = object_id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", isClosed=" + isClosed +
                ", open=" + open +
                ", closed=" + closed +
                ", balance=" + balance +
                ", shoppingCart=" + shoppingCart +
                ", orders=" + orders +
                ", payments=" + payments +
                ", customer=" + customer +
                ", object_id=" + object_id +
                '}';
    }

    public void addPayment(Payment payment){
        if (!payments.contains(payment))
            payments.add(payment);
    }

    public void addOrder(Order order){
        if (!orders.contains(order))
            orders.contains(order);
    }
}
