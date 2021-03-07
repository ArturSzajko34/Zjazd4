package Niedziela.Task12;

import java.util.function.Predicate;

public class Anonimowa {

    public static void main(String[] args) {

//Zamianst robienia nowej klasy mog implementacj klasy anonimowej zrobic od razu w maine


        Predicate<Boolean> predicate1 = aBoolean -> {
            System.out.println(aBoolean);
            return !aBoolean;
        };
        predicate1.test(true);
    }
}
