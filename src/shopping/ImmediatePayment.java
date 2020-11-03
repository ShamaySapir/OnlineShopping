package shopping;

import java.util.Date;

public class ImmediatePayment extends Payment{

    private boolean phoneConfirmation;

    public ImmediatePayment(String id, Date paid, float total, String detalis, Order order, boolean phoneConfirmation) {
        super(id, paid, total, detalis, order);
        this.phoneConfirmation = phoneConfirmation;
    }

    public boolean isPhoneConfirmation() {
        return phoneConfirmation;
    }

    public void setPhoneConfirmation(boolean phoneConfirmation) {
        this.phoneConfirmation = phoneConfirmation;
    }
}
