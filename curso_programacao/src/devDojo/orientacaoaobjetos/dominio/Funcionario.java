package devDojo.orientacaoaobjetos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salarios;

    public void imprimeDados(){
        System.out.println("-------");
        System.out.println(nome);
        System.out.println(idade);
        if (salarios!=null){
            for (double n: salarios){
                System.out.println(n);
        }

        }
        System.out.println("Media salarial: ");
        imprimeMediaSalario();
    }
    public void imprimeMediaSalario(){
        double soma =0;
        if (salarios == null){
            return;
        }
        for (double n:salarios) {
            soma+=n;

        }
        double media = soma/salarios.length;
        System.out.println(media);
    }
}
