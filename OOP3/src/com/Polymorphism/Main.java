package com.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();

        Shapes square2 = new Square();
        square2.area(); // Notice that the area function of the child class (Square) got executed.
                        // This is because the object type is used to determine which method to execute and not the reference variable type
                        // What method it is trying to access is defined by Reference variable type. And which method it is trying to access will be
                        // determined by the object variable (i.e. if you comment the method from the parent class, you wont be able to access
                        // the method of the child class) this is known as upcasting.

        Shapes square3 = new Square();
        //square3.test(); // This will result in error because the method is not present in the parent class. To access the test method,
                        // you will need to create a new object that is referenced by a variable of the child class
                        // Square square3 =  new Square()


    }
}
