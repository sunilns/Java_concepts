package com.sunil.com.sunil.interview.concepts;

public class lambdaExample {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Case 1 : Using Cat object and calling interface method
        System.out.print("Case 1 : ");
        cat c1 = new cat();
        c1.print();

        //Case 2 : passing cat object and directly calling interface method without calling using Cat object
        System.out.print("Case 2 : ");
        printThing(c1);

        //Case 3 : Lambda way where no need of Cat object, lambdas allow us to passing just a specific implementation of method
        System.out.print("Case 3 : ");
        printThing(
                () -> {
            System.out.println("Meow!!!");
        }
        );
    }

    static void printThing(printable p1){
        p1.print();
    }
}

class cat implements printable {
    String name;
    String age;

    public cat(){
    }

    public void print(){
        System.out.println("Meow!!!");
    }

}

//Interface with only one abstract method : it can have default or static method, but only one abstract method
@FunctionalInterface
interface printable {
    void print();
}