package devDojo.polimorfismo.servico;

import devDojo.polimorfismo.repositorio.Repositorio;

public class ArquivoService implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo em arquivo");
    }
    public void relatorioArquivo(){
        System.out.println("Arquivo 70% cheio!");
    }
}
