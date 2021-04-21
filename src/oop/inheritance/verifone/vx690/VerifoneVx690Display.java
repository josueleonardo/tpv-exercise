package oop.inheritance.verifone.vx690;

import oop.inheritance.TPV.Display;

public class VerifoneVx690Display implements Display{

    private boolean lightTurnedOn;

    private VerifoneVx690Display(){}

    private static class DisplayHolder{
        private static final VerifoneVx690Display INSTANCE = new VerifoneVx690Display();
    }

    public static VerifoneVx690Display getInstance(){
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
