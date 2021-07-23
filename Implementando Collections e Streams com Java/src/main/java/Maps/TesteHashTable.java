package Maps;

import java.util.Hashtable;
import java.util.Map;

public class TesteHashTable {
    public static void main(String[] args) {

        //Criando nossa hashtable e inserindo valores nela
        Hashtable<String, String> cadastro = new Hashtable<>();
        cadastro.put("João", "11987654321");
        cadastro.put("Maria", "6596257412");
        cadastro.put("André", "8793654541");
        cadastro.put("Flávia", "329832546");
        cadastro.put("Ricardo", "779462534");
        System.out.println("Nossa Hashtable é: " + cadastro);

        //Removendo um dos elementos com o método remove
        cadastro.remove("Maria");
        System.out.println("Hashtable sem a Maria: " + cadastro);

        //Retornando o tamanho da HashTable
        System.out.println("A hashtable possui o tamanho de: " + cadastro.size());

        //Navegando pelo HashTable usando o for
        for (Map.Entry<String, String> pessoa : cadastro.entrySet()){
            System.out.println("-->" + pessoa);
        }


    }
}
