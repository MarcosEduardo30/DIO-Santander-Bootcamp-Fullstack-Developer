package Set;

import java.util.LinkedHashSet;

public class TesteLinkedHashSet {
    public static void main(String[] args) {

        //Declarando e adicionando valores ao linked hash set
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(10);
        System.out.println("A sequencia numérica é: " + sequenciaNumerica);
        //Obs: a ordem de inserção é a mesma que ele irá mostrar na tela

        //Removendo um dos elementos
        sequenciaNumerica.remove(8);
        System.out.println("Após remover o 8 fica: " + sequenciaNumerica);

        //Retornando o tamanho
        System.out.println("O linked hash set possui " + sequenciaNumerica.size() + " elementos");

        //Navegando pelos elementos
        for (int n : sequenciaNumerica){
            System.out.println("--->" + n);
        }

        //Verificando se está vazio
        System.out.println("Está vazio? " + sequenciaNumerica.isEmpty());
    }
}
