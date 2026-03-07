package Projects.BookMyShow;

public class Payment {

    private String paymentId;
    private String paymentMethod;
    private int amount;
    private PaymentStatus paymentStatus;



    public Payment(String paymentId, String paymentMethod, int amount) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentStatus = PaymentStatus.IN_PROGRESS;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}

/*
Payment
paymentId
paymentStatus (ENUM)
amount
paymentMethod
 */
