package devDojo.pratica.test;

import devDojo.pratica.dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person1 = new Person("Lukaku",28,2300000.0);
        Person person2 = new Person("Roberto Carlos",22,320000.0);
        person1.withdraw(5000);
        person2.withdraw(200);
        System.out.println(person1);
        System.out.println(person2);
        person1.tax();

    }
}
