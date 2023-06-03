package devDojo.Interfaces.test;

import devDojo.Interfaces.dominio.DataLoader;
import devDojo.Interfaces.dominio.DatabaseLoader;
import devDojo.Interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        fileLoader.remove();
        databaseLoader.remove();

        fileLoader.chekingPermission();
        databaseLoader.chekingPermission();

        DataLoader.retrieveMaxSize();
        databaseLoader.retrieveMaxSize();
    }
}
