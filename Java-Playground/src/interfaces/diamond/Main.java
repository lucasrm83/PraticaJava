package interfaces.diamond;

public class Main {
    public static void main(String[] args) {
        ComboDevice c = new ComboDevice("2048");
        c.processDoc("My research");
        c.print("My research");
        System.out.println("Scan results: "+c.scan());
    }
}
