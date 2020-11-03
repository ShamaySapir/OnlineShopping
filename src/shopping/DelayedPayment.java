package shopping;

import java.util.Date;

public class DelayedPayment extends Payment {

    private Date paymentDate;

    public DelayedPayment(String id, Date paid, float total, String detalis, Order order, Date paymentDate) {
        super(id, paid, total, detalis, order);
        this.paymentDate = paymentDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
