package devDojo.orientacaoaobjetos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;
    private double media =0;

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
        media = soma/salarios.length;
        System.out.println(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }



}
