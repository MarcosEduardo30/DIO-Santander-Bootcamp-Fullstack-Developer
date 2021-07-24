package Comparators;

import java.util.*;

public class DesafioComparators {
    public static void main(String[] args) {

        //Criando uma lista e adicionando elementos a ela
        List<ContaBanco> contas = new ArrayList<>();
        contas.add(new ContaBanco("1234", "Marcelo", true));
        contas.add(new ContaBanco("4321", "Arnaldo", true));
        contas.add(new ContaBanco("9876", "Amanda", false));
        contas.add(new ContaBanco("6789", "Larissa", true));
        contas.add(new ContaBanco("3691", "Joaquim", false));

        //Ordenando a lista usando a regra que está na própria classe
        Collections.sort(contas);
        for (ContaBanco conta : contas){
            System.out.println(conta);
        }


        //Ordenando a lista usando a regra que estava em outra classe
        Collections.sort(contas, new OrdenacaoBanco());
        System.out.println("--------------------------------------------");
        for (ContaBanco conta : contas){
            System.out.println(conta);
        }


        //Ordenando a lista usando uma função lambda
        contas.sort((ContaBanco conta1, ContaBanco conta2) ->
        {int a = conta1.getNomeCliente().compareTo(conta2.getNomeCliente());
        return -a;});
        System.out.println("--------------------------------------------");
        for (ContaBanco conta : contas){
            System.out.println(conta);
        }

    }
}
