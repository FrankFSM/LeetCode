package com.ralap.labuladong.basics.dynamic_programming;

import org.junit.Test;

import java.util.Arrays;

public class CoinChangeTest {

    @Test
    public void coinChange() {
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(Arrays.asList(1,2,5), 11);
    }
}