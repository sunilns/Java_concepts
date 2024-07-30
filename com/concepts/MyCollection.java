package com.concepts.collections;

import java.util.*;

//Generic Class
public class MyCollection {
    //Collection : List and subclasses
    static public List list1 = new ArrayList();
    LinkedList list2 = new LinkedList();
    Vector list3 = new Vector();
    Stack stack = new Stack();

    MyCollection(){
        list1.add("1");list1.add("2");list1.add("3");list1.add("4");
        list2.add("A");list2.add("B");list2.add("C");list2.add("D");
        list3.add("AA");list3.add("BB");list3.add("CC");list2.add("DD");
        stack.push("Ram");
    }
    public static void main(String[] args) {
        System.out.println(MyCollection.list1.stream().toString());
    }
}