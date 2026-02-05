package Lec8_ObjectsAndClasses.MethodOverloading.Order;

public class OverloadingExample3 {

    public static void printlnfo(String name, int age) {
        System.out.println("Name:" + name + ", Age:" + age);
    }

    public static void printlnfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

}
