package shopping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Order {

    private String number;
    private Date ordered;
    private Date shipped;
    private Address ship_to;
    private OrderStatus status;
    private float total;
    private Account account;
    private ArrayList<LineItem> lineItems;
    private ArrayList<Payment> payments;

    public Order(String number, Date ordered, Date shipped, Address ship_to, OrderStatus status, float total, Account account) {
        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.ship_to = ship_to;
        this.status = status;
        this.total = total;
        this.account = account;
        lineItems = new ArrayList<LineItem>();
        payments = new ArrayList<Payment>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public Address getShip_to() {
        return ship_to;
    }

    public void setShip_to(Address ship_to) {
        this.ship_to = ship_to;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public HashMap<LineItem, Integer> getLineIteams() {
        return lineIteams;
    }

    public void setLineIteams(HashMap<LineItem, Integer> lineIteams) {
        this.lineIteams = lineIteams;
    }

    public void addItem(LineItem lineItem){
        if (!lineItems.contains(lineItem))
            lineItems.add(lineItem);
    }

    public void removeItem(LineItem lineItem){
        if (lineItems.contains(lineItem))
            lineItems.remove(lineItem);
    }

    public void addPayment(Payment payment){
        if (!payments.contains(payment))
            payments.add(payment);
    }

    public void removePayment(Payment payment){
        if (payments.contains(payment))
            payments.remove(payment);
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }
}
