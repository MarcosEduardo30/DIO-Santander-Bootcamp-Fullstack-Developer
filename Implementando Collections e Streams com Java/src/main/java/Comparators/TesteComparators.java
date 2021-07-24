package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparators {
    public static void main(String[] args) {

        //Declarando e adicionando elementos a lista
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("José", 20));
        estudantes.add(new Estudante("Carlos", 35));
        estudantes.add(new Estudante("Michele", 18));
        estudantes.add(new Estudante("Cecília", 27));
        estudantes.add(new Estudante("Jenifer", 40));
        System.out.println("A lista em sua ordem de inserção: " + estudantes);

        //Ordenando a lista usando o método sort, passando como parâmetro uma lambda que explicita a regra de ordenação
        estudantes.sort((primeiroAluno, segundoAluno) -> primeiroAluno.getIdade() - segundoAluno.getIdade());
        System.out.println(estudantes);

        /*Usando o método compraingInt da classe Comparator, pedindo assim para que ele utilize uma lógica interna do método
        para organizar a lista usando os valores inteiros obtidos pelo get.Idade.
        Obs: o método reversed() pode ser usado para inverter a ordem da lista*/
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);


        /*A classe collections tem o método estático sort que organiza uma lista usando a regra de negócio que os objetos da lista
        Já tenham sobrescrito ao implementar a interface comparable*/
        Collections.sort(estudantes);
        System.out.println(estudantes);

        //Também podemos passar um segundo parâmetro com uma regra de negócio específica, não havendo mais a necessidade da sobrescrita dentro da própria classe
        Collections.sort(estudantes, new EstudandeRegraAlternativa());
        System.out.println(estudantes);
    }
}
