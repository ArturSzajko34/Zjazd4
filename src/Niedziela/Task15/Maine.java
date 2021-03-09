package Niedziela.Task15;

import Niedziela.Task14.Score;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Maine {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/Person.csv"));
        String line = reader.readLine();
        line = reader.readLine();// dodanie lini żeby czytał

        List<Person> listPerson = new ArrayList<>();


        while (line != null) {
            System.out.println(line);
            String[] value = line.split(",");

            String firstName = value[0].trim();
            String lastname = value[1].trim();
            Integer age = Integer.valueOf(value[2].trim());
            Integer height = Integer.valueOf(value[3].trim());
            Integer weight = Integer.valueOf(value[4].trim());

            Person person = new Person(age,firstName,lastname,height,weight);
            line = reader.readLine();
            listPerson.add(person);
        }

        reader.close();
        System.out.println(listPerson);

        System.out.println("**********Strem**************");

        List<Person> odNajstarszy = listPerson.stream()
                .sorted(Comparator.comparing(person -> person.getAge()))
                .collect(Collectors.toList());

        System.out.println(odNajstarszy);


        List<Person> odNajmłodszy = listPerson.stream()
                .sorted(Comparator.comparing(Person::getAge ).reversed())
                .collect(Collectors.toList());

        System.out.println(odNajmłodszy);


        List<Person> odNajniższy = listPerson.stream()
                .sorted(Comparator.comparing(person -> person.getHeight()))
                .collect(Collectors.toList());

        System.out.println(odNajniższy);


        List<Person> odNajwyższego = listPerson.stream()
                .sorted(Comparator.comparing(Person::getHeight).reversed())
                .collect(Collectors.toList());

        System.out.println(odNajwyższego);


        List<Person> jan = listPerson.stream()
                .filter(person -> person.getFirstName().equals("Jan"))
                .collect(Collectors.toList());

        System.out.println(jan);

        List<Person> vateusz = listPerson.stream()
                .filter(person -> person.getFirstName().equals("Vateusz"))
                .collect(Collectors.toList());

        System.out.println(vateusz);


        List<Person> bezPow = listPerson.stream()
                .filter(person -> Boolean.parseBoolean(person.getFirstName())).distinct()
                .collect(Collectors.toList());

        System.out.println(vateusz);


    }
}
