package Zjazd4.Task8;

public class Maine {
    public static void main(String[] args) {
        Person person = new Person("Artur","Sz",12345);
        Person person1 = new Person("Artur","Sz",12345);
        Person person2 = new Person("Sabina","Os",54321);

        System.out.println(person.equals(person1));
        System.out.println(person1.equals(person2));

        System.out.println("*********************************");

        System.out.println(person.equals(person1));

    }
}
