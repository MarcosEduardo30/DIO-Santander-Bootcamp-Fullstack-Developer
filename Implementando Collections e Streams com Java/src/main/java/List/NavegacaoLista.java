package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NavegacaoLista {
    public static void main(String[] args) {
        //Declarando a lista e adicionando seus elementos
        List<String> nomes = new ArrayList<>();
        nomes.add("Marcos");
        nomes.add("José");
        nomes.add("Caique");
        nomes.add("Janaina");
        nomes.add("Carla");

        //Navegando pela lista usando o for each
        System.out.println("Com o for: ");
        for(String nome : nomes) {
            System.out.println("Na posição " + nomes.indexOf(nome) + " temos " + nome);
        }

        System.out.println("");

        //Podemos também navegar pela lista usando o método iterator e o while
        System.out.println("Com o while: ");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("Nome: " + iterator.next());
        }
    }

}
