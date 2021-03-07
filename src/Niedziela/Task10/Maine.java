package Niedziela.Task10;

public class Maine {
    public static void main(String[] args) {

        Employee employee0 = new Employee("Marian","Zientarski",1987);
        Employee employee1 = new Employee("Marian","Zientarski",1987);
        Employee employee2 = new Employee("Artur","Bednarski",1900);


        System.out.println(employee0.equals(employee1));
        System.out.println(employee1.equals(employee2));

        System.out.println(employee0.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

    }
}
