package clients.cashier;

public class CashierController {
    private CashierModel model = null;
    private CashierView view = null;

    public CashierController(CashierModel model, CashierView view) {
        this.model = model;
        this.view = view;
    }
}
