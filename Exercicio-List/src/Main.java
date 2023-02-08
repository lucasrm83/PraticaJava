import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        System.out.println("Número de funcionários: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0;i<n;i++){
            System.out.println("Digite o id: ");
            Integer id = sc.nextInt();
            while (temId(lista,id)){
                System.out.println("Id já cadastrado!");
                id=sc.nextInt();

            }

            /*boolean teste = lista.contains(id);
            System.out.println(teste);*/
            /*while (lista.contains(id) == true){
                id = sc.nextInt();
            }*/
            /*while (lista.stream().filter(x ->x.getId()==id).findFirst().orElse(null)){
                id = sc.nextInt();
            }*/
            /*if (lista.contains(id)){
                System.out.println("Id já cadastrado!");

            }*/
            sc.nextLine();
            System.out.println("Digite o Nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o salario: ");
            double salario = sc.nextDouble();
            Funcionario func = new Funcionario(id,nome,salario);
            lista.add(func);
        }
        System.out.println("Digite o id a ser depositado: ");
        int idDeposito = sc.nextInt();
        Funcionario func = lista.stream().filter(x ->x.getId()==idDeposito).findFirst().orElse(null);
        if (func==null){
            System.out.println("Id inexistenten! ");
        }else {
            System.out.println("Digite a porcentagem do aumento: ");
            Double aumento = sc.nextDouble();
            func.aumentoSalario(aumento);

        }


        for (Funcionario f:lista) {
            System.out.println(f);

        }







    }
    public static boolean temId (List<Funcionario> lista, int id){
        Funcionario func = lista.stream().filter(x ->x.getId()==id).findFirst().orElse(null);
        return func != null;

    }


}