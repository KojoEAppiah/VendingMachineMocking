import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    DisplayInterface display;

    Map<String, Double> itemPrices = new HashMap<>();


    public VendingMachine(DisplayInterface display){
        this.display = display;
        itemPrices.put("Cola", 1.00);
        itemPrices.put("Chips", 0.50);
        itemPrices.put("Candy", 0.65);
    }

    public void selectItem(String itemName){
        this.display.setText(itemName);
        this.display.setText(itemName);
    }

    public void pressButton() {
        String myText = display.showText();
        if(myText.equals("Hello"));
    }
}
