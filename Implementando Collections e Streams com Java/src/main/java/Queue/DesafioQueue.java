package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class DesafioQueue {
    public static void main(String[] args) {
        //Declarando e adicionando elementos a queue
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegando pela fila e mostrando os nomes
        for(String nome : nomes){
            System.out.println("-->" + nome);
        }

        //Retornando o primeiro item da fila sem removê-lo
        System.out.println("Primeiro item da fila: " + nomes.peek());

        //Retornando o primeiro item da fila e o removendo
        System.out.println("Primeiro item da fila removido: " + nomes.poll());

        //Adicionando um novo elemento e verificando sua posição
        nomes.add("Daniel");
        //Não consegui no momento achar uma solução para o retorno de um index dentro de um linked list. Volto aqui mais tarde.
        
        //Retornando o tamanho da lista
        System.out.println("O tamanho da lista é: " + nomes.size());

        //Verificando se a lista está vazia
        if (nomes.isEmpty()){
            System.out.println("A lista está vazia");
        } else {
            System.out.println("A lista não está vazia");
        };

        //Verificando se o nome carlos está na lista
        if (nomes.contains("Carlos")){
            System.out.println("A lista contém o nome Carlos");
        } else {
            System.out.println("A lista não contem o nome Carlos");
        }
    }
}
