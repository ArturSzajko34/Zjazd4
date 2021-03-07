package Niedziela.Task11;

import java.util.function.Predicate;

public class Anonimowa {

    public static void main(String[] args) {

//Zamianst robienia nowej klasy mog implementacj klasy anonimowej zrobic od razu w maine

        Predicate<Boolean> predicate = new Predicate<Boolean>() { //interfejs finkcjonalny
            @Override
            public boolean test(Boolean aBoolean) {
                System.out.println(aBoolean);
                return !aBoolean;
            }
        };


        predicate.test(true);

    }



}
