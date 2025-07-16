package com.crckmaddy.functionalprogramming;

import java.util.List;

public class SumAboveThreshold {
    public static int sumAboveThreshold(List<Integer> list, int thresholdNumber) {
        return list.stream().filter(n -> n > thresholdNumber)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
