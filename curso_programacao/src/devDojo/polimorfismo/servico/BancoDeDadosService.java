package devDojo.polimorfismo.servico;

import devDojo.polimorfismo.repositorio.Repositorio;

public class BancoDeDadosService implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar banco de dados");
    }
}
