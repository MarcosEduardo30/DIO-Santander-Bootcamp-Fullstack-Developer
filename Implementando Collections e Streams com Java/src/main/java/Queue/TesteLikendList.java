package Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class TesteLikendList {
    public static void main(String[] args) {
        //Declarando uma linked list
        Queue<String> filaBanco = new LinkedList<>();

        //Adicionando elementos a nossa fila
        filaBanco.add("Jorge");
        filaBanco.add("Araujo");
        filaBanco.add("Eduarda");
        filaBanco.add("Paloma");
        filaBanco.add("Jéssica");

        //O peek retorna o elemento do topo da fila e não remove ele da fila. Retornando null caso a fila esteja vazia.
        System.out.println("Retornando o próximo da fila com o peek: " + filaBanco.peek());

        //O element retornan o elemento do topo da fila e não remove ele. Retornando uma exceção caso a fila esteja vazia.
        Queue<String> filaVazia = new LinkedList<>();
        try{
            System.out.println(filaVazia.element());
        } catch (NoSuchElementException a){
            System.out.println("A fila está vazia");
        }

        //O poll retorna o elemento do topo da fila e remove ele. Retornando null caso a fila esteja vazia.
        System.out.println("Retornando " + filaBanco.poll() + " e retirando ele da fila usando o poll");
        System.out.println("Fila após o poll: " + filaBanco);


    }
}
