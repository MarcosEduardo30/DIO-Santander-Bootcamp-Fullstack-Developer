package Maps;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
    public static void main(String[] args) {
        //Declarando o HashMap e adicionando seus elementos
        Map<String, String> cadastro = new HashMap<>();
        cadastro.put("João", "11987654321");
        cadastro.put("Maria", "6596257412");
        cadastro.put("André", "8793654541");
        cadastro.put("Flávia", "329832546");
        cadastro.put("Ricardo", "779462534");

        System.out.println(cadastro);

        //Atualizando um valor usando uma chave
        cadastro.put("André", "87999999999");
        System.out.println(cadastro);

        //Retornando os dados da Maria
        System.out.println("O telefone da Maria é: " + cadastro.get("Maria"));

        //Verificando se existe uma Carla no mapa
        if (cadastro.containsKey("Carla")){
            System.out.println("A Carla está no cadastro");
        } else {
            System.out.println("A Carla não está no cadastro");
        }

        //Removendo o João do mapa
        cadastro.remove("João");
        System.out.println("Cadastro sem o João: " + cadastro);

        //Retornando se alguém possui o telefone 99123456789
        System.out.println("O telefone 99 123456789 foi cadastrado? " + cadastro.containsValue("99123456789"));

        //Retornando o tamanho do mapa
        System.out.println("Existem " + cadastro.size() + " pessoas cadastradas");


        //Navegando pelo mapa
        for (Map.Entry<String, String> pessoa : cadastro.entrySet()){
            System.out.println(pessoa.getKey() + " - " + pessoa.getValue());
        }

    }
}
