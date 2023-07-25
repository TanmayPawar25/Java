package com.thealgorithms.others;

import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class StackPostfixNotationTest {
    @Test
    public void testGetWithNewObject() {
        final Map<String, Integer> testCases = Map.ofEntries(entry("1 1 +", 2), entry("2 3 *", 6), entry("6 2 /", 3), entry("5 2 + 3 *", 21));
        for (final var tc : testCases.entrySet()) {
            assertEquals(tc.getValue(), StackPostfixNotation.postfixEvaluate(tc.getKey()));
        }
    }
}
