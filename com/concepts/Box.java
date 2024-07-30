package com.concepts.generics;

import java.util.Arrays;
import java.util.List;

//Generic Class
public class Box <T> {
    /*
        com.concepts.generics.Generics in Java is to create a Class, Interface and Methods with a Type parameter.
        It allows you to write code that can provide compile time TYPE safety.

        Benefits of com.concepts.generics.Generics :
        1. Type safety : com.concepts.generics.Generics provide compile time type safety.
        2. Code Reusability : You can write code which can work with various types.
        3. Type com.sunil.com.sunil.interview.concepts.casting : Eliminates explicit type com.sunil.com.sunil.interview.concepts.casting.

        Comments on Generic Type Usage
        *******************************
        T for General Purpose: Use T when the type can be any object and the method or class operates generically on this type.
        E for Collections: Use E for collection elements to indicate that the type is used for items in collections like List, Set, or Queue.
        K and V for Maps: Use K and V for keys and values in maps, making it clear what types are expected for map operations.
        S, U, V for Relationships: Use these when there is a need to represent multiple related types within the same method or class, especially when there are interactions between these types.

        https://medium.com/@barbieri.santiago/java-generics-class-level-vs-method-level-type-parameters-fb869af40d29#:~:text=Comments%20on%20Generic%20Type%20Usage,List%20%2C%20Set%20%2C%20or%20Queue%20.
     */
    private T size;

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
        System.out.println("Integer Box : " + box.getSize());

        Box<String> stringBox = new Box<>("10 Size");
        System.out.println("String Box : " + stringBox.getSize());

        Box<Boolean> booleanBox = new Box<>(true);
        System.out.println("Boolean Box : " + booleanBox.getSize());

        Box.printArray(new Integer[] {1,2,3,4});

        Box.printArray(new String[] {"One","Two","Three"});

        List<Integer> intList = Arrays.asList(11, 22, 33);
        List<String> stringList = Arrays.asList("apple", "banana", "orange");

        Box.printList(intList);
        Box.printList(stringList);
    }

    Box(T dimension){
        size = dimension;
    }

    public T getSize() {
        return size;
    }


    //Generic Method
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //Wildcards in Generics
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /*Bounded Generics :
      Upper Bound (by using extends word) : T extends Number or T entends Car or ? extends Shape
      Lower Bound (by using super word) : ? super T

        Examples:
        public <T extends Number> List<T> fromArrayToList(T[] a) {

        }

        public static void paintAllBuildings(List<Building> buildings) {
            buildings.forEach(Building::paint);
        }
    */

    //Generic Interfaces

    //Type Eraser concept
}