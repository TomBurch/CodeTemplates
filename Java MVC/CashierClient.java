package clients.cashier;

import javax.swing.*;

public class CashierClient {
    public static void main(String args[]) {
        createGUI();
    }

    public static void createGUI() {
        CashierModel model = new CashierModel();
        CashierView view = new CashierView();
        CashierController controller = new CashierController(model, view);

        view.setController(controller);
        model.addPropertyChangeListener(view);
    }
}
