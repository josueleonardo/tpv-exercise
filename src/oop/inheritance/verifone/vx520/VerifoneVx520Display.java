package oop.inheritance.verifone.vx520;

import oop.inheritance.TPV.Display;

public class VerifoneVx520Display implements Display {

    private  boolean lightTurnedOn;

    private VerifoneVx520Display(){}

    private static class DisplayHolder{
        private static final VerifoneVx520Display INSTANCE = new VerifoneVx520Display();
    }

    public static VerifoneVx520Display getInstance(){
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
