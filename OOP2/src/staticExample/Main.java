package staticExample;

import IntroToPackage.SingletonDemo;

public class Main {
    public static void main(String[] args) {
        Human Akshay = new Human(27, "Akshay", 100, true);
        Human Rahul = new Human(27, "Rahul", 200, true);
        System.out.println(Akshay.population);
        System.out.println(Rahul.population);
        System.out.println(Human.population);

        // Singleton Demo
        SingletonDemo obj1 = SingletonDemo.getInstance();
        SingletonDemo obj2 = SingletonDemo.getInstance();
        SingletonDemo obj3 = SingletonDemo.getInstance();

        // Here only one obj is created for the class SingletonDemo and all the new objs are pointing to the same obj

    }
}
