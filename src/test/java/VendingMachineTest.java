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

        vm.pressButton();

        display.verifyThatShowTextWasCalled();
    }
}
