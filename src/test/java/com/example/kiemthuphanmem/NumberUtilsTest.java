package com.example.kiemthuphanmem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    // --- Test cases từ Issue #1 ---
    @Test
    public void testStatementCoverage() {
        int[] input = {2};
        int result = utils.countEvens(input);
        assertEquals(1, result);
    }

    // --- Test cases cho Issue #2: Path Coverage ---

    // Đường đi 1: Không chạy vòng lặp nào (mảng rỗng)
    @Test
    public void testPath_EmptyArray() {
        int[] input = {};
        int result = utils.countEvens(input);
        assertEquals(0, result, "Mảng rỗng nên trả về 0");
    }

    // Đường đi 2: Chạy qua vòng lặp, nhánh IF luôn SAI (không có số chẵn nào)
    @Test
    public void testPath_AllOdds() {
        int[] input = {1, 3, 5};
        int result = utils.countEvens(input);
        assertEquals(0, result, "Không có số chẵn nào, nên trả về 0");
    }

    // Đường đi 3: Chạy qua vòng lặp, nhánh IF có cả ĐÚNG và SAI
    @Test
    public void testPath_MixedNumbers() {
        int[] input = {1, 2, 3, 4};
        int result = utils.countEvens(input);
        assertEquals(2, result, "Có 2 số chẵn (2 và 4), nên trả về 2");
    }
}