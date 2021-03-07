package Zjazd.Task5;

public class Maine {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Person person = new Person();

        makeNoise(cat);
        makeNoise(dog);
//        makeNoise(person);

    }

    public static <T extends Animal> void makeNoise(T t) {
        t.makeNoise();
    }
}
