package users.main;

import users.application.User;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Idade: ");
        int age = sc.nextInt();
        System.out.println("Salário: ");
        double salary = sc.nextDouble();
        User user = new User(name,age,salary);
        System.out.println(user.toString());

    }
}
