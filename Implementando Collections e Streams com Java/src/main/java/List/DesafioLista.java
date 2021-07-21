package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesafioLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        //Adicionando 5 nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegando na lista
        for (String nome : nomes){
            System.out.println("---" + nome);
        }

        //Substituindo Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        //Retornando o nome na posição 1
        System.out.println(nomes.get(1));

        //Retornando o nome na posição 4
        System.out.println(nomes.get(4));

        //Removendo o nome João
        nomes.remove("João");
        System.out.println(nomes);

        //Retorna a quantidade de itens na lista
        System.out.println("A lista tem o tamanho de: " + nomes.size());

        //Verificando se Juliano existe na lista
        System.out.println(nomes.contains("Juliano"));

        //Criando uma nova lista
        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");
        novosNomes.addAll(nomes);
        System.out.println(novosNomes);

        //Ordenando em ordem alfabética
        Collections.sort(novosNomes);
        System.out.println(novosNomes);

        //Verificando se a lista está vazia
        System.out.println(novosNomes.isEmpty());

    }
}
