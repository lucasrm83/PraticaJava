package devDojo.Interfaces.dominio;

public interface DataLoader {

    int MAX_DATA_SIZE =10;
    void load();
    default void chekingPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    static void retrieveMaxSize(){
        System.out.println("Dentro do max size da interface");
    }
}
