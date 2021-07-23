package Maps;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TesteTreeMap {
    public static void main(String[] args) {

        //Declarando o tree map e inserindo valores nele
        TreeMap<String, String> cadastro = new TreeMap<>();
        cadastro.put("João", "11987654321");
        cadastro.put("Maria", "6596257412");
        cadastro.put("André", "8793654541");
        cadastro.put("Flávia", "329832546");
        cadastro.put("Ricardo", "779462534");
        System.out.println("A nossa arvore é: " + cadastro);

        //Mostrando o valor no topo da árvore com o método firstkey
        System.out.println("O valor no topo da árvore é: " + cadastro.firstKey());

        //Mostrando o valor no final da árvore com o método lastkey
        System.out.println("O valor no final da árvore é: " + cadastro.lastKey());

        //Retornando um valor que está abaixo da chave passada como parâmetro usando o lowerkey
        System.out.println("O valor que está abaixo de João é: " + cadastro.lowerKey("João"));

        //Podemos fazer o mesmo com o valor acima usando o higherkey
        System.out.println("O valor que está acima do João é: " + cadastro.higherKey("João"));

        //Retornando a primeira entrada(chave + elemento) com o método firstentry
        System.out.println("O primeiro valor completo da arvore é: " + cadastro.firstEntry());

        //Lembrando que podemos usar os métodos getkey e getvalue para pegar apenas o que quisermos de um firstentry
        System.out.println("O número cadastrado do primeiro valor da chave é: " + cadastro.firstEntry().getValue());

        //Igual ao firstentry, temos também o lastentry, higherentry e o lowerentry
        System.out.println("O valor completo acima de André é: " + cadastro.higherEntry("André"));

        //O método poll das treeset também existe em treemaps
        System.out.println("Removendo o elemento " + cadastro.pollFirstEntry() + " da árvore");

        //Navegando  árvore usando o for
        System.out.println("Navegando com o for");
        for (Map.Entry<String, String> pessoa: cadastro.entrySet()){
            System.out.println("-->" + pessoa);
        }

        //Navegando usando um iterator
        System.out.println("Navegando com um iterator");
        Iterator<String> iterator = cadastro.keySet().iterator();
        while (iterator.hasNext()){
            String chave = iterator.next();
            System.out.println("--->" + chave + "=" + cadastro.get(chave));
        }



    }
}
