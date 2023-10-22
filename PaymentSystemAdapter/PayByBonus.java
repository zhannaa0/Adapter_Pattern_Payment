package PaymentSystemAdapter;

public class PayByBonus implements IPayByBonus {
    @Override
    public void payByBonuses() {
        System.out.println("Payment by bonuses successfully finished");
    }
}
