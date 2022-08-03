package IntroToPackage;

public class StaticBlockDemo {
    static int a = 4;
    static int b;

    // Static block can be thought of a function that will be executed only when the first object of the class will be created
    // i.e. when the class is loaded for the first time
    static{
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlockDemo obj1 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.a + " " + StaticBlockDemo.b);

        StaticBlockDemo.b += 3;
        System.out.println(StaticBlockDemo.a + " " + StaticBlockDemo.b);

        StaticBlockDemo obj2 = new StaticBlockDemo();
        System.out.println(StaticBlockDemo.a + " " + StaticBlockDemo.b);

    }
}
