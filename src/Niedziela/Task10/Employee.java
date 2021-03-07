package Niedziela.Task10;

import java.util.Objects;

public class Employee {

    private String name;
    private String sureName;
    private int birthDate;

    public Employee(String name, String sureName, int birthDate) {
        this.name = name;
        this.sureName = sureName;
        this.birthDate = birthDate;
    }


        @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
                Employee employee = (Employee) obj;
                return this.name.equals(employee.name) && this.sureName.equals(employee.sureName) && this.birthDate == employee.birthDate;
        }
        return super.equals(obj);
    }
}
