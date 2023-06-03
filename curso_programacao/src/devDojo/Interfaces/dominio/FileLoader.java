package devDojo.Interfaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }
}
