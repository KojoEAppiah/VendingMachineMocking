public class VendingMachine {

    DisplayInterface display;

    public VendingMachine(DisplayInterface display){

        this.display = display;
    }
    public void pressButton() {
        display.showText();
    }
}
