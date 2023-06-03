package devDojo.Interfaces.test;

import devDojo.Interfaces.dominio.DatabaseLoader;
import devDojo.Interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
