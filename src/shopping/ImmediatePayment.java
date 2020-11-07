package shopping;

import java.util.Date;

public class ImmediatePayment extends Payment{

    private boolean phoneConfirmation;

    public ImmediatePayment(int object_id, String id, Date paid, float total, String details, boolean phoneConfirmation) {
        super(id, paid, total, details,object_id);
        this.phoneConfirmation = phoneConfirmation;
    }

    public boolean isPhoneConfirmation() {
        return phoneConfirmation;
    }

    public void setPhoneConfirmation(boolean phoneConfirmation) {
        this.phoneConfirmation = phoneConfirmation;
    }

    @Override
    public String toString() {
        return "ImmediatePayment{" +
                "phoneConfirmation=" + phoneConfirmation +
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
