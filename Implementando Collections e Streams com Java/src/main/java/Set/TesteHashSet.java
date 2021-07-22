package Set;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {
    public static void main(String[] args) {

        //Declarando um hashset e adicionando elementos a ele
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.0);
        notasAlunos.add(6.25);
        notasAlunos.add(8.0);
        notasAlunos.add(3.5);
        notasAlunos.add(9.7);
        System.out.println("As notas do aluno são: " + notasAlunos);
        //Obs: a ordem de inserção não importa para a ordem que ele irá printar na tela

        //Removendo a nota 3.5
        notasAlunos.remove(3.5);
        System.out.println("Removendo o 3.5 ficam: " + notasAlunos);

        //Retornando o tamanho do hashset
        System.out.println("O aluno possui " + notasAlunos.size() + " notas");

        //Navegando pelo hashset
        for (Double nota : notasAlunos){
            System.out.println("--->" + nota);
        }


        //Limpando o hashset e verificando se ele está vazio
        notasAlunos.clear();
        System.out.println("O hashset está vazio? " + notasAlunos.isEmpty());
    }
}
