package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestExpt {

    // Test multiple powers for different bases, both positive and negative
    @Test
    public void testExptMultipleBases() {
        int[] bases = {2, -2, 3, -3};  // Test with different bases
        for (int base : bases) {
            int expected = 1;
            for (int power = 0; power <= 10; power++) {
                assertEquals(expected, SampleMethods.expt(base, power), 
                    base + "^" + power + " should be " + expected);
                expected *= base;  // Update expected for the next power
            }
        }
    }
}
