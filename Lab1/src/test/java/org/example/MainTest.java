package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void problem1() {
        assertArrayEquals(new int[]{0, 1}, Main.problem1(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, Main.problem1(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, Main.problem1(new int[]{3, 3}, 6));
    }

    @Test
    void problem2() {
        assertTrue(Main.problem2(121));
        assertFalse(Main.problem2(-121));
        assertFalse(Main.problem2(10));
    }

    @Test
    void problem3() {
        assertEquals("fl", Main.problem3(new String[]{"flower","flow","flight"}));
        assertEquals("", Main.problem3(new String[]{"dog","racecar","car"}));
    }
}