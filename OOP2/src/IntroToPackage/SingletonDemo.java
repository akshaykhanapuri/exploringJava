package IntroToPackage;

public class SingletonDemo {

    private SingletonDemo(){
        // We are overriding the default constructor by creating a private constructor so that multiple objects cannot be created.
    }

    private static SingletonDemo instance;

    public static SingletonDemo getInstance(){
        if(SingletonDemo.instance == null){
            SingletonDemo.instance = new SingletonDemo();
        }

        return SingletonDemo.instance;

    }
}


