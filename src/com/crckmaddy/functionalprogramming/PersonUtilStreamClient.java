package com.crckmaddy.functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class PersonUtilStreamClient {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "Female"),
                new Person("Bob", 30, "Male"),
                new Person("Charlie", 35, "Male"),
                new Person("Diana", 28, "Female")
        );



        //check all numbers are positive
        boolean isPositive = numbers.stream().allMatch(n -> n > 0);

        //check any number is divisible by 3
        boolean isDivisible = numbers.stream().anyMatch(n -> n % 3 == 0);

        //average age of people
        double averageAgeOfPeople = people.stream().mapToInt(Person::getAge).average().orElse(0.0);

        //grouping by gender
        Map<String, List<Person>> groupByGenderMap = people.stream().collect(Collectors.groupingBy(Person::getGender));

        //get list of names
        List<String> namesList = people.stream().map(Person::getName).toList();

        //filter people older than 30
        List<Person> peopleList = people.stream().filter(person -> person.getAge() > 30).toList();

        //sort numbers in desc order
        List<Integer> descNumList = numbers.stream().sorted(Comparator.reverseOrder()).toList();

        //get distinct numbers
        List<Integer> distinctNumList = numbers.stream().distinct().toList();

        //find first string start with b
        String resultString = strings.stream().filter(str -> str.startsWith("b")).findFirst().orElse(null);

        //join strings with comma
        String commaSeperatedString = strings.stream().collect(Collectors.joining(", "));

        //filter strings length larger than 5 chars
        List<String> strResult = strings.stream().filter(str -> str.length() > 5).toList();

        //converting strings to upper case
        List<String> uppercaseStrings = strings.stream().map(String::toUpperCase).toList();

        //count the numbers grater than 5
        long countResult = numbers.stream().filter(n -> n > 5).count();

        //find min num
        Integer minNum = numbers.stream().min(Integer::compare).get();

        //find max number
//        int maximumNumber = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        Integer maxNum = numbers.stream().max(Integer::compare).get();

        //sum of all numbers
        int sumOfAllNumbers = numbers.stream().mapToInt(Integer::intValue).sum();

        //square all numbers
        List<Integer> squareNumbers = numbers.stream().map(n -> n * n).toList();

        // Filter Even Numbers
        List<Integer> evenNumList = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumList);

    }

}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
