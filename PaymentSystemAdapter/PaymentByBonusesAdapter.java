package PaymentSystemAdapter;

public class PaymentByBonusesAdapter implements IPayByBonus{
    private IPayByBonus iPayByBonus;

    public PaymentByBonusesAdapter(IPayByBonus iPayByBonus) {
        this.iPayByBonus = iPayByBonus;
    }
    @Override
    public void payByBonuses() {
        iPayByBonus.payByBonuses();
    }

}
