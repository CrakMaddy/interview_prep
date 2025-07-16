package com.crckmaddy.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSquare {
    public static List<Integer> filterAndSquare(List<Integer> numList) {
        return numList.stream().filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}
