package ConvertToBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToBinaryTest {
    @Test
    public void testToBinary() {
        assertEquals(1, ConvertToBinary.toBinary(1));
        assertEquals(10, ConvertToBinary.toBinary(2));
        assertEquals(11, ConvertToBinary.toBinary(3));
        assertEquals(101, ConvertToBinary.toBinary(5));
    }
}