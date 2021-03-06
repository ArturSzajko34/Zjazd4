package Zjazd4.Task9;

import java.util.Objects;

public class Person {

    private String name;
    private String sureName;
    private int pesel;


    public Person(String name, String sureName, int numberPesel) {
        this.name = name;
        this.sureName = sureName;
        this.pesel = numberPesel;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person person = (Person) obj;
            return this.pesel == person.pesel && this.sureName.equals(person.sureName);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,pesel) ;
    }

}
