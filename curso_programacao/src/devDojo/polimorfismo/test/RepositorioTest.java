package devDojo.polimorfismo.test;

import devDojo.polimorfismo.repositorio.Repositorio;
import devDojo.polimorfismo.servico.ArquivoService;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new ArquivoService();
        ArquivoService arquivoService = new ArquivoService();
        arquivoService.relatorioArquivo();
        repositorio.salvar();
    }
}
