package Set;

import java.util.HashSet;
import java.util.Set;

public class DesafioSet {
    public static void main(String[] args) {
        //Declarando o hashset e adicionando elementos
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(3);
        inteiros.add(88);
        inteiros.add(20);
        inteiros.add(40);
        //Esse último elemento não será adicionado pois o HashSet não permite valores duplicados
        inteiros.add(3);

        //Mostrando os valores na tela
        for (int n : inteiros){
            System.out.println("----> " + n);
        }

        //Removendo o valor 3 - Lembrando que como o Hashset não tem ordem, não é possível remover o primeiro item
        inteiros.remove(3);
        System.out.println("Hashset após remover o valor 3: " + inteiros);

        //Adicionando o valor 23
        inteiros.add(23);
        System.out.println("Hashset após a adição do número 23: " + inteiros);

        //Verificando o tamanho do set
        System.out.println("O tamanho do hashset é: " + inteiros.size());

        //Verificando se o set está vazio
        if (inteiros.isEmpty()){
            System.out.println("O set está vazio");
        } else{
            System.out.println("O set não está vazio");
        }
    }
}
