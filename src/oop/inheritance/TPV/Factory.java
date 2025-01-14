package oop.inheritance.TPV;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.vx520.VerifoneVx520Display;
import oop.inheritance.verifone.vx690.VerifoneVx690Display;

public class Factory {
    SupportedTerminal supportedTerminal;

    public Factory(SupportedTerminal supportedTerminal) {
        this.supportedTerminal = supportedTerminal;
    }

    public Display getDisplayInstance(){

        switch(supportedTerminal){
            case INGENICO:
                return (Display) IngenicoDisplay.getInstance();
            case VERIFONE_240:
                return (Display) VerifoneV240mDisplay.getInstance();
            case VERIFONE_520:
                return (Display) VerifoneVx520Display.getInstance();
            case VERIFONE_690:
                return (Display) VerifoneVx690Display.getInstance();
            default:
                return null;
        }
    }
}
