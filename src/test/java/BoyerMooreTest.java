package test.java;

import org.junit.jupiter.api.Test;
import main.java.algorithms.BoyerMoore;

import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreTest {

    @Test
    public void testMajorityElementExists() {
        BoyerMoore bm = new BoyerMoore();
        int[] nums = {3, 3, 4, 2, 3, 3, 5, 3};
        assertEquals(3, bm.findMajorityElement(nums));
    }

    @Test
    public void testNoMajorityElement() {
        BoyerMoore bm = new BoyerMoore();
        int[] nums = {1, 2, 3, 4, 5};
        assertNull(bm.findMajorityElement(nums));
    }

    @Test
    public void testSingleElement() {
        BoyerMoore bm = new BoyerMoore();
        int[] nums = {10};
        assertEquals(10, bm.findMajorityElement(nums));
    }

    @Test
    public void testEmptyArray() {
        BoyerMoore bm = new BoyerMoore();
        int[] nums = {};
        assertNull(bm.findMajorityElement(nums));
    }

    @Test
    public void testAllSameElements() {
        BoyerMoore bm = new BoyerMoore();
        int[] nums = {7, 7, 7, 7, 7};
        assertEquals(7, bm.findMajorityElement(nums));
    }
}
