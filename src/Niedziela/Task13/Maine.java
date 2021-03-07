package Niedziela.Task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Maine {
    public static void main(String[] args) {

        List<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(new Employee("Artur",40,1000));
        pracownicy.add(new Employee("Jaro",50,2000));
        pracownicy.add(new Employee("Daro",60,6000));



        Employee najstarszy = pracownicy.stream().max(Comparator.comparing(employee -> employee.getAge())).get();

        Employee najmłodszy = pracownicy.stream().min(Comparator.comparing(employee -> employee.getAge())).get();

        Employee najmniejZarabia = pracownicy.stream().min(Comparator.comparing(employee -> employee.getSalary())).get();

        Employee najwiecejZarabia = pracownicy.stream().max(Comparator.comparing(employee -> employee.getSalary())).get();

        List<String> toNewListName = pracownicy.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(toNewListName);

        List<String> salalry5000 = pracownicy.stream()
                .filter(employee -> employee.getSalary() >5000)
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        System.out.println(salalry5000);



    }
}
