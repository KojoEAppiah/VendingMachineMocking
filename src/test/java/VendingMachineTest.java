import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VendingMachineTest {

    @Test
    public void aVendingMachineCanBeCreated(){

        VendingMachine vm = new VendingMachine(null);
        assertNotNull(vm);
    }

    @Test
    public void pressingVendingMachineButtonDisplaysText(){

        FakeDisplay display = new FakeDisplay();
        VendingMachine vm = new VendingMachine(display);

        display.whenShowTextIsCalledThenReturn("Something");
        vm.pressButton();

        display.verifyThatShowTextWasCalled();
    }

    @Test
    public void selectingColaResultsInDisplayDisplayingCola(){

        FakeDisplay display = new FakeDisplay();
        VendingMachine vm = new VendingMachine(display);

        vm.selectItem("Cola");

        display.verifyThatSetTextIsCalledWithGivenArgument("Cola");
    }

    @Test
    public void whenColaIsDispensedDisplayWillBeReset() {
        FakeDisplay display = new FakeDisplay();
        VendingMachine vm = new VendingMachine(display);

        vm.selectItem("Cola");

        display.verifyThatSetTextIsCalledWithGivenArgument("Cola").times(2);
    }
}
