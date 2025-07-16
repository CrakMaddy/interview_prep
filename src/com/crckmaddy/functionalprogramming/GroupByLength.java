package com.crckmaddy.functionalprogramming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length));
    }
}
