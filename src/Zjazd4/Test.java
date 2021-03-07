package Zjazd4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Object> lista = new ArrayList<>();
        lista.add("dupa");
        lista.add(123);
        lista.add(12.2121);

        System.out.println("lista przyjmująca object : " + lista);

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(131313);
        lista1.add(121);
        lista1.add(Integer.valueOf("dupa"));
        System.out.println("lista przyjmująca Intiger : " + lista1);
    }
}

