package com.Akshay;

public class InvokingGarbageCollector {
    public static void main(String[] args) {
        Test randomObj = new Test();

        // We are pointing the reference variable to new objects. Hence the old objects get destroyed by Garbage collector
        for(int i = 0; i < 1000000000; i++){
            randomObj = new Test();
        }
    }
}

class Test{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}
