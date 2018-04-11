import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FakeDisplay implements DisplayInterface {

    int numberOfInvocations = 0;
    String setTextArgument = "";
    String text;

    @Override
    public String showText() {
        numberOfInvocations++;
        return text;
    }

    public void whenShowTextIsCalledThenReturn(String text){
        this.text = text;
    }

    public void setText(String newText){
        numberOfInvocations++;
        setTextArgument = newText;
    }

    public void verifyThatShowTextWasCalled(){

        assertTrue(numberOfInvocations > 0);
    }

    public FakeDisplay verifyThatSetTextIsCalledWithGivenArgument(String itemName) {
        assertEquals(setTextArgument, itemName);
        return this;
    }

    public void times(int expectedInvocations) {
        assertEquals(expectedInvocations, this.numberOfInvocations);
    }
}
