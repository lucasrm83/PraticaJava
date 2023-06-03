package devDojo.Interfaces.dominio;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }

    @Override
    public void chekingPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
