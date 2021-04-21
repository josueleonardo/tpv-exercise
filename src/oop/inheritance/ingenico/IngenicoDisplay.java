package oop.inheritance.ingenico;

import oop.inheritance.TPV.Display;

public class IngenicoDisplay implements Display{

    private boolean lightTurnedOn;

    public IngenicoDisplay(){}

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
