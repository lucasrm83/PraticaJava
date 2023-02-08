import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Joao");
        lista.add("Carlos");
        lista.add("Henrique");
        lista.add("Arrascaeta");
        lista.add("Antonio");
        lista.add("marcelo");
        lista.add("Marcos");

        /*Adiciona ao index 2*/
        lista.add(1, "Rubinho");

        System.out.println(lista.size());


        System.out.println("--------------------");
        /*Compara se os strings são iguais e depois remove*/
        lista.remove("Joao");
        /*Remove o index 3*/
        lista.remove(2);

        lista.removeIf(x -> x.charAt(0) == 'M');

        for (String i: lista) {
            System.out.println(i);

        }
        

        /*Não funciona por causa do ConcurrentModificatioException, por estar modificando uma lista que esta sendo lida
        * Apesar de serem listas diferentes, apontam para o mesmo heap*/
        /*List<String> apagar = lista;
        for (String n: apagar) {
            System.out.println(n);
            if (n.charAt(0) == 'R'){
                lista.remove(n);
            }
            else {

            }


        }*/
        for (String i: lista) {
            System.out.println(i);

        }
        /*Mostra o indice comparando na lista*/
        System.out.println("Index of Rubinho: "+lista.indexOf("Rubinho"));
        /*Primeiro converte para stream, depois faz a operação lambda e depois volta para list usando o collect*/
        List<String> resultado = lista.stream().filter(x ->x.charAt(0)=='A').collect(Collectors.toList());
        for (String i: resultado) {
            System.out.println(i);

        }
        System.out.println("-------");

        /*Vai retornar o primeiro que comece com 'A', o find também tem o findall pra achar todos*/
        String nome = lista.stream().filter(x ->x.charAt(0)=='A').findFirst().orElse(null);
        /*System.out.println(nome);*/

        System.out.println("-----------");





    }
}
