package org.usfirst.frc.team125.robot.util.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.usfirst.frc.team125.robot.util.DebouncedBoolean;

public class DebouncedBooleanTest {
    private double minimumSeconds = 2.0;
    private double minimumLoops = (int)Math.ceil(minimumSeconds / 0.02);
    @Test
    public void testDebounceTrue() {
        DebouncedBoolean b = new DebouncedBoolean(minimumSeconds);

        //Do something with b to make it true
        for(int j = 0; j <= minimumLoops; j++) {
            b.update(true);
        }

        Assertions.assertTrue(b.get(), "Debounced should have been true.");

    }
}
