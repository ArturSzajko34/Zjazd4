package Zjazd4.Task1;

public class Maine {
    public static void main(String[] args) {

        Cat cat = new Cat();

        checkType("String");
        checkType(1.4644);
        checkType(12);
        checkType(cat);


    }

    public static void checkType(Object objects) {

        if (objects instanceof String) {
            System.out.println("Przekazany obiekt to: " + objects.getClass().getSimpleName());
        }
        else if (objects instanceof Double) {
            System.out.println("Przekazany obiekt to: " + objects.getClass().getSimpleName());
        }
        else if (objects instanceof Integer) {
            System.out.println("Przekazany obiekt to: " + objects.getClass().getSimpleName());
        }
        else {
            System.out.println("nieznany obiekt");
        }
    }
}


