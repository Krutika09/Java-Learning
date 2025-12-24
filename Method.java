// A method is a block of code that performs a specific task.
// Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.

public class Demo {

    public static void main(String[] args) {

        Demo d = new Demo();   // object बनाया
        d.printMessage();     // method call किया
    }

    //method 
    void printMessage() {
        System.out.println("Hello World");
    }
}
