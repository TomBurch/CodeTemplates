package clients.cashier;

import clients.ScreenPosition;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CashierView implements PropertyChangeListener {
    private CashierController controller = null;

    private static final int W = 400;
    private static final int H = 300;

    public CashierView() {
        JFrame frame = new JFrame("Cashier Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension pos = ScreenPosition.getPos();

        //cp.setLayout(null);
        frame.setSize(this.W, this.H);
        frame.setLocation(pos.width, pos.height);
        frame.setResizable(false);

        frame.setVisible(true);
    }

    public void setController(CashierController controller) {
        this.controller = controller;
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {

    }
}
