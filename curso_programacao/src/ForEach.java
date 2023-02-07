public class ForEach {
    public static void main(String[] args) {
        String[] frutas = new String[] {"Manga","Banana","Maçã","Uva"};
        for (int i=0; i<frutas.length;i++){
            System.out.println(frutas[i]);
        }
        /* A sintaxe é: para cada string "f" em frutas: print f*/
        for (String f: frutas) {
            System.out.println(f);
            
        }
    }
}
