package com.epam.demo;

import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UtilsTest {
    @Test
    public void testIsAllPositiveNumbers() {
        List<String> positiveNumbers = Arrays.asList("1", "2", "3");
        assertTrue(Utils.isAllPositiveNumbers(positiveNumbers));

        List<String> mixedNumbers = Arrays.asList("1", "-2", "3");
        assertFalse(Utils.isAllPositiveNumbers(mixedNumbers));
    }
}
