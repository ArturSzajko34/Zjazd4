package Zjazd4.Zadanie2;

public class Maine {
    public static void main(String[] args) {

        Animal animal = new Animal("orkiZMajorki");
        Dog dog = new Dog("Reksiu");
        Cat cat = new Cat("Nygus");

        bitePostman(animal);
        bitePostman(dog);
        bitePostman(cat);

    }

    public static void bitePostman(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bitePostman();
        }
    }
}
