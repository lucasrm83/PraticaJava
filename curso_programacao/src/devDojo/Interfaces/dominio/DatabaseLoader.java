package devDojo.Interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados...");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }

    @Override
    public void chekingPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
    public static void retrieveMaxSize(){
        System.out.println("Dentro do max size do databaseLoader");
    }
}
