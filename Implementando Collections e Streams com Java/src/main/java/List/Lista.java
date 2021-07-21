package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //Declarando a lista
        List<String> nomes = new ArrayList<>();

        //Adicionando elementos a nossa lista com o método add
        nomes.add("Marcos");
        nomes.add("José");
        nomes.add("Caique");
        nomes.add("Janaina");
        nomes.add("Carla");

        //Mostrando no console os nomes da lista
        System.out.println("Lista: " + nomes);

        //Ordenando em ordem alfabética usando o método sort da classe Collections
        Collections.sort(nomes);

        //Mostrando no console agora com a lista ordenada
        System.out.println("Lista em ordem alfabética: " + nomes);

        //Alterando um dos elementos da lista com o método set
        nomes.set(2, "Agatha");
        System.out.println("Lista atualizada" + nomes);

        //Removendo um elemento usando o remove(pode receber tanto um indice quanto um elemento)
        nomes.remove(2);
        // Também poderia ser utilizado: nomes.remove("Agatha");
        System.out.println("Removendo a Agatha: " + nomes);

        //O método get retorna o valor do índice que for passado como parâmetro
        System.out.println("O valor na posição 0: " + nomes.get(0));

        //O método size retorna um inteiro com o número da quantidade de elementos da lista
        System.out.println("A lista tem o tamanho de: " + nomes.size());

        //O método contains vai retornar true ou false caso o parâmetro passado exista como elemento da lista
        System.out.println("A lista contem o nome Joaquim? " + nomes.contains("Joaquim"));

        //O método isEmpty retorna true ou false caso a lista esteja vazia ou não
        System.out.println("A lista não está vazia? " + !nomes.isEmpty());

        //O método indexOf recebe um parâmetro e te devolve o indice em que esse parâmetro se encontra na lista
        //Caso não exista o parâmetro dentro da lista, ele irá retornar -1
        System.out.println("A posição de José é: " + nomes.indexOf("José"));

        //O método clear limpa todos os elementos da lista
        nomes.clear();
        System.out.println("Bye bye lista: " + nomes);


    }
}
