package com.crckmaddy.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //filter out the even numbers, and square the remaining odd numbers
        FilterAndSquare.filterAndSquare(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)).forEach(System.out::println);
        System.out.println("\n");

        //group by length
        List<String> words = Arrays.asList("cat", "dog", "apple", "bat", "antelope");
        Map<Integer, List<String>> groupByLength = GroupByLength.groupByLength(words);
        System.out.println(groupByLength+"\n");

        //find the first non-repeated character in the string
        Character character = FindFirstNonRepeatedChar.findFirstNonRepeatedCharacter("swiss");
        System.out.println(character+"\n");

        //compute the sum of all numbers greater than a given threshold
        int sumResult = SumAboveThreshold.sumAboveThreshold(Arrays.asList(4, 8, 9, 14, 16, 19), 12);
        System.out.println(sumResult);
    }
}
