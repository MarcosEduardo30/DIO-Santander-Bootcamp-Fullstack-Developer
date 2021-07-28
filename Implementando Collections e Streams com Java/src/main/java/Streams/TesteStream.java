package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class TesteStream {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Marcelo");
        estudantes.add("Regiane");
        estudantes.add("Leonardo");
        estudantes.add("Cecília");
        estudantes.add("Joaquim");
        estudantes.add("Godofredo");
        estudantes.add("Caio");

        //O método count retorna o número de elementos que possui a lista
        System.out.println("Contagem: " + estudantes.stream().count());

        //O método max recebe um comparator e retorna o maior valor comparado
        System.out.println("Maior número de letras: " + estudantes.stream().max((estudante1, estudante2) -> estudante1.length() - estudante2.length()));

        //O método min é igual o max, só que retorna o menor
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //O filter recebe uma lógica como parâmetro e retorna todos os valores que deram true para aquela lógica
        System.out.println("Nomes com a letra r: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

        //O map executa um algoritmo para cada elemento da nossa lista(ou collection que você esteja usando) e devolve
        //um valor gerado por esse algoritmo
        System.out.println("Nomes com a quantidade de letras: " + estudantes.stream()
            .map((estudante) -> estudante.concat("-").concat(String.valueOf(estudante.length())))
            .collect(Collectors.toList()));

        //O método limit retorna os elementos da lista até um número determinado de vezes determinado pelo parâmetro
        System.out.println("Retornando os 5 primeiros estudantes: " + estudantes.stream()
        .limit(5)
        .collect(Collectors.toList()));

        //O peek executa uma função void que foi passada como parâmetro para cada elemento da lista e depois retorna a
        //própria lista sem modificação nenhuma
        System.out.println("Elementos printados pelo sout fora do peek: " + estudantes.stream()
        .peek(estudante -> System.out.println(estudante + " Printado pelo peek"))
        .collect(Collectors.toList()));

        //O for each é muito parecido com o peek, ele executa um algoritmo que retorna void que foi passado por parâmetro
        //para cada um dos elementos, porém diferente do peek ele irá retornar voide não a coleção novamente.
        System.out.println("Valores printados pelo for each: ");
        estudantes.stream().forEach(estudante -> System.out.println("--> " + estudante));

        //O allMatch irá executar uma lógica que retorna true ou false para todos os elementos da coleção e retornará true
        //apenas se todos eles retornarem true para a lógica, caso um ou mais retornem false, ele irá retornar false.
        System.out.println("Todos os nomes possuem a letra A? " + estudantes.stream()
        .allMatch(estudante -> estudante.toLowerCase().contains("a")));

        //O anyMatch executa da mesma forma que o allMatch, porém irá retornar true caso pelo menos um elemento retorne true
        //e false apenas se todos os elementos retornarem false.
        System.out.println("Algum nome tem a letra f? " + estudantes.stream()
        .anyMatch(estudante -> estudante.toLowerCase().contains("f")));

        //O noneMatch é o inverso do anyMatch, retornando true se todos os elementos retornarem false para a lógica
        //e false caso pelo menos um elemento retorne true para a lógica.
        System.out.println("Nenhum nome tem a letra K? " + estudantes.stream()
        .noneMatch(estudante -> estudante.toLowerCase().contains("k")));

        //O método findFirst pega o primeiro elemento da coleção e retorna ele
        //Você também pode botar o ifPresent(System.out::println) após o findFirst para executar a mesma coisa abaixo.
        Optional<String> primeiroEstundate = estudantes.stream()
                .findFirst();
        if (primeiroEstundate.isPresent()){
            System.out.println("O primeiro estudante da lista é: " + primeiroEstundate.get());
        }

        //Um exemplo de operações encadeadas
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante -> estudante.concat("-").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter(estudante -> estudante.toLowerCase().contains("n"))
        .collect(Collectors.joining(", ")));




    }
}
