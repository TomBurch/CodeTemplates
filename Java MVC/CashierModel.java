package clients.cashier;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CashierModel {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private String state = null;

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void setState(String newState) {
        String oldState = this.state;
        this.state = newState;
        this.pcs.firePropertyChange("state", oldState, newState);
    }
}
