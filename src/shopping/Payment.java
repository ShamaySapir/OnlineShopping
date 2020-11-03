package shopping;

import java.util.Date;

public abstract class Payment  {
    protected String id;
    protected Date paid;
    protected float total;
    protected String detalis;
    protected Order order;

    public Payment(String id, Date paid, float total, String detalis, Order order) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.detalis = detalis;
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalis() {
        return detalis;
    }

    public void setDetalis(String detalis) {
        this.detalis = detalis;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
