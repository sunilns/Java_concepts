package com.sunil.com.sunil.interview.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        //Creating Streams
            //Create a Stream from Collection
            List<String> list = Arrays.asList("One", "two", "three", "four", "five", "six", "seven", "eight");
            Stream<String> myStringStream = list.stream();

            //Create a Stream from Array
            String[] arrayStrings = new String[]{"One", "two", "three", "four", "five", "six", "seven", "eight"};
            Stream<String> myStream = Arrays.stream(arrayStrings);

            //Create a Stream of Integers
            IntStream myIntStream = IntStream.range(1,5);


        //Intermediate Operations : These operations transform stream into another streams. They are lazy, meaning they dont execute until
        //a terminal operation is called on them. There are two types of operations can be performed on streams, Intermediate and Terminal.
        //Intermediate operations are : filter(), map(), sorted(),distinct(),limit(),skip().
            //Filtering and mapping example : Filtering strings starts with 's' and converting to Uppercase
            List<String> filteredList = myStringStream.filter(element -> element.startsWith("s"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println(filteredList);

            IntStream myEven = myIntStream.filter(element -> element%2 == 0);
            myEven.forEach(System.out::println);

            Stream<Integer> str = Stream.of(9,2,6,8,5,3,7,4,1);
            Stream<Integer> sortedStr = str.sorted();
            sortedStr.forEach(s -> System.out.print(s+"\t"));

        //Terminal Operations : These trigger the processing of elements and produce a result.
        // They are a final step in the Stream pipeline. They are Eager,mean they are executed immediately.
        //Some terminal operations are : forEach(), collect(), count(), reduce(), min(), max(), anyMatch(), allMatch(), noneMatch()
            //Iterating : forEach()
            Stream<Integer> str1 = Stream.of(9,2,6,8,5,3,7,4,1);
            str1.forEach(number -> System.out.print(number+"\t"));

            //Reducing : reduce() method is used to reduce the elements in a stream to a single value. It takes a identity value and
            //binary operator as argument, and returns the result applying the binary operator to the identity value and the elements in
            //stream
            Stream<Integer> str2 = Stream.of(9,2,6,8,5,3,7,4,1);
            Integer sum = str2.reduce(0, (num1, num2) -> num1 + num2);
            System.out.println("\nSum of all numbers : " + sum);

            List<Integer> str4 = Arrays.asList(2,1,465,3,50);
            System.out.println("Max number : " + str4.stream().max(Integer::compare).get());

       //Sequential Streams
            System.out.println("Sequential Stream : ");
            Stream<Integer> str3 = Stream.of(2,1,4,3,5);
            str3.forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));

       //Parallel Streams
            System.out.println("Parallel Stream : ");
            List<Integer> str5 = Arrays.asList(2,1,4,3,5);
            str5.parallelStream().forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
    }
}