package com.example.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void testAddition() {
        Calculator math = new Calculator();
        int sum = math.add(2, 3);
        assertEquals(5, sum);
    }
}