import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assume.*;

public class TestRunner {



    @Test
    public void trueAssumptionTest() {
        assertEquals(5 + 2, 7);
    }

    @SuppressWarnings({"all"})
    @Test
    public void falseAssumption() {
        assumeFalse(5 < 1);
        assertEquals(5 + 2, 7);
    }


}
