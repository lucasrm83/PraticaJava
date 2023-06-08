package devDojo.polimorfismo.servico;

import devDojo.polimorfismo.repositorio.Repositorio;

public class MemoriaService implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvo em memoria");
    }
}
