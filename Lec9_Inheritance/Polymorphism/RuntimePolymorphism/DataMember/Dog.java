package Lec9_Inheritance.Polymorphism.RuntimePolymorphism.DataMember;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks barks");
    }
    String source = "DaNang city";
}
