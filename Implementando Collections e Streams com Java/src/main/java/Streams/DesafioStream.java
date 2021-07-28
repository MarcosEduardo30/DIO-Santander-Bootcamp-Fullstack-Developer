package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioStream {
    public static void main(String[] args) {

        //Criando uma lista de estudantes
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro", 19, "123"));
        estudantes.add(new Estudante("Carla", 25, "321"));
        estudantes.add(new Estudante("Joana", 16, "456"));
        estudantes.add(new Estudante("Luis", 15, "654"));
        estudantes.add(new Estudante("Helena", 30, "987"));
        estudantes.add(new Estudante("Bob", 14, "789"));

        //Transformando todos os estudantes em string e jogando para dentro de uma nova lista
        List<String> estudantesString = estudantes.stream()
                .map(aluno -> "Nome: " + aluno.nome + " - Idade: " + aluno.idade + " - Matricula: " + aluno.matricula)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("");

        //Usando o count para mostrar o número de elementos da lista
        System.out.println("O número de estudantes é: " + estudantes.stream()
        .count());
        System.out.println("");

        //Usando o filter para filtrar todos os estudantes com mais de 18 e depois um forEach para printálos na tela
        System.out.println("Os alunos com mais de 18 são: ");
        estudantes.stream()
                .filter(aluno -> aluno.idade > 18)
                .forEach(aluno -> System.out.println(aluno.nome + " - " + aluno.idade));
        System.out.println("");

        //Usando o forEach para printar todos os alunos
        System.out.println("Todos nossos alunos são: " );
        estudantes.stream().forEach(aluno -> System.out.println(aluno.nome));

        //Retornando todos os estudantes com a letra B
        System.out.println("Os estudantes com a letra B são: " + estudantes.stream()
            .filter(aluno -> aluno.nome.toLowerCase().contains("b"))
            .map(aluno -> aluno.nome)
            .collect(Collectors.toList()));

        //Retornando se tem pelo menos um aluno com a letra D
        System.out.println("Algum aluno possui a letra D? " + estudantes.stream()
            .anyMatch(aluno -> aluno.nome.toLowerCase().contains("d")));

        //Retornando o aluno mais velho
        System.out.println("O aluno mais velho é o: " + estudantes.stream()
            .max((aluno1, aluno2) -> aluno1.idade - aluno2.idade)
            .map(aluno -> aluno.nome + " - " + aluno.idade));

        //retornando o aluno mais novo
        System.out.println("O aluno mais novo é o: " + estudantes.stream()
            .min((aluno1, aluno2) -> aluno1.idade - aluno2.idade)
            .map(aluno -> aluno.nome + " - " + aluno.idade));





    }
}
