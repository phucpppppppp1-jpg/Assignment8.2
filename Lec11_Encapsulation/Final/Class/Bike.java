package Lec11_Encapsulation.Final.Class;

final class Bike {

    void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {

    void run() {
        System.out.println("running safely with100kmph");
    }

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}
