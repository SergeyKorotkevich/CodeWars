package TidyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TidyNumberTest {
    @Test
    public void Check_Small_Values()
    {
        assertTrue(TidyNumber.tidyNumber(12));
        assertFalse(TidyNumber.tidyNumber(32));
        assertTrue(TidyNumber.tidyNumber(39));
    }
    @Test
    public void Check_Larger_Values()
    {
        assertFalse(TidyNumber.tidyNumber(1024));
        assertFalse(TidyNumber.tidyNumber(12576));
        assertTrue(TidyNumber.tidyNumber(13579));
        assertTrue(TidyNumber.tidyNumber(2335));
    }
}