package oop.inheritance.ingenico;

public class IngenicoPrinter {

    private IngenicoPrinter(){}

    private static class PrinterHolder{
        private static final IngenicoPrinter INSTANCE = new IngenicoPrinter();
    }

    public static IngenicoPrinter getInstance(){
        return PrinterHolder.INSTANCE;
    }

    public void print(int x, String message) {

    }

    public void lineFeed() {
    }

}
