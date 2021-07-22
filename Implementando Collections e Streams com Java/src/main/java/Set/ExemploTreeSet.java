package Set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        //Declarando a arvore e adicionando seus elementos
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        System.out.println(treeCapitais);

        //Retornando o elemento no topo da arvore
        System.out.println("No topo da árvore temos: " + treeCapitais.first());

        //Retornando o elemento do fundo da arvore
        System.out.println("No fundo da árvore temos: " + treeCapitais.last());

        //Usando o método lower para retornar o elemento abaixo na árvore do elemento usado como parâmetro
        //Caso seja passado um elemento que não exista, ele retorna null
        System.out.println("Abaixo de florianópolis temos: " + treeCapitais.lower("Florianópolis"));

        //Usando o método higher para retornar o elemento acima na árvore do elemento usado como parâmetro
        System.out.println("Acima de Florianópolis temos: " + treeCapitais.higher("Florianópolis"));

        //Retorna o elemento no topo da árvore e o remove
        System.out.println("Removendo o elemento " + treeCapitais.pollFirst() + " do topo da árvore");
        System.out.println("Arvore após o poll: " + treeCapitais);
    }
}
