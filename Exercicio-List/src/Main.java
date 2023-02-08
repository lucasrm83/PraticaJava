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

            //Testando manipulações diferentes

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
            System.out.println("Id inexistentente! ");
        }else {
            System.out.println("Digite a porcentagem do aumento: ");
            Double aumento = sc.nextDouble();
            func.aumentoSalario(aumento);

        }

        //Parte de busca sem usar lambda
        /*
        Integer pos =posicao(lista,idDeposito);
        if (pos==null){
            System.out.println("Id inexistentente! ");
        }else {
            System.out.println("Digite a porcentagem do aumento: ");
            Double aumento = sc.nextDouble();
            lista.get(pos).aumentoSalario(aumento);

        }*/

        for (Funcionario f:lista) {
            System.out.println(f);

        }



    }
    public static boolean temId (List<Funcionario> lista, int id){
        Funcionario func = lista.stream().filter(x ->x.getId()==id).findFirst().orElse(null);
        return func != null;

    }
    /*Busca por id sem usar lambda*/
    public static Integer posicao(List<Funcionario>lista,int id){
        for (int i = 0; i <lista.size() ; i++) {
            if (lista.get(i).getId()==id){
                return i;
            }
        }
        return null;

    }



}