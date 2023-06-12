package devDojo.excecoes.test;

import devDojo.excecoes.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB ="ssj";
        System.out.println("Usuario: ");
        String userDigitado = sc.nextLine();

        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();
        if(!usernameDB.equals(userDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou Senha inválidos! ");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
