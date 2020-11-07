package shopping;

import java.util.Date;

public class DelayedPayment extends Payment {

    private Date paymentDate;

    public DelayedPayment(int object_id, String id, Date paid, float total, String details, Date paymentDate) {
        super(id, paid, total, details,object_id);
        this.paymentDate = paymentDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "DelayedPayment{" +
                "paymentDate=" + paymentDate +
                ", id='" + id + '\'' +
                ", paid=" + paid +
                ", total=" + total +
                ", details='" + details + '\'' +
                ", order=" + order +
                ", account=" + account +
                ", object_id=" + object_id +
                '}';
    }
}
