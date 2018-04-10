import static org.junit.Assert.assertTrue;

public class FakeDisplay implements DisplayInterface {

    int numberOfInvocations = 0;

    @Override
    public String showText() {
        numberOfInvocations++;
        return null;
    }

    public void verifyThatShowTextWasCalled(){

        assertTrue(numberOfInvocations > 0);
    }
}
