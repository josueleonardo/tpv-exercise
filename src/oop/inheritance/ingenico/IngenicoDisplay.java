
package oop.inheritance.ingenico;

import oop.inheritance.core.TPVDisplay;

public class IngenicoDisplay implements TPVDisplay {

    private boolean lightTurnedOn;

    private IngenicoDisplay(){}

    private static class DisplayHolder{
        private static final IngenicoDisplay INSTANCE = new IngenicoDisplay();
    }

    public static IngenicoDisplay getInstance(){
        return DisplayHolder.INSTANCE;
    }

    public void showMessage(int x, int y, String message) {
    }

    @Override
    public void toggleLight() {
        lightTurnedOn = !lightTurnedOn;
    }

    public void clear() {

    }
}