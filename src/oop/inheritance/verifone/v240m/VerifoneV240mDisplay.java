package oop.inheritance.verifone.v240m;

import oop.inheritance.core.TPVDisplay;

public class VerifoneV240mDisplay implements TPVDisplay {

    private VerifoneV240mDisplay(){}

    private boolean lightTurnedOn;

    private static class DisplayHolder{
        private static final VerifoneV240mDisplay INSTANCE = new VerifoneV240mDisplay();
    }

    public static VerifoneV240mDisplay getInstance(){
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