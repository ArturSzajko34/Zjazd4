package Zjazd4.Task6;

public class SecondClass {

    private FirstClass firstClass = new FirstClass("1");
    static FirstClass firstClass1 = new FirstClass("2");
    {
        System.out.println("3");
    }

    static {
        System.out.println("4");
    }


    public SecondClass() {
        System.out.println("5 konstruktor");
    }

    int value = 1;

    static int value2 = 22;
}
